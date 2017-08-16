package com.mycompany.thread;

class Account {
	// image the balance will come from DB 
	private int accountBalance;

	Account(int amt) {
		// get amt from database
		accountBalance = amt;
	}

	  void  withdraw(int withdrawAmount) {
		// 500 < 1000 
		if (withdrawAmount < accountBalance) {
			try {
				/*
				 * sleep() here is used to simulating time to connect to other
				 * systems and performing IO operation
				 */
				Thread.sleep(1000);
				accountBalance = accountBalance - withdrawAmount;
			} catch (Exception e) {
			}
			System.out.println("Received " + withdrawAmount + " by " + Thread.currentThread().getName());
		} else
			System.out.println(
					"Sorry " + Thread.currentThread().getName() +
					"Requested amt (" + withdrawAmount + ") is not available.");
		
		
		System.out.println("Balance " + accountBalance);
	}
}