package com.training.multithreading;

public class ThreadDemo {
	public static void main(String[] args) {
		
		//Thread Lifecycle: create New Thread -> Runnable -> Running -> wait -> Running -> die
		
		
		
//		Thread t1 = new Thread(()->{for(int i = 0 ; i <=5; i++) {System.out.println("printing from " + Thread.currentThread().getName());}});
//		Thread t2 = new Thread(()->{for(int i = 0 ; i <=5; i++) {System.out.println("printing from " + Thread.currentThread().getName());}});
		
		//to remove the duplicate for loop code
		//we can create a general Runnable implementation using lambda function and pass it inside the new Thread() constructor
		
		Runnable sp =()->{
							for(int i = 0 ; i <=5; i++) {
								System.out.println("printing from " + Thread.currentThread().getName() + "iteration " + i);
							}
						 };
		 
		Thread t1 = new Thread(sp);
		Thread t2 = new Thread(sp);
		
		
		t1.setName("Thread - 1");
		t2.setName("Thread - 2");
		
		t1.start();
		t2.start();
		
	}
}


