package com.sdettraining.day3;

public class Audi extends Car{
	public void musicSystem(String musicSystem){
		System.out.println("Audi Has : "+ 
				musicSystem);
	}
	
	public boolean hasAbs(){
		return true; 
	}

	@Override
	public void streeing(String steeringType) {
		System.out.println("Audi has Steering Type : " + steeringType);
	}

	@Override
	public void enginee(String engineType) {
		System.out.println("Audi Car has " + engineType +" engine type ");
	}

	@Override
	public void move() {
		System.out.println("Audi Car is Moving... ");
	}

	@Override
	public void doors() {
		System.out.println("Audi Has Sports version has :"
				+ " 2 doors  and other have 4 Doors ");
	}
	
	
	
}
