package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MarathonDriver {
	

	private static void nameCheck(String name) throws InputMismatchException {
		// TODO Auto-generated method stub
		 if (!name.matches("[A-Za-z ]{4,}")) {
	         throw new InputMismatchException("Name must contain only alphabets and minimum 4 characters.");
	     }
		
	}
	
	private static void ageCheck(int age) throws ArithmeticException{
		// TODO Auto-generated method stub
		if(age<18 || age>60) {
			throw new ArithmeticException("age sould be between 18 to 60");
		}
		
	}
	
	private static void genderCheck(String gender) throws InputMismatchException {
		// TODO Auto-generated method stub
		if(gender.equalsIgnoreCase("MALE") || gender.equalsIgnoreCase("FEMALE") || gender.equalsIgnoreCase("OTHERS")) {
			
		}
		else {
			throw new InputMismatchException("gender must be male/female/others");
		}
		
	}
	
	
	private static void contactCheck(long contact) throws ArithmeticException {
		// TODO Auto-generated method stub
		  String contactString = String.valueOf(contact); //converting long to string here to match the regex pattern

		    if (!contactString.matches("^\\d{10}$")) {
		        throw new ArithmeticException("Contact should be numeric and exactly 10 digits");
		    }
		
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		String gender;
		long contact;
		

		while(true) {
			System.out.println("enter name : ");
			name = sc.nextLine();
			try {
				nameCheck(name);
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				if(e!=null) {
					continue;
				}
			}
			break;
			
		}
		
		
		
		while(true) {
			System.out.println("enter age : ");
			age = sc.nextInt();
			try {
				ageCheck(age);
			} catch (ArithmeticException e ) {
				System.out.println(e.getMessage());
				if(e!=null){
					continue;
				}
			}
			break;
		}
		
		
		while(true) {
			System.out.println("enter gender : ");
			gender = sc.next();
			try {
				genderCheck(gender);
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				if(e!=null) {
					continue;
				}
			}
			break;
		}
		
		
		while(true) {
			System.out.println("enter contact number : ");
			contact = sc.nextLong();
			try {
				contactCheck(contact);
				
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
				if(e!=null) {
					continue;
				}
			}
			break;
		}
	
		
		
		
		Marathon marathon = new Marathon(name, age, gender, contact);
		
		System.out.println(" registration successful!!");
		System.out.println("do you want to see your details? Y/N");
		String choice = sc.next();
		
		if(choice.equalsIgnoreCase("Y")){
			System.out.println("name : " + marathon.getName());
			System.out.println("age : " + marathon.getAge());
			System.out.println("gender : " + marathon.getGender());
			System.out.println("contact : " + marathon.getNumber());
		}
				
		

		
		
		
		
		
		
		
		
	}


}
