package com.mycompany.polymorphism;

public abstract class Vehicle {
	// if you have not got the method as concrete {}
	// then make the method prefixed with access 
	// modifier called abstract 
	
	
	// if the class has atlest 1 abstract method 
	// then the class shall be abstract
	
	// if the class is abstract then creating 
	// an object of that class is not allowed 
	
	// Vehicle v  = new Vehicle(); 
	public abstract void move();
}
