package com.mycompany.day3;

public class VehicleClient {
	public static void main(String[] args) {
//		FourWheeler fw1 = new FourWheeler();
//		fw1.move();
//		fw1.steering();
//		
//		TwoWheeler tw1 = new TwoWheeler();
//		tw1.moves();
//		tw1.kickStart();
		
		// reference 
		Vehicle v; 
		
		v = new FourWheeler(); 
		v.move();
		((FourWheeler)v).steering();
		
		v= new TwoWheeler(); 
		v.move();
		((TwoWheeler)v).kickStart();
	}
}
