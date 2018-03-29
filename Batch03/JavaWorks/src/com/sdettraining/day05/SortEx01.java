package com.sdettraining.day05;

import java.util.Arrays;

public class SortEx01 {
	public static void main(String[] args) {
		String [] myStrs = {"Sridevi", "Naveen", "Aswini", "Sujith"};
		
		
		for(String temp : myStrs){
			System.out.println(temp);
		}
		
		Arrays.sort(myStrs);
		
		System.out.println("-------------After Sorting-------------");

		for(String temp : myStrs){
			System.out.println(temp);
		}
		
	}
}
