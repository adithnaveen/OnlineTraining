package com.mycompany.day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOEx1 {
	public static void main(String[] args) 
			throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter Employee Id: ");
		// 101a
		// an Exception -> NumberFormatException 
		int empId = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Employee Name: " );
		String empName = br.readLine();
		
		System.out.println("Enter Employee Salary: ");
		double empSal = Double.parseDouble(br.readLine());
		
		System.out.println("Emp id : " + empId);
		System.out.println("Emp Name :" + empName);
		System.out.println("Emp Sal : " + empSal );
		
		File file = new File("Sample.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
		
		bw.write("Emp Id :" + empId);
		bw.newLine();
		bw.write("Emp Name :" + empName);
		bw.newLine();
		bw.write("Emp Sal : " + empSal);
		bw.newLine();
		
		bw.close();
		
		System.out.println("Data is written successfully");
	}
}














