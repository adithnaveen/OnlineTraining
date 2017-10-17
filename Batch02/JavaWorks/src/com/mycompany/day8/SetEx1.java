package com.mycompany.day8;

import java.util.HashSet;

public class SetEx1 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		System.out.println(set.add("Alia"));
		System.out.println(set.add("Hareesh"));
		System.out.println(set.add("Sujith"));
		
		System.out.println(set.add("Alia"));
		
		System.out.println(set);
		
	}
}
