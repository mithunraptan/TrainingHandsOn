package com.training.multithreading.synchronization;

public class BankAccountDriver {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount(20000);
		
		Runnable task1 = ()-> bankAccount.withdraw(500);
		Runnable task2 = ()-> bankAccount.withdraw(200);
		
		Thread t1 = new Thread(task1, "Thread-1");
		Thread t2 = new Thread(task2, "Thread-2");
		
		t1.start();
		t2.start();
	}

}
