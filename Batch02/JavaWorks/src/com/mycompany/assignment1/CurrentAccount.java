package com.mycompany.assignment1;

public class CurrentAccount extends Account{

	@Override
	public void roi() {
		System.out.println("The ROI for Current Account is 6.5%");
	}
	
	public void od(){
		System.out.println("You can get max OD off $10,000");
	}
}
