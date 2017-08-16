package com.mycompany.polymorphism;

public class FourWheeler extends Vehicle{
	public void hasDoors(){
		System.out.println("All Four Wheeler has doors... ");
	}

	@Override
	public void move() {
		System.out.println("Four Wheeler is Moving ");
	}
	
	
}
