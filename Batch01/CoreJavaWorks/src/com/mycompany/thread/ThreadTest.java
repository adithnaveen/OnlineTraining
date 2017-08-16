package com.mycompany.thread;


public class ThreadTest implements Runnable{

	private Account account; 
	private int amount;
	
	@Override
	public void run() {
		synchronized (account) {
			account.withdraw(amount);
		}
	}

	ThreadTest(Account account, int amount, String name){
		this.account = account; 
		this.amount = amount; 
		new Thread(this, name).start();
	}
	
	public static void main(String[] args) {
		Account account = new Account(1000);
		// we have create multiple threads which will try to 
		// withdraw from same account 
		
		ThreadTest tt1 = new ThreadTest(account, 500, "Harry");
		ThreadTest tt2 = new ThreadTest(account, 750, "Peter");
		
	}
}
