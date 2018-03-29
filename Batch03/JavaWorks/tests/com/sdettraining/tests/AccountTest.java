package com.sdettraining.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sdettraining.dao.AccountDAO;
import com.sdettraining.entity.Account;
import com.sdettraining.interfaces.IAccountDAO;

public class AccountTest {
	Account account = null;
	static IAccountDAO dao = null;
	
	@BeforeClass
	public static void beforeSetUp(){
		dao = new AccountDAO();
	}
	
	@AfterClass
	public static void afterTearDown(){
		System.out.println("AFter class is invoked");
	}
	
	@Test
	public void test() {
		int expecteNum = 10; 
		int actualNum =8; // assume that we connect to some method and get this value 
		
		assertEquals(expecteNum, actualNum);
	}
	
	/* this method will surely execute before @Test method */
	@Before
	public void setUp(){
		System.out.println("In Before");
		account = new Account(); 
		account.setAccNo(113);
		account.setCustomerName("Kanchan");
		account.setAccBal(4000);
		account.setCustomerEmail("Kanchan@someemail.com");
		
	}
	
	@After
	public void tearDown(){
		System.out.println("After Called... ");
	}
	
	
	@Test(timeout=500)
	public void test1(){
		boolean actual = dao.insertAccount(account);
		assertEquals(true, actual);
		
	}

}
