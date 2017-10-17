package com.mycompany.client;

import java.util.List;

import com.mycompany.beans.EmployeeBean;
import com.mycompany.dao.EmployeeDAO;

public class EmployeeClient {
	public static void main(String[] args) {
		EmployeeBean bean = new EmployeeBean();
		bean.setEmpId(103);
		bean.setEmpName("Srinivas");
		bean.setEmpSal(23455);
		bean.setEmail("srinivas@gmail.com");
		
		EmployeeDAO dao =new EmployeeDAO();
//		boolean flag = dao.insertEmployee(bean);
// 		System.out.println("Flag is " + flag);
		
//		boolean flag = dao.deleteEmployee(101);
//		System.out.println("Flag value is " + flag);
//		boolean flag = dao.updateEmployee(102, 20000);
//		System.out.println("Update Flag is " + flag);
	
		
//		EmployeeBean emp = dao.getEmployee(102);
//		
//		System.out.println("Emplyee got is \n " + emp);
		
		for(EmployeeBean temp: dao.getAllEmps()){
			System.out.println(temp);
		}
		
		
		
	}
}
