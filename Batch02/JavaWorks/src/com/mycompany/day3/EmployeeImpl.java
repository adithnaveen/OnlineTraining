package com.mycompany.day3;

public class EmployeeImpl {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpId(101);
		emp.setEmpName("Harry");
		emp.setEmpSal(20000);
		
		emp.display();
		
		Employee emp1 = new Employee();
		emp1.setEmpId(102);
		emp1.setEmpName("Ramya");
		emp1.setEmpSal(30000);
		emp1.display();
	}
}
