package com.sdettraining.day3;

public class Ford extends Car{
	public boolean hasAirBags(){
		return true; 
	}
	
	public void fuelCapacity(){
		System.out.println("Ford Cars has 15 Gallons Fuel capacity");
	}

	@Override
	public void doors() {
		System.out.println("Ford has 4 doors");
	}

	@Override
	public void move() {
		System.out.println("Ford move at top speed of 100 MPH");
	}
}
