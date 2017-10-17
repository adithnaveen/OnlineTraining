package com.mycompany.day7;


class BusinessLogic extends Thread{
	public void run(){
		for(int i=0;i<500; i++){
			System.out.println("i value " + i +" in " + Thread.currentThread().getName());
		}
		
		System.out.println(Thread.currentThread().getName() +" is exiting... ");
	}
}


// if you have the main method then the class is the first thread 
public class ThreadEx1 {
	public static void main(String[] args) {
		System.out.println("Thread name " + Thread.currentThread().getName());
		
		BusinessLogic bl1 = new BusinessLogic();
		bl1.setName("Mohan");
		bl1.setPriority(Thread.NORM_PRIORITY+1);
		bl1.start();
		
		BusinessLogic bl2 = new BusinessLogic();
		bl2.setName("Srinivas");
		bl2.setPriority(Thread.MAX_PRIORITY);
		bl2.start();
		
		for(int i=0;i<500; i++){
			System.out.println("i value " + i +" in " + Thread.currentThread().getName());
		}
		
		try {
			bl1.join();
			bl2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(Thread.currentThread().getName() +" is exiting... ");
	}
}
