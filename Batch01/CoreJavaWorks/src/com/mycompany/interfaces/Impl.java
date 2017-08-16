package com.mycompany.interfaces;

public class Impl {
	public static void main(String[] args) {
		IAnimal [] animals = new IAnimal[4];
		
		animals[0] = new Human();
		animals[1] = new Human();
		animals[2] = new Tiger();
		animals[3] = new Tiger();
		
		
		for(IAnimal temp : animals){
			System.out.println("-------------------------------");
			temp.walk();
			temp.talk();
			temp.shout();
		}
	}
}
