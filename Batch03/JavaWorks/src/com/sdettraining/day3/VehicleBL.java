package com.sdettraining.day3;

public class VehicleBL {
	public void doMyJob(Audi audi){
		audi.doors();
		audi.enginee("8 Piston");
		System.out.println("Audi Has Abs : "+audi.hasAbs());;
		audi.move();
		audi.musicSystem("sony");
		audi.streeing("Power Steering");
	}
	
	public void doMyJob(Ford ford){
		ford.doors(); 
		ford.enginee("8 Cylinder");
		ford.fuelCapacity();
		System.out.println("Ford Has Airbags" +ford.hasAirBags());
		ford.streeing("Power Steering");
	}
	
	
	// dynamic method dispatch 
	public void doMyJob(Car [] cars){
		// 1. audi 
		// 2. ford 
		for(Car temp : cars){
			System.out.println("-----------------------------");
			temp.doors();
			temp.enginee("8 Piston");
			temp.move();
			temp.streeing("Power");

			if(temp instanceof Audi){
				((Audi)temp).musicSystem("Sony");
				System.out.println("Audi Has Abs : " + ((Audi) temp).hasAbs());
			}else if(temp instanceof Ford){
				System.out.println("Ford Has AirBags : " + ((Ford) temp).hasAirBags());
				((Ford) temp).fuelCapacity();
			}
			
		}
	}
}
