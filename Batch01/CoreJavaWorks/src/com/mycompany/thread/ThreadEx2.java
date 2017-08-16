package com.mycompany.thread;

// if you have a class extending from Thread then it can be asysc(then they can get into 
// race condition) 
class AccountBalanceCheck extends Thread{
	private String customerName;
	// when the user issues a start the OS level thread is created and the 
	// control is given to run() 
	@Override
	public void run() {
		// the jobs here will go async 
		this.viewBalance();
		System.out.println("Job of " + customerName +" is exiting");
	}

	public final void setCustomerName(String customerName) {
		this.customerName = customerName;
		
		
	}
	public void viewBalance(){
		System.out.println("The balance for user will go here " + customerName);
		// this is to simulate that you are connecting to DB and getting the information 
		for(int i=0; i<500; i++){
			System.out.println("I value for "+ customerName +" is " + i);
		}
	}
}

public class ThreadEx2 {
	public static void main(String[] args) {
		AccountBalanceCheck abc = new AccountBalanceCheck();
		abc.setCustomerName("Nataraj");
		abc.start();
		
		AccountBalanceCheck abc1 = new AccountBalanceCheck();
		abc1.setCustomerName("Madhuri");
		abc1.start();
		
		AccountBalanceCheck abc2 = new AccountBalanceCheck();
		abc2.setCustomerName("Radha");
		abc2.start();
		
		
		try {
			abc.join();
			abc1.join();
			abc2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("MAIN THREAD IS EXITING.... ");
	}
}
