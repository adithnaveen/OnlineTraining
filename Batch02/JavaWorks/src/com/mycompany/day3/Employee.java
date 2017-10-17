package com.mycompany.day3;

// A class is called encapsulated when it has 
// a private variables and public getters and 
// setters 

// if a class has a private variables and 
// public getters and setters and 
// default constructor (if you dont have the 
// one then compiler will generate), then 
// these kind of class is called java bean 
public class Employee {
	private int empId;
	private String empName;
	private double empSal;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	
	// since the variables are 
	// private, they cannot be
	// accessed outside class 
	// in order to do it 
	// we create public mehtods
	
	// in java, the methods 
	// which helps you to expose
	// are called as getters 
	// and setters 
	
	
	// in order to set the value
	// to the variable 
	
	public void display(){
		System.out.println("Emp Id " + empId);
		System.out.println("Emp Name " + empName);
		System.out.println("Emp Sal " + empSal);
	}
	
}
