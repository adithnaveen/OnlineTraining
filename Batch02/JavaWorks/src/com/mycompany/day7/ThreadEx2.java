package com.mycompany.day7;

class BusinessLogic2 implements Runnable{
	Thread thread; 
	BusinessLogic2(String name, int priority){
		thread = new Thread(this);
		thread.setName(name);
		thread.setPriority(priority);
		
		// will create OS level thread and gives the 
		// control to run()
		thread.start();
	}
	@Override
	public void run() {
		for(int i=0;i<500; i++){
			// DB 
			System.out.println("i value " + i +" in " + Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().getName() +" is exiting... ");
	}
	
}


public class ThreadEx2 {
	public static void main(String[] args) {
		BusinessLogic2 bl1 = new BusinessLogic2("Laptop", 5);
		BusinessLogic2 bl2 = new BusinessLogic2("Desktop", 6);
	}
}
