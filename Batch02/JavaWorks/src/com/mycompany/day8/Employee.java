package com.mycompany.day8;


public class Employee{
	private int empId;
	private String empName;
	private double empSal;
	
	public Employee(){
		
	}
	
	public Employee(int empId, String empName, double empSal){
		this.empId= empId;
		this.empName = empName; 
		this.empSal = empSal;	
	}
	
	
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

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

	@Override
	public int hashCode() {
		return this.empName.charAt(0);
	}

	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		
		if(this.empId == emp.empId 
				&& this.empName.equals(emp.empName) 
				&& this.empSal == emp.empSal)
		{
			return true;
		}else {
			return false;
		}

	}

	

}









