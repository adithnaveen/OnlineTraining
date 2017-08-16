package com.mycompany.interfaces;

public class Employee implements Comparable<Employee>{
	private int empId;
	private String empName;
	private double empSal;
	
	public Employee(){}

	public Employee(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	public final int getEmpId() {
		return empId;
	}

	public final void setEmpId(int empId) {
		this.empId = empId;
	}

	public final String getEmpName() {
		return empName;
	}

	public final void setEmpName(String empName) {
		this.empName = empName;
	}

	public final double getEmpSal() {
		return empSal;
	}

	public final void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

	@Override
	public int compareTo(Employee o) {
	// return this.empId - o.empId;
		// ascending 
		// return this.empName.compareTo(o.empName);
		
		// in descending order 
		return o.empName.compareTo(this.empName);
		
		
		
		// 101 - 40 -> +ve 
		// 101 - 101 -> zero 
		// 101 - 201 -> -ve 
	}
	
}
















