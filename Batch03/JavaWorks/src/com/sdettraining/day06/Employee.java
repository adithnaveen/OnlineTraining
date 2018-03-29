package com.sdettraining.day06;

public class Employee {
	private int empId; 
	private String empName;
	
	
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
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
	@Override
	public int hashCode() {
		return this.empName.charAt(0);
	}
	@Override
	public boolean equals(Object obj) {
		Employee temp = (Employee) obj; 
		return 
				this.empId == temp.getEmpId() && 
				this.empName.equals(temp.getEmpName());
	} 
	
	
}
