package com.sdettraining.day02;

public class ArrayEx01 {
	public static void main(String[] args) {
		
		int [] empId = new int[5];
		
		empId[0] = 100;
		empId[1] = 200;
		empId[2] = 300;
		empId[3] = 400;
		empId[4] = 500;
		
		
		for(int index=0; index<empId.length; index++){
			System.out.println(empId[index]);
		}

	}
}
