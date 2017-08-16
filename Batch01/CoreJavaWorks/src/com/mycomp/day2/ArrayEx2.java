package com.mycomp.day2;

import java.util.Random;

public class ArrayEx2 {
	public static void main(String args[]) {
		// in java we dont have any concept of garbage values 
		int  [] arr = new int[5]; 
		int count =0;
		for(int temp : arr){
			// down cast 
			// Math.random() -> shall generate any value between 0.0 to 1.0 (0.376764*100) -> 376.764
			int x =  (int)(Math.random()*100);
			arr[count ++] = x; 
		
		}
		
		for(int temp : arr){
			System.out.println(temp);
		}
		
	}
}
