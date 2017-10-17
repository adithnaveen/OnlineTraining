package com.mycompany.day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IOEx3 {

	public static void writeObject(Employee  employee) 
			throws FileNotFoundException, IOException{
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("Employee.ser"));
		
		oos.writeObject(employee);
		oos.close();
		System.out.println("Data Written Successfully ");
	}
	
	public static void readObject() throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Employee.ser"));
		
		Employee temp = (Employee) ois.readObject(); 
		
		System.out.println(temp);
		
		ois.close();
	}
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		
		employee.setEmpId(101);
		employee.setEmpName("Harry");
		employee.setEmpSal(10000);
		
		
		/*try {
			writeObject(employee);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		try {
			readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}











