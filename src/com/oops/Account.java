package com.oops;

public abstract class Account {
	
	
	long account_number;
	double balance;
	Customer customer;
	
	public Account(long account_number, double balance, Customer customer) {
		super();
		this.account_number = account_number;
		this.balance = balance;
		this.customer = customer;
	}
	
	
	public abstract double deposit(double accountBalance, double deposiitBalance);
	public abstract double withdraw(double accountBalance, double withdrawBalance);
}
