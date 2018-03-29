package com.sdettraining.day08;

public class BankingTest  implements Runnable{

	Account account; 
	int amt; 
	
	@Override
	public void run() {
		
		synchronized (account) {
			account.withdraw(amt);
		}
		
	}

	public static void main(String[] args) {
		Account account = new Account(1000); 
		new BankingTest(account, "Mr. A", 500);
		new BankingTest(account, "Mr. B", 700);
	}
	public BankingTest(Account account, String name, int amt){
		this.account = account; 
		this.amt = amt; 
		// will create an os level thread and give control to 
		// run method 
		new Thread(this, name).start(); 
	}
}
