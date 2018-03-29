package com.sdettraining.day04;

// 1. in java const is reserved for future use final is used instead 
//2. in java if you want to stop inheritance then define that class with final 
//3. if you dont want some methods to be overridden then define it as final 

/*
 class Account{
	public final void viewBalance(){
	}
}

class SavingsAccount  extends Account{
	public void viewBalance(){
	}
}


class MyString extends String {
	
}
*/
public class FinalEx01 {
	
	public static void main(String[] args) {
		final int NO_OF_EMPS = 100; 
		
		System.out.println(NO_OF_EMPS);
		
		// NO_OF_EMPS = 101; 
		
		
	}
}
