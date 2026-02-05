package com.oops;

import java.util.Scanner;

public class PremiumCalculator {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1. for Health Insurance");
		System.out.println("press 2. for Life Insurance");
		System.out.println("press 3. for Vehicle Insurance");
		System.out.println("Enter your Choice");
		int ch = sc.nextInt();
		//sc.nextLine();
		switch (ch) {
		case 1:
			System.out.println("Enter Policy Holder name");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.println("Enter age");
			int age = sc.nextInt();
			System.out.println("Enter Base premium");
			double base=sc.nextDouble() ;
			System.out.println("Enter Sum Assured");
			double sum=sc.nextDouble() ;
					HealthInsurance h = new HealthInsurance(name, age, base, sum);
					h.calculatePremium();
			break;
		case 2:
			System.out.println("Enter Policy Holder name");
			String name1 = sc.nextLine();
			sc.nextLine();
			System.out.println("Enter policy term");
			int age2 = sc.nextInt();
			System.out.println("Enter Sum Assured");
			double sum2=sc.nextDouble() ;
					LifeInsurance l = new LifeInsurance(name1, age2, sum2);
					l.calculatePremium();
			
			break;
		case 3:
			System.out.println("Enter Policy Holder name");
			String name3 = sc.nextLine();
			System.out.println("Enter Vehicle type");
			String type = sc.nextLine();
			sc.nextLine();
			System.out.println("Enter Vehicle Value");
			double value = sc.nextInt();
			VehicleInsurance v = new VehicleInsurance(name3, type, value);
			v.calculatePremium();
			break;
		default:
			break;
		}
	}
}

