package com.mycompany.day2;

public class ConditionalOperatorEx1 {
	public static void main(String[] args) {
		int num1 = 100; 
		int num2 = 200; 
		
		if(num1 > num2 ){
			System.out.println("Number 1 is greater");
		}else{
			System.out.println("Number 2 is greater");
		}

		// ternary operator 
		System.out.println(num1>num2 ? "Number 1 is large"  : "Number 2 is large");
		
	}
}
