package com.mycompany.thread;

class OtherBusinessLogic {
}

class MyBusinessLogic extends OtherBusinessLogic implements Runnable {

	private Thread t; 
	
	public MyBusinessLogic(){}
	
	public MyBusinessLogic(String name, int priority) {
		t = new Thread(this);
		t.setName(name);
		t.setPriority(priority);
		// the OS Level thread will be created and the control is given to run method 
		t.start();
	}
	
	@Override
	public void run() {
		for(int i=0; i<500; i++){
			System.out.println("I value for "+ Thread.currentThread().getName() +" is " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadEx3 {
	public static void main(String[] args) {
		MyBusinessLogic mb1 = new MyBusinessLogic("Luis", Thread.MAX_PRIORITY); // 10 
		MyBusinessLogic mb2 = new MyBusinessLogic("Harry", Thread.NORM_PRIORITY); // 5
		MyBusinessLogic mb3 = new MyBusinessLogic("Kumar", Thread.MIN_PRIORITY); // 1
		
		
		Thread t1 = new Thread(new MyBusinessLogic());
		t1.setName("Rashmi");
		t1.setPriority(7);
		t1.start();
		

	}
}
