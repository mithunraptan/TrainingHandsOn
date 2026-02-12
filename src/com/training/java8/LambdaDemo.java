package com.training.java8;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class LambdaDemo {

	public static void main(String[] args) {
		
		MyFunctionalInterface object = (a,b)-> a+b; // lambda always returns a functional interface tyoe
		System.out.println(object.sum(10, 20));
		
		//using inbuilt Predicate functional interface
		Predicate<Integer> p1 = n->n%2==0;
		if(p1.test(14)) {
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}
		
		
		
		//task: take two numbers and return max number through inbuilt functional inteface
		
		BiFunction<Integer, Integer, Integer> obj = (a, b)-> a>b ? a : b;
		
		System.out.println("Max is : " + obj.apply(10, 20));
		
	}

}
