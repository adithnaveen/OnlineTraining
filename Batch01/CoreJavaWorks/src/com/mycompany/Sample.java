package com.mycompany;

public class Sample {
	public static void main(String[] args) {
		int val1 = 1000;
		int val2 = 2200;
		int val3 = 300;
		
		if(val1 > val2 && val1 > val3){
			System.out.println("Val1 is largest");
		} else if(val2 > val3){
			System.out.println("Val2 is largest");
		}else{
			System.out.println("Val3 is largest");
		}
		
		// ternary operators 
		
		System.out.println((val1> val2 && val1 >val3)?"VAL1 is Largest" 
				:(val2>val3)?"VAL2 is Largest":"VAL3 is Largest");
		
	}
}
