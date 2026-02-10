package com.collections.map.practice.insurance;

import java.util.Scanner;

public class MainDriverClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PolicyManager manager = new PolicyManager();

        while (true) {
            System.out.println("Welcome to Policy Management System");
            System.out.println("1. Add Policy");
            System.out.println("2. Find Policy");
            System.out.println("3. Display Active Policies");
            System.out.println("4. Find Highest Premium Policy");
            System.out.println("5. Remove Expired Policies");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a number.");
                continue;
            }

            switch (choice) {
            case 1: {
                try {
                    System.out.print("Enter Policy Number: ");
                    int number = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();

                    //Policy Type
                    System.out.print("Enter Policy Type (HEALTH, LIFE, VEHICLE, TRAVEL): ");
                    String typeStr = sc.nextLine().toUpperCase();
                    for(Policy.PolicyType policyType : Policy.PolicyType.values()) {
                    	if(!policyType.name().equals(typeStr)) {
                    		 throw new InvalidPolicyTypeException(
                                     "Invalid policy type entered. Use HEALTH, LIFE, VEHICLE, or TRAVEL."
                                 );
                    	}
                    }
                    
                    Policy.PolicyType type = Policy.PolicyType.valueOf(typeStr); // converting string type to enum type and then assigning to the 'type' variable

                    System.out.print("Enter Customer Age: ");
                    int age = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter Base Premium: ");
                    double basePremium = Double.parseDouble(sc.nextLine());

                    //Policy Status
                    System.out.print("Enter Policy Status (ACTIVE, EXPIRED): ");
                    String statusStr = sc.nextLine().toUpperCase();
                    Policy.PolicyStatus status;
                    try {
                        status = Policy.PolicyStatus.valueOf(statusStr);
                    } catch (IllegalArgumentException e) {
                        throw new InvalidPolicyTypeException(
                            "Invalid policy status entered. Use ACTIVE or EXPIRED."
                        );
                    }

                    Policy policy = new Policy(number, name, type, age, basePremium, status);
                    manager.addPolicy(policy);
                    System.out.println("Policy added successfully.");

                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format. Please enter numeric values correctly.");
                } catch (InvalidPolicyTypeException e) {
                    System.out.println(e.getMessage());
                }
                break;
            }

                case 2 : {
                    try {
                        System.out.print("Enter Policy Number to find: ");
                        int number = Integer.parseInt(sc.nextLine());
                        Policy policy = manager.findPolicy(number);
                        if (policy != null) {
                            System.out.println(policy);
                        } else {
                            System.out.println("Policy not found.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a number.");
                    }
                    break;
                }

                case 3 :{
                	manager.displayActivePolicies();
                	
                	break;
                }

                case 4 :{
                	manager.findHighestPremiumPolicy();
                	
                	break;
                }

                case 5 :{
                	manager.removeExpiredPolicies();
                	
                	break;
                }

                case 6 : {
                    System.out.println("Thank you");
                    sc.close();
                    return;
                }

                default :
                	System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}



