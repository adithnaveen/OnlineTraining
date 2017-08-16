package com.mycompany.collections;

import java.util.Vector;

// this program is to show working of vector 
public class CollectionEx3 {
	public static void main(String[] args) {
		// when you create a vector by default there will be 
		// 10 blocks of memory requested 
		Vector<String> vec = new Vector<String>();
		
		System.out.println("Before values are stored  " + vec.size());
		System.out.println("Request from OS is " + vec.capacity());
		

		vec.add("Rashmi");
		vec.add("Srinivas");
		vec.add("Luis");
		

		vec.add("Rashmi");
		vec.add("Srinivas");
		vec.add("Luis");
		

		vec.add("Rashmi");
		vec.add("Srinivas");
		vec.add("Luis");
		
		vec.add("Rashmi");
		vec.add("Srinivas");
		
		
		System.out.println("After values are stored  " + vec.size());
		System.out.println("The capacity after inserted " + vec.capacity());
	}
}
