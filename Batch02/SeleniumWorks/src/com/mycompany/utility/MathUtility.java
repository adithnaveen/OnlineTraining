package com.mycompany.utility;

public class MathUtility {
	public int getRandomNumber(int upperLimit){
		return (int )(Math.random()*upperLimit);
	}
	
	public static void main(String[] args) {
		System.out.println(new MathUtility().getRandomNumber(6));
	}
}
