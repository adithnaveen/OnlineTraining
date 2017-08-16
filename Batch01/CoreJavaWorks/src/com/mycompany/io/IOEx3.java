package com.mycompany.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// program is to get the content from the file
public class IOEx3 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\OnlineTraining\\Emp.txt");
				
				
		BufferedReader br  = new BufferedReader(new FileReader(file));
		
		String temp; 
		while((temp = br.readLine()) != null){
			System.out.println(temp);
		}
	}
}
