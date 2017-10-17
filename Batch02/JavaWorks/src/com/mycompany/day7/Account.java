package com.mycompany.day7;

class Account {
	private int money;

	Account(int amt) {
		// get amt from database
		money = amt;
	}

	 void withdraw(int amt) {
		if (amt < money) {
			try {
				/*
				 * sleep() here is used to simulating time to connect to other
				 * systems and performing IO operation
				 */
				Thread.sleep(1000);
				money = money - amt;
			} catch (Exception e) {
			}
			System.out.println("Received " + amt + " by " + Thread.currentThread().getName());
		} else
			System.out.println(
					"Sorry " + Thread.currentThread().getName() + "Requested amt (" + amt + ") is not available.");
		System.out.println("Balance " + money);
	}
}
