package com.sdettraining.day05;

import java.util.Arrays;

public class DeviceSortImpl {
	public static void main(String[] args) {
		Devices [] devices = new Devices[]{
				new Devices(101, "Computer", 3434), 
				new Devices(34, "Laptop", 4444), 
				new Devices(12, "Marker", 34), 
				new Devices(77, "IPad", 340)
		};

		for(Devices temp : devices){
			System.out.println(temp);
		}
		
		Arrays.sort(devices);
		System.out.println("-----------After Sort----------------");

		for(Devices temp : devices){
			System.out.println(temp);
		}
		
	}
}
