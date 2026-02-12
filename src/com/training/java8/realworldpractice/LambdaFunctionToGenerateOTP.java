package com.training.java8.realworldpractice;

import java.util.function.Supplier;

public class LambdaFunctionToGenerateOTP {
	public static void main(String[] args) {
		//Normal way
		double random = Math.random()*1000000;
		System.out.println((int)random);
		
		//through Funtional Interface
		 Supplier<Double> supObj= ()-> Math.random()*1000000;
		 Double otp = supObj.get();
		 System.out.println("your OTP is : " + otp.intValue());
	}

}
