package com.oops;

public class CloudKitchen implements Order{
	

	String customerName;
	double orderAmount;
	final int gstPercentage = 18;
	int deliveryDistance;
	
	public CloudKitchen(String customerName, double orderAmount, int deliveryDistance) {
		super();
		this.customerName = customerName;
		this.orderAmount = orderAmount;
		this.deliveryDistance = deliveryDistance;
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
