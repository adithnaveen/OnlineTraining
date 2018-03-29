package com.sdettraining.day04;

public class StaticEx01 {
	
	// member function / behaviour / method 
	public static int add(int num1, int num2){
		return num1 + num2; 
	}
	
	public static void main(String[] args) {
		
		StaticEx01 s = new StaticEx01(); 
		// s.add(200, 300); 
		int res = add(100, 200); 
		System.out.println("Res " + res );
	}
}
