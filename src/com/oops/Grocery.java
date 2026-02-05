package com.oops;

public class Grocery implements Order {
	
	String customerName;
	double orderAmount;
	final int gstPercentage = 18;
	boolean isMember;
	
	public Grocery(String customerName, double orderAmount, boolean isMember) {
		super();
		this.customerName = customerName;
		this.orderAmount = orderAmount;
		this.isMember = isMember;
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
