package com.mycompany.day5;

public class InterfaceClient {
	public static void main(String[] args) {
		Animal a = new Tiger();
		
		a.talk();
		a.walk();
		
		a = new Human(); 
		System.out.println("----------------------------");
		a.talk();
		a.walk();
		
		((IBehaviour)a).dressCode();
		((IBehaviour)a).workTimings();
	}
}
