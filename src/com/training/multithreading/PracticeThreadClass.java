package com.training.multithreading;

public class PracticeThreadClass {
	public static void main(String[] args) {
		//you have to print a table of 2 using one thread and then a table of 5 using another thread.
		
		Runnable rn1 = ()->{
			for(int i = 1 ; i<=10 ; i++) {
				System.out.println("2 * " + i + " = " + 2*i );
			}
		};
		
		Runnable rn2 = ()->{
			for(int i = 1 ; i<=10 ; i++) {
				System.out.println("5 * " + i + " = " + 5*i );
			}
		};
		
		Thread t1 = new Thread(rn1);
		Thread t2 = new Thread(rn2);
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		
		
	}

}
