package com.mycompany.collections;

import java.util.ArrayList;

// program to understand working of Raw type with collection 
// all legacy code will look like this 

public class CollectionEx1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		System.out.println("Initial size of List is " + list.size());
		list.add(10);
		list.add("hello");
		list.add(true);
		list.add(new Object());
		list.add(34.5);
		System.out.println("After adding the elements size id " + list.size());
		
	}
}
