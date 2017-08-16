package com.mycomp.day2;


public class Car {
	// variables 
	String carName; 
	int gear; 
	int speed; 
	
	// methods / behaviour 
	
	void brake(){
		speed --; 
	}
	
	void accelarate(){
		speed ++;
	}
	
	void upGear(){
		gear ++; 
	}
	
	void downGear(){
		gear --;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Hey i'm finalize in Car" );
	}
	
	
}
