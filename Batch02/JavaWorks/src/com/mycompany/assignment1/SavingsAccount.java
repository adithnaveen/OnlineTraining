package com.mycompany.assignment1;

public class SavingsAccount extends Account{

	@Override
	public void roi() {
		System.out.println("The ROI for Saving Account is 3.5%");
	}

	public void childPlan(){
		System.out.println("The Child plan Savings Account will get \n Benefit of 0.5% more");
	}
}
