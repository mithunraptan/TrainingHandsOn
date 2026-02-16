package com.training.multithreading.inventorymanagementsystem;

public class Warehouse extends Thread {
	int stock = 10;

	public synchronized void purchase(int purchaseItem) {
		if(purchaseItem>stock ) {
			System.out.println(Thread.currentThread().getName()+" is deducting "+ purchaseItem + " items");
			System.out.println("Failed to deducted " + purchaseItem + "items from the stock. Remaining stocks: "+ stock);
		}else {
			stock = stock - purchaseItem;
			System.out.println(Thread.currentThread().getName()+" is deducting "+ purchaseItem + " items");
			System.out.println("you have successfully deducted " +purchaseItem + " the items from stock. Left items: "+ stock);
		}

	}
}
