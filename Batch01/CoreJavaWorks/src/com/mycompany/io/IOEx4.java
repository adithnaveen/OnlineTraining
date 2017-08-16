package com.mycompany.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IOEx4 {

	public static  void writeOjbect() throws IOException{
		
		File file = new File("Emp.ser");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Emp emp = new Emp();
		emp.setEmpId(101);
		emp.setEmpName("Harry");
		emp.setEmpSal(30000);

		oos.writeObject(emp);

		//saving (persist to file ) 
		oos.close();
		
		System.out.println("Data Saved Successfully...");
	}

	public static void readObject() 
			throws IOException, ClassNotFoundException{
		File file = new File("Emp.ser");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Emp emp = (Emp) ois.readObject();
	
		
		System.out.println("Data got from file");
		System.out.println("Emp Id: " +emp.getEmpId());
		System.out.println("Emp Name : " + emp.getEmpName());
		System.out.println("Emp Sal : " + emp.getEmpSal());
	}
	
	
	
	public static void main(String[] args) 
			throws IOException, 
			ClassNotFoundException{
	// 	writeOjbect();
		readObject();
	}
}
