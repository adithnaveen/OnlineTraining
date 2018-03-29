package com.sdettraining.day07;

public class FinallyEx {
	public static void main(String[] args) {
		try{
			/// open connection 
			System.out.println("This is for testing... ");
			int i=1; 
			if(i==0){
				throw new RuntimeException("Throwing some exception from user");
				
			}
			System.out.println("some job goes here");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("Close of DB Connection Goes here ");
		}
	}
}
