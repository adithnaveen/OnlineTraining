package com.mycompany.day3;

public class TwoWheeler extends Vehicle{
	
	// 1. it has kick start
	// 2. it move -> Vehicle 
	public void kickStart(){
		System.out.println("All two wheelers comes with kick start... ");
	}
	
	@Override
	public void move(){
		System.out.println("Two Wheeler MOves... ");
	}
}
