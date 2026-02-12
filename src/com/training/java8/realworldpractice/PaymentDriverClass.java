package com.training.java8.realworldpractice;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PaymentDriverClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter payment Id : ");
		String paymentId = sc.next();
		
		System.out.println("enter amount : ");
		double amount = sc.nextDouble();
		
		boolean status;
		
		Predicate<Double> predObj = a -> a > 0;
		boolean test = predObj.test(amount);
		if (test) {
			status = true;
		} else {
			status = false;
		}

		// consumer for log
		Consumer<Boolean> conObj = testPayment -> {
			if (testPayment) {
				System.out.println("payment successful");
			} else {
				System.out.println("payment failed!!");
			}
		};
		conObj.accept(test);
		
		//Supplier to generate payment reference number
		if(test) {
			 Supplier<Double> supObj= ()-> Math.random()*1000000;
			 Double otp = supObj.get();
			 System.out.println("your payment reference number is : " + otp.intValue());
		}
		
		 
		

	}

}
