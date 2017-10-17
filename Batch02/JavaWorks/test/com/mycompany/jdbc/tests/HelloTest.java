package com.mycompany.jdbc.tests;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class HelloTest {

	
	@Ignore
	@Test
	public void test() {
		System.out.println("Hey i'm test Case");
		// expected, actual 
		boolean flag = false;
		assertEquals(true, flag);
	}

	@Test
	public void test1(){
		String name ="harry";
		
		assertEquals(5, name.length());
		
	}
}
