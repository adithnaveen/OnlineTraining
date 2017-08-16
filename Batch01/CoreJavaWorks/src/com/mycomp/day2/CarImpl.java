package com.mycomp.day2;

public class CarImpl {
	public static void main(String[] args) {
		
		Runtime.runFinalizersOnExit(true);
		Car audi; 
		audi = new Car();
		
		Car toyota = new Car();
		
		System.out.println("initial speed " + toyota.speed);
		toyota.accelarate();
		System.out.println("After accelarate " +toyota.speed);
		
		toyota.accelarate();
		System.out.println("After accelarate " +toyota.speed);
		
		toyota.accelarate();
		System.out.println("After accelarate " +toyota.speed);
		
		toyota.brake();
		System.out.println("After brake " + toyota.speed);
		
		//invoking gc is not a good idea 
		// gc is resource intensive job 
		Runtime.getRuntime().gc();
	}
}
