package com.mycompany.day4;

public class Toyota extends Car{

	public Toyota(int noOfWheels, int noOfSeats,
			int noOfDoors) {
		super(noOfWheels, noOfSeats, noOfDoors);
	}

	public void hasAbs(){
		System.out.println("Toyota has abs... ");
	}
	
	public void powerBrake(){
		System.out.println("Toyota has Power Braking System...");
	}
}
