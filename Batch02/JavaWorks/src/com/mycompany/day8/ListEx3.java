package com.mycompany.day8;

import java.util.Vector;

public class ListEx3 {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>(10, 5);
		
		
		System.out.println("Size " + vec.size());
		System.out.println("Capacity " + vec.capacity());
		
		
		vec.add("srinivas");
		vec.add("Mohan");
		vec.add("Mini");
		vec.add("Alia");
		vec.add("srinivas");
		vec.add("Mohan");
		vec.add("Mini");
		vec.add("Alia");
		vec.add("Sujith");
		vec.add("Sujith");
		vec.add("Sarika");
		
		System.out.println(vec);
		System.out.println("After adding Size " + vec.size());
		System.out.println("After adding Capacity " + vec.capacity());
		
	}
}
