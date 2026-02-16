package com.training.multithreading.inventorymanagementsystem;

public class WarehouseMainDriver {

	public static void main(String[] args) {
		
		Warehouse warehouse = new Warehouse();
		
	
		Thread customer1 = new Thread(() -> {
		    int random = (int) (Math.random() * 4) +1;
		    warehouse.purchase(random);
		}, "Thread-1");

			
			Thread customer2 = new Thread(()->{
				double random = Math.random()*4 +1;
				warehouse.purchase((int)random);
			},"Thread-2");
			
			Thread customer3 = new Thread(()->{
				double random = Math.random()*4 +1;
				warehouse.purchase((int)random);
			},"Thread-3");
			
			Thread customer4 = new Thread(()->{
				double random = Math.random()*4 +1;
				warehouse.purchase((int)random);
			},"Thread-4");
			
			Thread customer5 = new Thread(()->{
				double random = Math.random()*4 +1;
				warehouse.purchase((int)random);
			},"Thread-5");
			
			customer1.start();
			customer2.start();
			customer3.start();
			customer4.start();
			customer5.start();

	}
}
