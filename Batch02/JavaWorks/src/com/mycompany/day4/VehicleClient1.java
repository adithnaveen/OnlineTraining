package com.mycompany.day4;

import com.mycompany.day3.FourWheeler;
import com.mycompany.day3.TwoWheeler;
import com.mycompany.day3.Vehicle;

public class VehicleClient1 {
	public static void main(String[] args) {
		Vehicle arr[] = new Vehicle[5];

		arr[0] = new FourWheeler();
		arr[1] = new TwoWheeler();
		arr[2] = new FourWheeler();
		arr[3] = new TwoWheeler();
		arr[4] = new TwoWheeler();
		
		VehicleBL.processVehicle(arr);
		
	}
}
