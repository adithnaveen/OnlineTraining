package com.mycompany.day3;

public class FourWheeler extends Vehicle{
	
	// four wheeler has two behaviors 
	// 1. steering 
	// 2. moves which comes from vehicle... 
	public void steering(){
		System.out.println("all Four Wheelers comes with steering... ");
	}

	@Override
	public void move() {
		System.out.println("Four Wheeler is moving... ");
	}
}
