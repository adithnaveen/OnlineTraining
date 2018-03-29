package com.sdettrainign.day09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeStoreGet {
	
	public static void storeObject(Employee employee){
		ObjectOutputStream oos = null; 
		try {
			oos = new ObjectOutputStream(new FileOutputStream("objects.ser"));
		
			oos.writeObject(employee);
			oos.writeInt(101);
			oos.writeObject("Hello");
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	public static void getObject(){
		try {
			ObjectInputStream ois = new ObjectInputStream(
					new FileInputStream("objects.ser"));
			
			Employee emp = (Employee) ois.readObject(); 
			System.out.println("data read from File ");
			System.out.println(emp.getEmpId() +", " +
					emp.getEmpName());

			int val = ois.readInt(); 
			String str = (String) ois.readObject(); 
			
			System.out.println("Int val " + val);
			System.out.println("String is " + str);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException cnf){
			cnf.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		Employee employee = new Employee(101, "Jack"); 
		// storeObject(employee);
		// System.out.println("Object Stored... ");

		getObject();
	}
}
