package com.mycompany.collections;

import java.util.HashSet;

// when it comes to set 1. HashSet 2. TreeSet 
public class CollectionEx4 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("Rashmi");
		set.add("Radha");
		set.add("Ramy");
		set.add("Romeo");
		set.add("Romeo");
		set.add("Romeo");
		set.add("Romeo");
		set.add("Romeo");
		set.add("Romeo");
		
		
		System.out.println(set);
	}
}
