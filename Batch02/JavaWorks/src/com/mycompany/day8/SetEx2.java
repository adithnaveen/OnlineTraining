package com.mycompany.day8;

import java.util.TreeSet;

public class SetEx2 {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("Sarika");  // -> new String("Sarika")
		ts.add("Hareesh");
		ts.add("Peter");
		ts.add("Alia");
		
		System.out.println(ts);
	}
}
