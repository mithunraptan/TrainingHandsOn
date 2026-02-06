package com.oops;

public class SavingAccount extends Account {

	public SavingAccount(long account_number, double balance, Customer customer) {
		super(account_number, balance, customer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double deposit(double accountBalance, double deposiitBalance){
		// TODO Auto-generated method stub
		
		double total = accountBalance+deposiitBalance;
		
		
		return total;
	}

	@Override
	public double withdraw(double accountBalance, double withdrawBalance) throws InsufficientBalanceException {
		// TODO Auto-generated method stub
		
		if(accountBalance-withdrawBalance>1000) {
			double total = accountBalance-withdrawBalance;
			return total;
//			System.out.println("please maintain minimum balance");
			
			
		}
		throw new InsufficientBalanceException("please maintain minimum balance");
		
	}

	




	
	

}
