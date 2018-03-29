package com.sdettraining.day04;

public class Employee {
	private int empId; 
	private String empName; 
	private double empSal; 
	
	// class level variables 
	private static int count = 100; 
	
	public Employee(String empName, double empSal){
		this.empId = count ++; 
		this.empName = empName; 
		this.empSal = empSal; 
	}
	
	public void display(){
		System.out.println(empId +", " + empName +", " + empSal);
	}
}
