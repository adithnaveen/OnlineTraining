package com.mycompany.exceptions;

public class ExceptionEx1 {
	public static void main(String[] args) {
		try{
			try{
			int [] arr = new int[-4];
			}catch(NegativeArraySizeException nase){
				System.out.println("Sorry please dont initialize with -ve values for array ");
			}
			int [] arr1 = new int[5];
			arr1[40] = 3333;
			
			int num1 = 10; 
			int num2 = 0; 
			int res =  num1 / num2; //  --------------> for OS, abort 
	
			System.out.println("Result is  "+ res); 
		}catch(ArithmeticException ae){
			System.out.println("Please dont divide by zero -> " + ae.getMessage());
		}catch(NegativeArraySizeException nase){
			System.out.println("Hey You tried initializing the array with -ve value");
		}catch(ArrayIndexOutOfBoundsException aiobe){
			aiobe.printStackTrace();
		}
		catch(Exception e){
			// System.out.println("Sorry Please dont Divide by zero");
			// System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("I've some other business logic");
	}
}
