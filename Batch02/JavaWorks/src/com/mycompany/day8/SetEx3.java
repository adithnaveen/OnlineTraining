package com.mycompany.day8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class SetEx3 {
	public static void main(String[] args) {
		HashSet<Employee> hs = new HashSet<Employee>();
		

		hs.add(new Employee(101, "Padma", 10000));
		hs.add(new Employee(123, "Hareesh", 11223));
		hs.add(new Employee(222, "Mohan", 22233));
		hs.add(new Employee(333, "Mini", 12345));

		// duplicates are not allowed 
		hs.add(new Employee(333, "Mini", 12345));
		hs.add(new Employee(333, "Mini", 12345));
		
		for(Employee temp : hs){
			System.out.println(temp +", Hashcode @ " + temp.hashCode());
		}
		
		
	}
}
