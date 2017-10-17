package com.mycompany.day8;

import java.util.ArrayList;

public class ListEx1 {
	public static void main(String[] args) {
		
		// generic type of arraylist 
		// raw type 
		// the problem with this is, you have not specified the datatype 
		ArrayList list = new ArrayList();
		
		list.add(101);
		list.add("Welcome");
		list.add(true);
		list.add(34.45);
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}
}
