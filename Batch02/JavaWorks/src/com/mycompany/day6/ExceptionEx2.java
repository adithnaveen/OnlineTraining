package com.mycompany.day6;

public class ExceptionEx2 {
	public static void main(String[] args) {
		int arr[] = new int[5];
		try{
		arr[3] = 300;
		// arr[10] = 1000;
		}catch(ArrayIndexOutOfBoundsException aiobe){
			// to exit gracefully 
			aiobe.printStackTrace();
		}finally{
			System.out.println("Hey I'm always there.... ");
			
		}
		
	}
}
