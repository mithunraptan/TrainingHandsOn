package com.training.java8.realworldpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class EmployeeDriverClass {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		List<Employee> employeeList = new ArrayList<>();
		
		while(true) {
		System.out.println("press 1. for add employee");
		System.out.println("press 2. for all employee");
		System.out.println("press 3. to exit");
		
		System.out.println("enter your choice : ");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1: {
			System.out.println("enter employee id : ");
			int empId = sc.nextInt();
			System.out.println("enter employee name : ");
			String empName = sc.next();
			System.out.println("enter empoyee salary : ");
			double empSalary = sc.nextDouble();
			
			//15% hike thorugh proper inbuilt lambda function based on use case
			Function<Double, Double> obj = (sal)-> sal + sal*0.15;
			Double hikeSal = obj.apply(empSalary);
			
			//creating employee object of 15% hike
			Employee employee = new Employee(empId, empName, hikeSal);
			
			//adding employee object to the employee list
			employeeList.add(employee);
			
			
			break;
		}
		case 2: {
			
			for(Employee emp : employeeList) {
				System.out.println(emp);
			}
			break;
		}
		case 3: {
			System.out.println("thanks for using our application");
			return;
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		}
		
	}

}
