package com.oops;

public class HealthInsurance implements Insurance {
    String policyHolderName;
    int age;
    double basePremium;
    double sumAssured;
	 @Override
	 public void calculatePremium() {
		 double calculate = basePremium +(sumAssured/age);
		if(age<45) {
			System.out.println("Your premium is " + calculate);
		}
		else {
			double surcharge = (calculate*0.2);
			System.out.println("Your premium is " +(calculate+ surcharge));
			
		}
	 }
	 public HealthInsurance(String policyHolderName, int age, double basePremium, double sumAssured) {
		super();
		this.policyHolderName = policyHolderName;
		this.age = age;
		this.basePremium = basePremium;
		this.sumAssured = sumAssured;
	 }
}
