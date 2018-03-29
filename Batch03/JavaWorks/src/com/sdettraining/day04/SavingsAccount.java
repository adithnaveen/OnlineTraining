package com.sdettraining.day04;

public class SavingsAccount 
	extends Account 
	implements BankingRule {
	
	private String customerName; 
	
	public SavingsAccount(String customerName){
		this.customerName = customerName;
	}
	
	@Override
	public void roi() {
		System.out.println("Savings Account ROI 3.5" );
	}

	@Override
	public void fine() {
		System.out.println("If you dont maintain min balance then $10");
	}

	@Override
	public void minBalance() {
		System.out.println("Min Balance is $200");
	}
	
	public void setCustomerName(String customerName){
		this.customerName = customerName; 
	}
	public String getCustomerName(){
		return this.customerName; 
	}
	
}
