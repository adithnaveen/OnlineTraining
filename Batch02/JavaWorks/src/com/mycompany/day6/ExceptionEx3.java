package com.mycompany.day6;

import java.io.IOException;

// to show working of checked exception 
// to show working of throw and throws 


public class ExceptionEx3 {

	public static void checkHikeSal(String name, int hike)
		throws IOException{
		if(hike > 1000){
			System.out.println("I'm good to go for  next fiscal");
		}else{
			throw new IOException("Sorry My Hike is less, need reason");
		}
	}
	
	public static void main(String[] args) {

		try{
			checkHikeSal("Srinivas", 300);
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		
		System.out.println("some other business logic goes here... ");
	}
}
