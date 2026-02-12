package com.training.multithreading.producerandconsumer;

public class SharedResourceMain {
	
	public static void main(String[] args) {

			SharedResource sr = new SharedResource();
			
			//create a producer thread
			Thread producerThread = new Thread(()->{
				for(int i = 0; i<5; i++) {
					try {
						sr.produce(i);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			
			//create a consumer thread
			Thread consumerThread =  new Thread(()->{
				for(int i = 0; i<5; i++) {
					try {
						sr.consume();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			
			producerThread.start();
			consumerThread.start();
			
			
			
			
	}

}
