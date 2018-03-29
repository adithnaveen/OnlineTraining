package com.sdettraining.day05;

import java.util.Date;

public class StringManip {
	public static void main(String[] args) {
		String str= new String("Hello"); 

		System.out.println(str.substring(2));
		StringBuffer sb = new StringBuffer("testing"); 
		StringBuilder sd = new StringBuilder("builder"); 

		Date date = new Date(); 

		System.out.println(Math.round(34.45));
	}
}
