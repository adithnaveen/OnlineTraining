package com.mycompany.jdbc.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mycompany.beans.EmployeeBean;
import com.mycompany.dao.EmployeeDAO;

public class EmployeeDAOTest {

	EmployeeDAO dao;
	
	// now the method which is annotated with Before will execute 
	// n number times(@Test) 
	@Before
	public void setUp(){
		System.out.println("Hey i'm in Before... ");
		dao = new EmployeeDAO();
	}
	
	
	@After
	public void tearDown(){
		System.out.println("Hey i'm after.. ");
	}
	
	
	@BeforeClass
	public static void setUpBeforeClass(){
		System.out.println("hi i'm from Before Class.... ");
		
	}
	
	@Test
	public void test() {
		System.out.println("i'm in insert test");
		EmployeeBean bean = new EmployeeBean();
		bean.setEmpId(202);
		bean.setEmpName("Mini");
		bean.setEmpSal(55000);
		bean.setEmail("mini@gmail.com");
		
		assertEquals(true, dao.insertEmployee(bean));
		
	}
	
	@Test
	public void updateTest(){
		System.out.println("i'm in update test... ");
		assertEquals(true, dao.updateEmployee(201, 33445));
	}

}
