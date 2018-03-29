package com.sdettraining.day02;



// a Bean class is the one which has 
// default constructor 
// private variables 
// getters and setters 

public class Employee {
	private int empId;
	private String empName; 
	private double empSal;
	private String email; 
	
	
	

	// if you dont have the
	// the constructor in java 
	// then the compiler 
	// at compilation time 
	// will create a default 
	// constructor 
	
	// if the constructor does not
	// take any params then 
	// it is called default 
	// constructor 
	Employee(){}

	// parametric constructor 
	Employee(int empId, String  empName, double empSal, String email){
		this.empId = empId; 
		this.empName = empName; 
		this.empSal  = empSal; 
		this.email = email; 
	}
	
	
	
	// setters 
	void setEmpId(int empId){
		this.empId = empId; 
	}
	
	void setEmpName(String empName){
		this.empName = empName; 
	}
	
	
	// as of now its a message we can also 
	// throw some exception 
	void setEmpSal(double empSal){
		if(empSal<5000){
			System.out.println("Sorry Salary is too less, so equaled to 5000");
			this.empSal = 5000;
		}else{
			this.empSal = empSal;
		}
	}
	
	void setEmail(String email){
		this.email= email;
	}
	
	int getEmpId(){
		return this.empId;
	}

	String getEmpName() {
		return empName;
	}

	double getEmpSal() {
		return empSal;
	}

	String getEmail() {
		return email;
	}
	
	
	
	// this method is taken from object class 
	
	public String toString(){
		return this.empId +", " + this.empName +", " + this.empSal +", " + this.email;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
