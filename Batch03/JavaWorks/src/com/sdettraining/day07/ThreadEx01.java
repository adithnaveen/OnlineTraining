package com.sdettraining.day07;



class MyBusinessLogic extends Thread{
	public void doMyJOb(){
		for(int i=0; i<2000; i++){
			System.out.println("Again I value is " + i +", in the Thread " + 
					Thread.currentThread().getName());
			
		/*	try {
				Thread.sleep(22);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
		}
		
		System.out.println("Thread " + Thread.currentThread().getName() +", is Exiting");
	}

	@Override
	public void run() {
		// all your business logic should go here 
		// or all invocation of other method should go here
		
		doMyJOb();
	}
	
}

// in java program when you have main method then 
// that method is considered to be the first thread 
public class ThreadEx01 {
	public static void main(String[] args) {
		System.out.println("Thread Name " + 
				Thread.currentThread().getName());
		System.out.println("Priority " + 
				Thread.currentThread().getPriority());
		
		MyBusinessLogic mbl = new MyBusinessLogic(); 
		// mbl.run();
		// this method will create an OS level thread and then 
		// it gives the control to run method by default 
		mbl.setPriority(Thread.MIN_PRIORITY);
		mbl.setName("Harry");
		mbl.start(); 
		
		MyBusinessLogic mbl1 = new MyBusinessLogic(); 
		mbl1.setName("Peter");
		mbl1.setPriority(mbl.getPriority()+1);
		mbl1.start();
		
		for(int i=0; i<500; i++){
			System.out.println("I value is " + i +", in the " + 
					Thread.currentThread().getName());
		}
		
		
		try {
			mbl.join();
			mbl1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main exits... ");
	}
}
