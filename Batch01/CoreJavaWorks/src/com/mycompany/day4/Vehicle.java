package com.mycompany.day4;

// now this class has become immutable 


public class Vehicle {
	private int noOFWheels; 
	private int noOfSeats; 
	
	public Vehicle(int noOfWheels, int noOfSeats){
		this.noOFWheels = noOfWheels;
		this.noOfSeats = noOfSeats;
	}
	public void move(){
		System.out.println("Vehicle Moves... ");
	}
	
	public void brake(){
		System.out.println("Vehicle Brakes... ");
	}
	public final int getNoOFWheels() {
		return noOFWheels;
	}
	public final int getNoOfSeats() {
		return noOfSeats;
	}
	
}
