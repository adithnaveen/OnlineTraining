package com.mycomp.basic.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class BasicTest01 {

	// this means this method will execute n number of time 
	// for each method annotated with @Test 
	
	// The Before & After will work for each invocation of Test 
	// will work only once for the entire suite 
	@BeforeClass
	public static void setUpBeforeClass(){
		System.out.println("Hey i'm from before class and only once... ");
	}
	
	@AfterClass
	public static void tearDownAfterClass(){
		System.out.println("Hey i'm from After class and only once... ");
	}
	
	Date date;
	@Before
	public void setUp(){
		System.out.println("This is in Before....");
		date = new Date();
	}

	@After
	public void tearDown(){
		System.out.println("This is in After... ");
	}
	
	
	@Test
	public void test() {
		// TODO 
		
		System.out.println("You are in test " + date);
	}
	
	@Test
	public void test1() {
		// TODO 
	 
		System.out.println("You are in test1 " + date);
	}
	
	@Test
	public void test2() {
		// TODO 
		
		System.out.println("You are in test2 " + date);
	}

	
}
