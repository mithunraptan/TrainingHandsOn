package com.oops;

import java.util.Scanner;

public class OrderMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1. for Restaurant order");
		System.out.println("press 2. for Cloud Kitchen order");
		System.out.println("press 3. for Grocery order");
		System.out.println("Enter your Choice");
		int ch = sc.nextInt();

		switch (ch) {
		case 1:
			System.out.println("Enter your name");
			String name = sc.next();
			System.out.println("Enter order amount");
			double orderAmount = sc.nextDouble();
			
			Restaurant restaurant = new Restaurant(name, orderAmount);
			double calculateFinalAmount = restaurant.calculateFinalAmount(orderAmount);
			String orderDetails = restaurant.getOrderDetails(calculateFinalAmount, name);
			System.out.println(orderDetails);
			
			break;
		case 2:
			System.out.println("Enter name");
			String name1 = sc.next();
			System.out.println("enter order amount");
			double orderAmount1 = sc.nextDouble();
			System.out.println("enter distance");
			int distance = sc.nextInt();
			
			CloudKitchen cloudKitchen = new CloudKitchen(name1, orderAmount1, distance);
			double calculateFinalAmount2 = cloudKitchen.calculateFinalAmount(orderAmount1);
			if(distance>=5) {
				calculateFinalAmount2 = calculateFinalAmount2+30;
				System.out.println(calculateFinalAmount2);
			}
			else {
				calculateFinalAmount2 = calculateFinalAmount2+60;
			}
			
			String orderDetails2 = cloudKitchen.getOrderDetails(calculateFinalAmount2, name1);
			System.out.println(orderDetails2);
			
			
			
			break;
		case 3:
			System.out.println("Enter name");
			String name2 = sc.next();
			System.out.println("Enter order amount");
			double orderAmount2 = sc.nextDouble();
			System.out.println("Are you a member? Y/N");
			String memberOrNot = sc.next();
			boolean memberChoice;
			if(memberOrNot.equalsIgnoreCase("Y")) {
				memberChoice = true;
			}
			else {
				memberChoice = false;
			}

			
			Grocery grocery = new Grocery(name2, orderAmount2, memberChoice);
			
			if(memberChoice) {
				//10% discount
				double updatedOrderAmount2 = orderAmount2 * 0.10;
				double discountedOrderAmount = orderAmount2  - updatedOrderAmount2;
				double calculateFinalAmount3 = grocery.calculateFinalAmount(discountedOrderAmount);
				
				String orderDetails3 = grocery.getOrderDetails(calculateFinalAmount3, name2);
				System.out.println(orderDetails3);
			}
			
			else {
				double calculateFinalAmount3 = grocery.calculateFinalAmount(orderAmount2);
				String orderDetails3 = grocery.getOrderDetails(calculateFinalAmount3, name2);
				System.out.println(orderDetails3);
				
			}
			
			
			
			break;
		default:
			break;
		}
	}
	

}
