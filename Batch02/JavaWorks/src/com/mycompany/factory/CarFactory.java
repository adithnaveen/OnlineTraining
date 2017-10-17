package com.mycompany.factory;

class BMW extends Car{
	public BMW() {
		System.out.println("BMW is getting create");
	}
	
}
class Audi extends Car{
	public Audi(){
		System.out.println("Audi is getting created");
	}
}


class Toyota extends Car{
	public Toyota(){
		System.out.println("Toyota is getting created... ");
	}
}


class Car{
	public static Car getCar(String carName){
		if(carName.equals("bmw")){
			return new BMW();
		}else if(carName.equals("audi")){
			return new Audi();
		}else if(carName.equals("toyota")){
			return new Toyota();
		}
		
		return null;
	}
}

interface CarNames{
	String BMW ="bmw";
	String AUDI ="audi";
	String TOYOTA ="toyota";
}












public class CarFactory {
	public static void main(String[] args) {
		
		Car bmw = Car.getCar(CarNames.AUDI);
		
	}
}
