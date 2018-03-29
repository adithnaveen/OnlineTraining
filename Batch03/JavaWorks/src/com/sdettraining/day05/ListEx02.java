package com.sdettraining.day05;

import java.util.ArrayList;

// program to show working of type safe 
public class ListEx02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); 
		System.out.println("initial Size " + list.size());
		list.add("Welcome");  // -> list.add(new String("Welcome));
		list.add("to"); 
		list.add("generics"); 
		list.add("and");
		list.add("collection"); 
		
		System.out.println("After adding size : " + list.size());
		System.out.println(list);
		// delete element at 2nd position 
		list.remove(2); 
		System.out.println(list);
		System.out.println("After deleing size : " + list.size());
		
		list.add(2, "NEW ELEMENT");
		System.out.println(list);

		list.clear(); 
		System.out.println(list);

		/*for(String temp : list){
			System.out.println(temp);
		}*/
		
		
		
	}
}
