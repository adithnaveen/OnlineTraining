package com.sdettraining.day05;

import java.util.ArrayList;

public class ListEx01 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// raw or object type 
		ArrayList list = new ArrayList(); 
		
		list.add("hello"); 
		list.add(new Object()); 
		list.add(true); 
		list.add(45.55); 
		list.add("another");
		
		for(Object temp : list){
			System.out.println(temp);
		}
	}
}
