package com.mycompany.exceptions;

public class ExceptionEx2 {
	
	
	// is to check min 6 chars
	public static void checkName(String name){
		if(name.length() < 6){
			throw new RuntimeException("Sorry name cannot be less than 6 char");
		} else{
			System.out.println("Given name is valid");
		}
	}
	
	public static void payIncomeTax(int income, String name)
		throws MyIncomeTaxException{
		try{
		checkName(name);
		
			if(income<50000){
				System.out.println("You dont have to pay Tax");
			}else  if(income >=50000 && income < 80000){
				throw new RuntimeException("Bracket-1 -> Sorry you are taxable Mr/Ms/Mrs: " +name +", you claimed " + income);
			}else if(income >=80000 && income < 100000){
				
				throw new MyIncomeTaxException("Bracket-2 -> Sorry you are taxable Mr/Ms/Mrs: " +name +", you claimed " + income);
				
			}
		}catch(RuntimeException re){
			throw new RuntimeException("Your income tax is not processed becasue", re);
		}
	}
	
	public static void main(String[] args) {
		// checkName("Harry Potter");
		try{
			payIncomeTax(90000, "Harry Potter");
		}catch(ArithmeticException ae){
			ae.printStackTrace();
		}catch(RuntimeException rte){
			rte.printStackTrace();
		}catch(MyIncomeTaxException mitx){
//			System.out.println(mitx);
			mitx.printStackTrace();
		}
		System.out.println("hey this is some delegation code goes here.... ");
	}
}
