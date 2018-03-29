package com.sdettraining.day04;


class BankingProcessing{
	public static void  processAccount(BankingRule [] accounts){
		for(BankingRule temp : accounts){
			System.out.println("-----------------------------------------");
			temp.roi(); 
			temp.fine(); 
			
			if( temp instanceof SavingsAccount){
				System.out.println("Customer Name " + 
						((SavingsAccount) temp).getCustomerName());
				
				((SavingsAccount) temp).minBalance();
			}
		}
	}
}


public class BankingImpl {
	public static void main(String[] args) {
		BankingRule [] accounts = new BankingRule[4]; 
		
		accounts[0] = new SavingsAccount("Harry");
		accounts[1] = new CheckingAccount(); 
		accounts[2] = new SavingsAccount("Peter");
		accounts[3] = new CheckingAccount(); 
		
		BankingProcessing.processAccount(accounts);
		
	}
}
