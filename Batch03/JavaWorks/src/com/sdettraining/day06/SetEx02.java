package com.sdettraining.day06;

import java.util.TreeSet;

public class SetEx02 {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>(); 
		
		System.out.println(set.add("Aswini")); 
		System.out.println(set.add("Aswini")); 
		System.out.println(set.add("Aswini")); 
		System.out.println(set.add("Aswini")); 
		System.out.println(set.add("Aswini")); 
		set.add("Andy"); 
		set.add("Zafrin"); 
		set.add("Harry"); 
		set.add("Peter"); 
		set.add("Bob"); 
		
		System.out.println(set);
	}
}
