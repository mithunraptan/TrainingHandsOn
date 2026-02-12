package com.training.multithreading.telecomprocessingsystem;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Random;

public class CallQueue {
	

    Queue<CallRequest> queue = new LinkedList<>();
    double totalRevenue = 0;

    // Producer adds call
    synchronized void addCall(CallRequest request) {
        queue.add(request);
        notify();  // notify consumer
    }

    // Consumer processes call
    synchronized CallRequest getCall() throws InterruptedException {
        while (queue.isEmpty()) {
            wait(); // wait for producer
        }
        return queue.poll();
    }

    public static void main(String[] args) {

        CallQueue callQueue = new CallQueue();

        Customer c1 = new Customer("9001", 50);
        Customer c2 = new Customer("9002", 30);

        Map<String, Customer> customers = new HashMap<>();
        customers.put(c1.phone, c1);
        customers.put(c2.phone, c2);

        // Producer Thread
        Thread producer = new Thread(() -> {
            Random r = new Random();
            String[] phones = {"9001", "9002"};

            try {
                while (true) {
                    String phone = phones[r.nextInt(2)];
                    int minutes = r.nextInt(5) + 1;

                    callQueue.addCall(new CallRequest(phone, minutes));
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {}
        });

        // Consumer Thread
        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    CallRequest request = callQueue.getCall();
                    Customer customer = customers.get(request.phone);

                    try {
                        customer.makeCall(request.minutes);
                        double cost = request.minutes * 2;

                        synchronized (callQueue) {
                            callQueue.totalRevenue += cost;
                        }

                        System.out.println(
                                "Call processed: " + request.phone +
                                " | Minutes: " + request.minutes +
                                " | Cost: ₹" + cost
                        );
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            } catch (InterruptedException e) {}
        });

        producer.start();
        consumer.start();
    }

}
