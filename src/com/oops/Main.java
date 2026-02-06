package com.oops;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		double accountBalance; 
		
		
		
		System.out.println("Do you want to create an Account? Y/N");
		String userResponse = sc.next();
	
		
		
		if(userResponse.equalsIgnoreCase("y")) {
			
			System.out.println("enter customer id: ");
			int cusID = sc.nextInt();
			System.out.println("enter customer customer name: ");
			String cusName = sc.next();
			System.out.println("enter customer email");
			String email = sc.next();
			
			System.out.println("give account number: ");
			long account_number = sc.nextLong();
			System.out.println("give account balance");
			double balance = sc.nextDouble();
			
			
			//set the account balance
			accountBalance = balance;
			
			Customer customer = new Customer(cusID, cusName, email);
			
			SavingAccount savingAccount = new SavingAccount(account_number, balance, customer);
			
			System.out.println("you have successfully created an account");
			
			boolean userChoice = true;
			while(userChoice) {
				System.out.println("press D for deposit and press W for withdraw");
				
				String accountHolderChoice = sc.next();
				if(accountHolderChoice.equalsIgnoreCase("D")) {
					System.out.println("enter the deposit amount: ");
					double depositAmount = sc.nextDouble();
					double deposit = savingAccount.deposit(accountBalance, depositAmount);
					accountBalance = deposit;
					System.out.println("your total balance is : "+ accountBalance);
					System.out.println("do you want to deposit and withdraw again? Y/N");
					String choice = sc.next();
					if(choice.equalsIgnoreCase("Y")) {
						userChoice = true;
					}
					else {
						userChoice = false;
					}
				
				}
				else if (accountHolderChoice.equalsIgnoreCase("W")) {
					System.out.println("enter withdraw amount: ");
					double withdrawAmount = sc.nextDouble();
					
					try {
						double totalAmount = savingAccount.withdraw(accountBalance, withdrawAmount);
						accountBalance = totalAmount;
						System.out.println("your total balance is: "+ accountBalance);
						System.out.println("do you want to deposit and withdraw again? Y/N");
						String choice = sc.next();
						if(choice.equalsIgnoreCase("Y")) {
							userChoice = true;
						}
						else {
							userChoice = false;
						}
						
					}catch (Exception e) {
						// TODO: handle exception
						System.out.println(e.getMessage());
					}
					
					
					
				}
				
				
			}
			
			
			
			
			
		}
		else {
			System.out.println("thanks for using our application");
		}
		
		
	}

}
