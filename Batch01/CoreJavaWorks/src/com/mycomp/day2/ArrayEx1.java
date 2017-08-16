package com.mycomp.day2;

public class ArrayEx1 {
	// to get the main method write 
	// main + ctrl + space 
	public static void main(String[] args) {
		
		
		// an array is a collection of element (variable) of similar datatype 
	
		// all arrays start with index position with o
		int [] emps = new int[5];
		
		emps[0]  = 100;
		emps[1] = 200; 
		emps[2] = 300; 
		emps[3] = 400; 
		emps[4] = 500;
		
//		System.out.println("Value at first pos " + emps[0]);
//		System.out.println("Value at second pos " + emps[1]);
		
		// WAY - 1
		// i++ is incrementing the value of i by 1 
		System.out.println("iterating using for loop ");
		for(int count =0; count<emps.length; count++){
			System.out.println("Element value @ " + (count+1) + " is " + emps[count]);
		}
		
		System.out.println("------------iteration using while loop ---------------------");

		// syntax 
		// while(condition){}

		
		{
			//you can write any thing 
		}
		
		// 0 < 5 -> true 
		// 5 < 5 -> false 
		// WAY 2 
		int count=0; 
		while(count<emps.length){
			// ++ is called as post increment 
			System.out.println("Element value is " + emps[count++]);
			
		}
		
		System.out.println("-------------- showing with for each--------------");
		
		// WAY - 3 
		for(int temp : emps){
			System.out.println("Element using for-each " + temp);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}














