package com.sdettraining.day06;

import java.util.HashSet;

public class SetEx01 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>(); 
		
		System.out.println(set.add("Aswini")); 
		System.out.println(set.add("Aswini")); 
		System.out.println(set.add("Aswini")); 
		System.out.println(set.add("Aswini")); 
		System.out.println(set.add("Aswini")); 
		set.add("Andy"); 
		set.add("Zafrin"); 
		set.add("Bob"); 
		
		System.out.println(set);
	}
}
