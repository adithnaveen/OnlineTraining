package com.mycompany.day3;

// to uderstand void vs return type(int/ float) 
public class Testing {
	public static void hi1(){
		// most of of our business logic goes here 
		System.out.println("Something goes here -> hi1");
	}
	
	public static String hi2(){
		return "Something goes here -> hi2";
	}
	public static void main(String[] args) {
		hi1();
		System.out.println(hi2());
	}
}
