package com.training.multithreading.producerandconsumer;

public class SharedResource extends Thread {
	volatile int data;
	volatile boolean flag = false;
	
	public synchronized void produce(int value) throws InterruptedException {
        while (flag) {
        	wait();
        }
        data = value;
        flag = true;
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (!flag) {
        	wait();
        }
        System.out.println("Consumed: " + data);
        flag = false;
        notify();
    }

}
