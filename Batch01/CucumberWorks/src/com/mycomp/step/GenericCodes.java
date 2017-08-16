package com.mycomp.step;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class GenericCodes {

	@Before
	public void launch_the_application(){
		System.out.println("^^^^^^^^^^^^ Launching Application ^^^^^^^^^^^^^^^^^");
	}
	
	@After
	public void purge_the_application(){
		System.out.println("^^^^^^^^^^^^ Purge The Applicatio ^^^^^^^^^^^^^");
	}
}
