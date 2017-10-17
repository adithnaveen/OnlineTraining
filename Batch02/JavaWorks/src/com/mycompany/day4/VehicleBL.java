package com.mycompany.day4;

import com.mycompany.day3.FourWheeler;
import com.mycompany.day3.TwoWheeler;
import com.mycompany.day3.Vehicle;

public class VehicleBL {
	public static void processVehicle(Vehicle [] arr){

		for(int i=0; i<arr.length; i++){
			System.out.println("---------------------------------");
			arr[i].move();
			
			if(arr[i] instanceof FourWheeler){
				((FourWheeler)arr[i]).steering();
			}else if(arr[i] instanceof TwoWheeler){
				((TwoWheeler)arr[i]).kickStart();
			}
		}
	}
}
