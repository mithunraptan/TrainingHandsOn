package com.oops;

public interface Order {
	abstract double calculateFinalAmount( double totalAmount);
	abstract String getOrderDetails(double totalAmount, String name);

}
