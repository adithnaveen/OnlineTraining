package com.mycompany.io;

import java.io.Serializable;

// Serializable interface is called as Market Interface 
// this interface doesnot have any methods 
public class Emp implements Serializable{
	private int empId;
	private String empName;
	private double empSal;
	
	
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
	
	
}
