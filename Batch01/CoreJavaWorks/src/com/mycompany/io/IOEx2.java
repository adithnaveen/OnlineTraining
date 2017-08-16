package com.mycompany.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOEx2 {
	public static void main(String[] args) throws IOException {
		// we have to the value from end user at the runtime 
		// console 
		// System.in -> keyboard 
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter Your Name : ");
		String name = br.readLine();
		
		System.out.println("Enter Your Age : " );
		int age = Integer.parseInt(br.readLine());
		
		
		System.out.println("Your Name :" + name);
		System.out.println("Your Age : " + age);
		
		
		FileWriter fw = new FileWriter("C:\\OnlineTraining\\Emp.txt", true);
		fw.write("Name : " + name +"\n");
		fw.write("Age is " + age +"\n");
		
		
		// the data writting shall happen here 
		fw.close();
		System.out.println("Data Saved... ");
		
	}
}
