package com.collections.map.practice.insurance;

import java.util.Objects;

public class Policy {
	
    public enum PolicyType {
        HEALTH, LIFE, VEHICLE, TRAVEL
    }

    public enum PolicyStatus {
        ACTIVE, EXPIRED
    }
    
    private int policyNumber;
    private String customerName;
    private PolicyType policyType;
    private int customerAge;
    private double basePremium;
    private double finalPremium;
    private PolicyStatus policyStatus;

    public Policy(int policyNumber, String customerName, PolicyType policyType, int customerAge, double basePremium, PolicyStatus policyStatus) {
        this.policyNumber = policyNumber;
        this.customerName = customerName;
        this.policyType = policyType;
        this.customerAge = customerAge;
        this.basePremium = basePremium;
        this.policyStatus = policyStatus;
        calculateFinalPremium();
    }
    
    
    
    
    
    

    // Premium calculation based on policy type
    public void calculateFinalPremium() {
        switch (policyType) {
            case HEALTH :{
            	finalPremium = basePremium * 1.20;
            	break;
            }
            case LIFE :{
            	finalPremium = basePremium * 1.35;
            	break;
            }
            case VEHICLE :{
            	finalPremium = basePremium * 1.15;
            	break;
            }
            case TRAVEL :{
            	finalPremium = basePremium * 1.10;
            	break;
            }
        }
    }
    


    // Getters and Setters
    public int getPolicyNumber() {
    	return policyNumber; 
    	}
    
    public String getCustomerName() {
    	return customerName; 
    	}
    
    public PolicyType getPolicyType() { 
    	return policyType;
    	}
    
    public int getCustomerAge() { 
    	return customerAge;
    	}
    
    public double getBasePremium() { 
    	return basePremium;
    	}
    
    public double getFinalPremium() { 
    	return finalPremium;
    	}
    
    public PolicyStatus getPolicyStatus() { 
    	return policyStatus;
    	}

    public void setBasePremium(double basePremium) {
        this.basePremium = basePremium;
        calculateFinalPremium();
    }

    public void setPolicyStatus(PolicyStatus policyStatus) {
        this.policyStatus = policyStatus;
    }







	@Override
	public String toString() {
		return "Policy [policyNumber=" + policyNumber + ", customerName=" + customerName + ", policyType=" + policyType
				+ ", customerAge=" + customerAge + ", basePremium=" + basePremium + ", finalPremium=" + finalPremium
				+ ", policyStatus=" + policyStatus + "]";
	}



    

}
