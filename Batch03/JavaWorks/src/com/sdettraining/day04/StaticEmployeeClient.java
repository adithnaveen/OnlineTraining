package com.sdettraining.day04;

public class StaticEmployeeClient {
	
	static{
		System.out.println("this is coming from static block -01");
	}
	static{
		System.out.println("this is coming from static block -02");
	}
	
	
	public static void main(String[] args) {
		// india 
		Employee emp1 = new Employee("Kumar", 1212);
		// usa 
		Employee emp2 = new Employee("Aswini", 4000); 
		Employee emp3 = new Employee("Sridevi", 5000);
		Employee emp4 = new Employee("Sujith", 4000); 

		
		emp1.display(); 
		emp2.display();
		emp3.display();
		emp4.display();
	}
	
	static{
		System.out.println("this is coming from static block -03");
	}
	
}
