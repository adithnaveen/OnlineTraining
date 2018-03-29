package com.sdettraining.day06;

import java.util.HashSet;

public class EmployeeSetClient {
	public static void main(String[] args) {
		HashSet<Employee> set = new HashSet<Employee>(); 

		set.add(new Employee(101, "Kumar"));
		set.add(new Employee(34, "Harry"));
		set.add(new Employee(56, "Peter"));
		set.add(new Employee(112, "Luis"));
		set.add(new Employee(4, "Charlie"));
		set.add(new Employee(4, "Charlie"));
		
		for(Employee temp : set){
			System.out.println(temp.getEmpId() +", " + temp.getEmpName() +", " + 
					temp.hashCode());
		}
	}
}
