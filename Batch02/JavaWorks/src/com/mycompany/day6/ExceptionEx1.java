package com.mycompany.day6;

public class ExceptionEx1 {
	public static void main(String[] args) {
		try{
			try{
				int [] arr = new int[-4];
			}catch(NegativeArraySizeException nase){
				System.out.println("Inner Try - Catch -> " +nase);
			}
			
			int num1=10; 
			int num2=0; 
			int num3; 
			
			num3 = num1 / num2;
			
			System.out.println("Result is " + num3);
		}catch(ArithmeticException ae){
			ae.printStackTrace();
		}catch(NegativeArraySizeException nase){
			nase.printStackTrace();
		}catch(Exception e){
			System.out.println("Message -> " + e.getMessage());
		}
		System.out.println("Hey i'm some other business logic.... ");
	}
}
