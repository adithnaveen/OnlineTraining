package com.sdettraining;

public class Basics01 {
	public static void main(String[] args) {
		// command line argument 
		int num = Integer.parseInt(args[0]);
		
		// 10 x 1 = 10 
		for(int i=1; i<=10; i++){
			System.out.println(num + "X" + i +"="  + (num*i));
		}
	}
}
