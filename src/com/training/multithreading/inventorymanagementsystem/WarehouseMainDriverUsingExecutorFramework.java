package com.training.multithreading.inventorymanagementsystem;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class WarehouseMainDriverUsingExecutorFramework {
	
	public static void main(String[] args) {
		Warehouse warehouse = new Warehouse();

		//using Executor framework to create thread
		//creating 5 new thread which is present in the pool
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		//statring those 5 threads through loop
		for(int i = 1; i <=5; i++) {
			executor.submit(()->{
				double random=Math.random()*4 +1;
				warehouse.purchase((int)random);
			});
		}
		
		//this ensures the threads will complete all its task then it will wait 5 sec more to stop all the threads.
		try {
			executor.awaitTermination(5,TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		executor.shutdown(); // this will shutdown the threads after 5 seconds.
		
		
		
	}

}
