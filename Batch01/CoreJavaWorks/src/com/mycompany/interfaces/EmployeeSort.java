package com.mycompany.interfaces;

import java.util.Arrays;

public class EmployeeSort {
	public static void main(String[] args) {
		Employee emps [] = new Employee[]{
				new Employee(101, "Harry", 3000), 
				new Employee(34, "Rashmi", 2500), 
				new Employee(55, "Luis", 3210), 
				new Employee(1005, "Madhuri", 3411), 
				new Employee(22, "Radha", 2678)
		};
		
		
		for(Employee temp : emps){
			System.out.println(temp); // temp.toString()
		}
		Arrays.sort(emps);
		
		System.out.println("---------------------------");
		
		for(Employee temp : emps){
			System.out.println(temp); // temp.toString()
		}
	}
}
