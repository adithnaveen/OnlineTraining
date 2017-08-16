package com.mycompany.day4;

public class FourWheeler extends Vehicle{
	private int speed; 
	public FourWheeler(int noOfWheels, int noOfSeats) {
		super(noOfWheels, noOfSeats);
	}

	public void accelarate(){
		System.out.println("FourWheeler speed now after Accelarate: " + ( ++ speed ));
	}

	@Override
	public void brake() {
		System.out.println("FourWheeler Speed now after Brake " + (--speed));
	}
	
	public void steering(){
		System.out.println("All Four Wheeler's has Steering... ");
	}
	
}
