package com.sdettraining.day08;

public class Account {
	private int money; 
	
	// assuming that the value of this will be fetched from 
	// database 
	
	public Account(int amount){
		this.money = amount; 
	}
	
	public  void withdraw(int withdrawAmount){
		if(withdrawAmount < money){
			// we can deduct the amount and print the message
			// 1. simulating 1 sec as it hits the DB and decuts the amount 
			try {
				Thread.sleep(1000);
				money = money - withdrawAmount;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Amount Receive of " + withdrawAmount +", by " + 
					Thread.currentThread().getName());
			 
			
			
		}else{
			// sorry no balance 
			System.out.println("oh Sorry You dont have Sufficient Balance Mr/Ms/Mrs: " +
					Thread.currentThread().getName());
		}
		
		System.out.println("Current in your Account : " + money);
		
		
	}
}
