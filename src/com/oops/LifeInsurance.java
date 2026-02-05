package com.oops;

public class LifeInsurance implements Insurance {

	String policyHolderName;
    int policyTerm;
    double sumAssured;
	 @Override
	 public void calculatePremium() {
		 double calculate =(sumAssured/policyTerm)*0.05;
		System.out.println("Your Premuim is " + calculate);
			
		}
	 public LifeInsurance(String policyHolderName, int policyTerm, double sumAssured) {
		super();
		this.policyHolderName = policyHolderName;
		this.policyTerm = policyTerm;
		this.sumAssured = sumAssured;
	 }
	 }
