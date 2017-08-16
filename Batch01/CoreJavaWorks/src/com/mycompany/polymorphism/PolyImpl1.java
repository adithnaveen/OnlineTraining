package com.mycompany.polymorphism;

public class PolyImpl1 {
	public static void main(String[] args) {
		Vehicle [] vehicles = new Vehicle[5];
		
		vehicles[0] = new FourWheeler();
		vehicles[1] = new TwoWheeler();
		vehicles[2] = new FourWheeler();
		vehicles[3] = new TwoWheeler();
		vehicles[4] = new Truck();
		
		new VehicleBL().showVehicle(vehicles);
		
	}
}
