package com.bank;


import java.util.Scanner;

public class Bank {
	
	public static int debit(int totalAmount , int transactionAmount, boolean transactionStatus ) {
		int debitedAmount=0;
		if(transactionAmount>0 && transactionAmount<totalAmount) {
			debitedAmount = totalAmount-transactionAmount;
			return debitedAmount;
		}
		else {
			if(transactionAmount>totalAmount) {
			System.out.println("insufficient amount ");
			}
			else {
				System.out.println("enter valid amount");
			}
		}
		return 0;
		
	}
	
	
	
	public static void main(String[] args) {
		int totalAmount = 10000;
		System.out.println("your total amount is: " + totalAmount);
		
		boolean transactionStatus = true;
		while(transactionStatus) {
			System.out.println("enter amount: ");
			Scanner sc = new Scanner(System.in);
			int transactionAmount=0;
			if(sc.hasNextInt()) {
				transactionAmount= sc.nextInt();
				int debit = debit(totalAmount,transactionAmount,true);
				if(debit==0) {
					break;
				}
				totalAmount = debit;
				System.out.println("your amount has been deducted from your account and available balance is " + debit);
				transactionStatus = false;
				System.out.println("do you want to withdrown again? Y/N");
				String c = sc.next();
				if(c.equalsIgnoreCase("Y")) {
					transactionStatus = true;
				}
				else {
					System.out.println("thank you");
					transactionStatus = false;
				}
			}
			else {
				System.out.println("enter valid amount");
				transactionStatus = true;
			}
			
			
			
		}
		
		
		
		
		
	}

}
