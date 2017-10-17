package com.mycompany.assignment1;

public class AccountClient {
	public static void main(String[] args) {
		Account [] arr = new Account[5];
		
		arr[0] = new SavingsAccount();
		arr[1] = new CurrentAccount();
		arr[2] = new SavingsAccount();
		arr[3] = new CurrentAccount();
		arr[4] = new SavingsAccount();
		
		AccountBL abl = new AccountBL();
		abl.doMyJob(arr);
	}
}
