package com.mycompany.day3;


// Java Bean 
// a java bean class is the one which has 
// private variables 
// default constructor (if you dont create the one 
// then compiler will give) 
// public getters and setters 

public class Employee {
	// accessing the variable now, is permitted 
	// only within the class 
	private int empId;
	private String empName;
	private double empSal;
	
	
	// behviour 
	
	void display(){
		System.out.println("Emp Id " + empId);
		System.out.println("Emp Name " + empName);
		System.out.println("Emp Sal " + empSal);
	}
	
	// setters(mutators/change)
	
	public void setEmpId(int empId){
		this.empId=empId;
	}
	
	
	public void setEmpName(String empName){
		this.empName = empName;
	}
	
	public void setEmpSal(double empSal){
		if(empSal < 10000){
			System.out.println("Sorry Salary cannot be less than 10k");
			this.empSal = 10000;
		}else{
			this.empSal = empSal;
		}
	}
	
	// getters (accessors)
	
	public int getEmpId(){
		return this.empId;
	}
	
	public String getEmpName(){
		return this.empName;
	}
	
	public double getEmpSal(){
		return this.empSal;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
