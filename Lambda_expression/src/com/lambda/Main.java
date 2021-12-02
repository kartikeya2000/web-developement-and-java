package com.lambda;

public class Main {

	public static void main(String[] args) {
		
		// Implementation using concrete class 
		/*
		 * MyInter myinter = new MyInterImpl(); myinter.sayhello();
		 */

		//Implementation using anonymous class
		
		/*
		 * MyInter myinter = new MyInter() {
		 * 
		 * @Override
		 * 
		 * public void sayHello() { System.out.print("This is now hello: " );
		 * 
		 * }
		 * 
		 * 
		 * };
		 * 
		 * myinter.sayHello();
		 */
	
	// Implementation using lambda expression
		
		
		MyInter myinter = () -> System.out.println("Now this a hello using lambda expression ");              
		               
		myinter.sayHello();
		
		Sum_Inter sum1 = (a,b) -> a+b;
		               
	      int summation  = sum1.sum(5,6);
	      System.out.println(summation);
	
	   
	
	}
	
	

}