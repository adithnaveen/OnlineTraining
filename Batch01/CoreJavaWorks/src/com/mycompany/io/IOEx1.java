package com.mycompany.io;

import java.io.File;
import java.io.IOException;

// program to show working of File 
public class IOEx1 {
	public static void main(String[] args) {
		// this only a pointer or reference 
		File f = new File("sample.txt");
		
		try {
			boolean flag = f.createNewFile();
			
			System.out.println("File created is " + flag );
			
			System.out.println("Have read permission " + f.canRead());
			System.out.println("Have Write Permission " + f.canWrite() );
			System.out.println("Absolute Path " + f.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
