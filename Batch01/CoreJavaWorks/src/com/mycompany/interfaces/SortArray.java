package com.mycompany.interfaces;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		String [] arr = new String[]{"Hello", "Welcome", "How", "Are", "You"};
		
		for(String temp : arr){
			System.out.println(temp);
		}
		

		
		Arrays.sort(arr);
		
		
		System.out.println("----------------------------------");
		
		for(String temp : arr){
			System.out.println(temp);
		}

		
	}
}
