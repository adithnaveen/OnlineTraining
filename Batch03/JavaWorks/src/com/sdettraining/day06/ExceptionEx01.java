package com.sdettraining.day06;

public class ExceptionEx01 {
	public static void main(String[] args) {
		
		try{
			// 10 / 0 
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]); 
			int num3 = Integer.parseInt(args[2]);
			
			try{
				int [] myarr = new int[-4];
			}catch(NegativeArraySizeException nas){
				System.out.println("oh Sorry You tried initialzing arry with -ve int "
						+ nas);
			}
			int res = num1 / num2; // -> the abort signal was triggered to OS 
			
			System.out.println("Result is " + res);
		}catch(ArithmeticException ae){
			System.out.println("Please dont divide by zero "+ae );
		}catch(NumberFormatException nfe){
			System.out.println("You tried converting chars to numbers, which is wrong: "+nfe);
		}catch(ArrayIndexOutOfBoundsException aiobe){
			System.out.println("You dont have the array value passed still you try accessing: "+aiobe);
		}catch(Exception ex){
			System.out.println("Exception -> Exception caught :" + ex);
		}
		System.out.println("Some other business logic goes here... ");
	}
}
