package com.training.multithreading.telecomprocessingsystem;

public class Customer {
	 	String phone;
	    double balance;
	    static final double RATE = 2.0;

	    Customer(String phone, double balance) {
	        this.phone = phone;
	        this.balance = balance;
	    }

	    synchronized void makeCall(int minutes) throws Exception {
	        double cost = minutes * RATE;

	        if (balance < cost) {
	            throw new Exception("Insufficient balance for " + phone);
	        }
	        balance -= cost;
	    }

	    synchronized void recharge(double amount) {
	        balance += amount;
	    }

}
