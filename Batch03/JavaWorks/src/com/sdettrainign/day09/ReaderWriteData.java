package com.sdettrainign.day09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderWriteData {
	public static void main(String[] args)  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = null;

		try {
			System.out.println("Enter Your Emp Id ");
			// 101 -> "101" 
			int empId = Integer.parseInt(br.readLine());
			
			System.out.println("Enter your name ");
			String empName = br.readLine(); 
			
			System.out.println("Enter your Email ");
			String email = br.readLine(); 
			
			System.out.println("Emp Id " + empId);
			System.out.println("Emp Name " + empName);
			System.out.println("Emp Email " + email);

			bw = new BufferedWriter(new FileWriter("sample.txt", true));
			bw.newLine();
			bw.write("Empid " + empId);
			bw.newLine(); 
			bw.write("Emp Name " + empName);
			bw.newLine();
			bw.write("Emp Email " + email);
			bw.newLine();

			System.out.println("Data Saved... ");
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
