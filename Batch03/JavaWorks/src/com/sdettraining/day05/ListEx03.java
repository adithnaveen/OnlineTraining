package com.sdettraining.day05;

import java.util.Vector;

public class ListEx03 {
	public static void main(String[] args) {
		Vector<String> list = new Vector<String>(5, 4); 
		System.out.println("Vector has initial capacity : "+ list.capacity());
		System.out.println("Initial size of vector : " + list.size());
		
		list.add("Sujith"); 
		list.add("Harry"); 
		list.add("Lisa"); 
		list.add("Sridevi"); 
		list.add("Sujith"); 
		list.add("Harry"); 
		list.add("Lisa"); 
		list.add("Sridevi"); 
		list.add("Lisa"); 
		list.add("Sridevi"); 
		list.add("Aswini"); 
		
		System.out.println(list);
		System.out.println("Capacity after adding " + list.capacity());
		System.out.println("Size after addign " + list.size());
		 
	}
}
