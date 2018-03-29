package com.sdettraining.day08;



class OthersBusienssLogic{}


class MyBusinessLogic extends OthersBusienssLogic implements Runnable{

	Thread t; 
	public MyBusinessLogic(){}
	
	public MyBusinessLogic(String name, int priority) {
		t = new Thread(this); 
		t.setName(name);
		t.setPriority(priority);
		// this will create a call to OS creates a 
		// new thread and gives the control to run 
		t.start();
	}
	
	@Override
	public void run() {
		for(int i=0; i<500; i++){
			System.out.println("I value " + i +" in " + Thread.currentThread().getName());
		}
		
		System.out.println("Thread " + Thread.currentThread().getName() +", Exiting");
	}
	
}


public class RunnableEx01 {
	public static void main(String[] args) {
		MyBusinessLogic mbl1 = new MyBusinessLogic("Mobile", 5); 
		MyBusinessLogic mbl2 = new MyBusinessLogic("Laptop", 3);
		MyBusinessLogic mbl3 = new MyBusinessLogic("Charger", 1); 
		
		
		Thread t1 = new Thread(new MyBusinessLogic()); 
		t1.setPriority(4);
		t1.setName("Book");
		t1.start();
	}
}
