package com.mycompany.polymorphism;

public class TwoWheeler  extends Vehicle{
	public void hasHandle(){
		System.out.println("Two Wheelers Has handles.. ");
	}

	@Override
	public void move() {
		System.out.println("Two Wheeler is Moving");
	}
	
	
}
