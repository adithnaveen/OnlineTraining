package com.mycompany.assignment1;

public class AccountBL {
	public void doMyJob(Account [] arr){
		for(Account temp : arr){
			temp.roi();
			
			if(temp instanceof SavingsAccount){
				((SavingsAccount)temp).childPlan();
			} else if(temp instanceof CurrentAccount){
				((CurrentAccount)temp).od();
			}
			
			System.out.println("--------------------------");
		}
	}
}
