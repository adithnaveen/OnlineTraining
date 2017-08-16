package com.mycompany.polymorphism;

public class PolyImpl {
	public static void main(String[] args) {
		// this is called as reference 
		Vehicle v ; 
		
		// v is called as instance 
		v = new FourWheeler();
		v.move();
		((FourWheeler)v).hasDoors(); 
		
		v = new TwoWheeler();
		v.move();
		((TwoWheeler)v).hasHandle(); 
	}
}
