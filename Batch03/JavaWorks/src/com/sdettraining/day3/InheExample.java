package com.sdettraining.day3;

public class InheExample {
	public static void main(String[] args) {
		
		VehicleBL businessLogic = new VehicleBL(); 

		// vehicleMgmtVersion01(businessLogic);

		 vehicleArray(businessLogic);
		
		
		// Since the class is defined as abstrat 
		// creating an object of the class is not allowed 
		/*Vehicle v = new Vehicle(); 
		v.move();
		
		FourWheeler fw = new FourWheeler(); 
		fw.move(); 
		fw.enginee("Cylinder Enginee");
		fw.streeing("Power");*/
		
	
	}

	private static void vehicleArray(VehicleBL businessLogic) {
		Car [] cars = new Car[5];
		
		cars[0] = new Audi(); 
		cars[1] = new Ford(); 
		cars[2] = new Audi(); 
		cars[3] = new Ford(); 
		cars[4] = new Audi(); 
		
		businessLogic.doMyJob(cars);
	}

	private static void vehicleMgmtVersion01(VehicleBL businessLogic) {
		Audi audi = new Audi(); 
		businessLogic.doMyJob(audi);
		
		System.out.println("-----------------------------------");
	
		Ford ford = new Ford(); 
		businessLogic.doMyJob(ford);
	}
}













