package com.training.java8.realworldpractice;

public class Payment {
	

	String paymentId;
	double ampunt;
	boolean status;
	
	//constructor
	public Payment(String paymentId, double ampunt, boolean status) {
		super();
		this.paymentId = paymentId;
		this.ampunt = ampunt;
		this.status = status;
	}

	//getters and setters
	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public double getAmpunt() {
		return ampunt;
	}

	public void setAmpunt(double ampunt) {
		this.ampunt = ampunt;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", ampunt=" + ampunt + ", status=" + status + "]";
	}

}
