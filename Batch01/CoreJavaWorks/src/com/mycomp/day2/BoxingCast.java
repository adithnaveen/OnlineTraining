package com.mycomp.day2;

// program to show working of boxing 
public class BoxingCast {
	public static void main(String[] args) {
		int i = 100; // int = 4 bytes 
		short s = 200; // short = 2 bytes 
		byte b = 50; // byte = 1 byte 
		
		// auto boxing 
		i = b; // the size of int = 4 bytes , byte = 1 
		// i = 50 
		
		System.out.println("Value of i " + i);
		
		// boxing (down cast) 
		byte bb = (byte) i; 
		System.out.println("value of bb is -> "+bb);
		
	}
}
