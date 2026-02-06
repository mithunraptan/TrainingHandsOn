package com.exception;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter employee count : ");
		int count = sc.nextInt();

		// Array for permanent employee
		PermanentEmployee[] pArray = new PermanentEmployee[3];
		// Array for contractual employee
		ContractEmployee[] cArray = new ContractEmployee[3];

		for (int i = 0; i < count; i++) {
			System.out.println("enter employee id : ");
			String id = sc.next();
			System.out.println("enter employee name : ");
			String name = sc.next();
			System.out.println("enter department : ");
			String department = sc.next();
			System.out.println("enter type of employee : P for Permanent, C for Contractual ");
			String type = sc.next();

			if (type.equalsIgnoreCase("P")) {

				double baseSalary;

				while (true) {
					System.out.println("enter base salary : ");
					baseSalary = sc.nextDouble();
					try {
						if (baseSalary <= 0) {
							throw new InvalidSalaryException("base salary should be more than 0 ");
						}

					} catch (ArithmeticException | InvalidSalaryException e) {
						System.out.println(e.getMessage());
						continue;
					}
					break;
				}

				System.out.println("enter HRA : ");
				double hra = sc.nextDouble();

				double hoursWorked = 0.0;
				double hoursrate = 0.0;

				// calculate salary for permanent employee
				double salary = baseSalary + hra;

				// create permanent employee object
				PermanentEmployee permanentEmployee = new PermanentEmployee(id, name, department, type, salary, hra,
						hoursWorked, hoursrate);

				// check the pArray empty or not
				int index = 0;
				for (int j = 0; j < pArray.length; j++) {
					if (pArray[j] == null) {
						index = j;
						break;
					}
				}

				// add permanent employee to pArray array
				pArray[index] = permanentEmployee;

			} else {

				double baseSalary = 0.0;
				double hra = 0.0;

				double hoursWorked;
				double hourlyRate;

				while (true) {
					System.out.println("enter hours Worked : ");
					hoursWorked = sc.nextDouble();
					try {
						if (hoursWorked <= 0) {
							throw new InvalidSalaryException("hours worked should be more than 0 ");
						}

					} catch (ArithmeticException | InvalidSalaryException e) {
						System.out.println(e.getMessage());
						continue;
					}
					break;
				}

				while (true) {
					System.out.println("enter hourly rate : ");
					hourlyRate = sc.nextDouble();
					try {
						if (hourlyRate <= 0) {
							throw new InvalidSalaryException("hourly rate should be more than 0 ");
						}

					} catch (ArithmeticException | InvalidSalaryException e) {
						System.out.println(e.getMessage());
						continue;
					}
					break;

				}

				// calculate the salary for contractual employee
				double salary = hoursWorked * hourlyRate;

				// tax : 10%
				salary = salary - (salary * 0.10);

				// create contractual employee object
				ContractEmployee contractEmployee = new ContractEmployee(id, name, department, type, salary, hra,
						hoursWorked, hourlyRate);

				// check the cArray empty or not and find the index
				int index = 0;
				for (int j = 0; j < cArray.length; j++) {
					if (cArray[j] == null) {
						index = j;
						break;
					}
				}

				// add contractual employee to cArray
				cArray[index] = contractEmployee;

			}

		}

		// printing the pArray objects

		System.out.println(Arrays.toString(pArray));
		System.out.println(Arrays.toString(cArray));

	}

}