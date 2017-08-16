package com.mycompany.day3;

// this is client program 
public class EmpEncapsulationEx1 {
	public static void main(String[] args) {
		Employee e = new Employee();
		
//		e.empId = 101; 
//		e.empName ="Harry";
//		e.empSal=-20000;
		
		e.setEmpId(101);
		e.setEmpName("Peter");
		e.setEmpSal(150);
		
//		e.display();
		System.out.println("Emp Id " + e.getEmpId());
		System.out.println("Emp Name " + e.getEmpName());
		System.out.println("Emp Sal " + e.getEmpSal());
	}
}
