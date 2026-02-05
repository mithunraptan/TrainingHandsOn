package com.practicecode;

import java.util.Scanner;

public class Student {
	
	
	
	private static void calculateAvg(int[] arr) {
		int sum = 0;
		int avg = 0;
		for(int i=0; i<arr.length; i++) {
			sum= sum+arr[i];
		}
		avg = sum/arr.length;
		System.out.println("average is "+avg);
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter subjects count");
		int count = sc.nextInt();
		
		int[] arr = new int[count];
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println("enter marks");
			int mark = sc.nextInt();
			arr[i]= mark;
		}
		
		//avg calculation
		calculateAvg(arr);
		
	}

	

}
