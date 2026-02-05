package com.oops;

public class Restaurant implements Order {
	
	

	String customerName;
	double orderAmount;
	final int gstPercentage = 18;
	
	public Restaurant(String customerName, double orderAmount) {
		super();
		this.customerName = customerName;
		this.orderAmount = orderAmount;
	}

	@Override
	public double calculateFinalAmount(double totalAmount) {
		// TODO Auto-generated method stub
		
		double gstcalculation = totalAmount *0.18;
		totalAmount = totalAmount+gstcalculation;
		
		return totalAmount;
	}

	@Override
	public String getOrderDetails(double totalAmount, String name) {
		// TODO Auto-generated method stub
		return name + " "+ totalAmount;
	}



	

}
