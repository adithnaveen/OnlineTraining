package com.mycompany.day4;

public class Car extends FourWheeler{
	int noOfDoors;
	public Car(int noOfWheels, int noOfSeats, 
			int noOfDoors) {
		// we can have reusability 
		super(noOfWheels, noOfSeats);
		this.noOfDoors = noOfDoors;
	}
	public final int getNoOfDoors() {
		return noOfDoors;
	}

	
}
