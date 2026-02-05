package com.oops;

public class VehicleInsurance implements Insurance {
	String policyHolderName;
    String vehicleType;
    double VehicleValue;
	 @Override
	 public void calculatePremium() {
		 
			if(vehicleType.equalsIgnoreCase("twowheeler")) {
				double calculate = VehicleValue * 0.02;
				System.out.println("Your premium is " + calculate);
				
			}
			else if(vehicleType.equalsIgnoreCase("fourwheeler")) {
				double calculate = VehicleValue * 0.04;
				System.out.println("Your premium is " + calculate);
			}
			}
	 public VehicleInsurance(String policyHolderName, String vehicleType, double vehicleValue) {
		super();
		this.policyHolderName = policyHolderName;
		this.vehicleType = vehicleType;
		VehicleValue = vehicleValue;
	 }
		}
