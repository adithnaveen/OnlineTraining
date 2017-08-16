package com.mycompany.polymorphism;

public class VehicleBL {
	public void showVehicle(Vehicle [] vehicles){
		for(Vehicle temp : vehicles){
			
			System.out.println("------------------");
			// dynamically loaded 
			temp.move();
			
			if(temp instanceof FourWheeler){
				((FourWheeler)temp).hasDoors();
			}else if(temp instanceof TwoWheeler){
				((TwoWheeler)temp).hasHandle(); 
			}
		}
	}
}
