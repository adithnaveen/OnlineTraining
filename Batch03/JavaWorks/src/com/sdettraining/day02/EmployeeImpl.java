package com.sdettraining.day02;

public class EmployeeImpl {
	public static void main(String[] args) {
		Employee emp = null ;
		emp = new Employee();

		emp.setEmpId(101);
		emp.setEmpName("Sujith");
		emp.setEmpSal(2000);
		emp.setEmail("sujith@gmail.com");

		System.out.println("Emp Id "+ emp.getEmpId());
		System.out.println("Emp Name " + emp.getEmpName());
		System.out.println("Emp Sal " + emp.getEmpSal());
		System.out.println("Emp Email " + emp.getEmail());
	}
}
