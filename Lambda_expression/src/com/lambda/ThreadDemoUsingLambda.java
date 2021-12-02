package com.lambda;

public class ThreadDemoUsingLambda {

	public static void main(String[] args) {
		
		Runnable thread1 = ()->{
			for (int i = 1 ; i<=10 ; i++) {
				
				System.out.println("excuting thread 1: " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		
		Thread thread = new Thread(thread1);
		thread.start();

	}

}
