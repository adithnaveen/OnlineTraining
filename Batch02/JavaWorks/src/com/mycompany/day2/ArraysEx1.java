package com.mycompany.day2;


// the starting point to execute any java program is main 
// if you have main only then the class is eligible to execute 
// if not that call is shall be called as reusable component 

public class ArraysEx1 {

	// to get the main -> type main   ctrl + space 
	public static void main(String[] args) {
		int [] arr; 
		arr = new int[5]; 
		
		arr[0] = 100; 
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		

		System.out.println("The value @ 3 is " + arr[3]);
		
		
		// to show all the values we use loop 1. for 2. while 
		
		// while loop 
		
		int count =0; 
		
		while(count < 5){
			System.out.println("The value @ " + count +" is " + arr[count]);
			count ++;
		}
		
		// for loop 
		System.out.println("-------------- for --------------------");
		for(int count1=0; count1<5; count1 ++){
			System.out.println("The value @ " + count1  + " is " + arr[count1]);
			
		}
		
		
		
		
		
		
		
		
		
		
	}
}
