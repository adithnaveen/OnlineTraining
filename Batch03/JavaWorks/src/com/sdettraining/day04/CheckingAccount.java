package com.sdettraining.day04;

public class CheckingAccount 
	implements BankingRule {

	@Override
	public void roi() {
		System.out.println("ROI for Checking account 6.5" );
	}

	@Override
	public void fine() {
		System.out.println("Checking account will have fine if not maintained $500");
	}
	
}
