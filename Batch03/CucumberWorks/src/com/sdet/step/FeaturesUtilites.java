package com.sdet.step;

import cucumber.api.java.After;
import cucumber.api.java.Before;

// This is a hook class 
public class FeaturesUtilites {
	
	@Before
	public void set_path_for_chomre(){

		System.out.println("************************************");
		System.out.println("Setting path in hooks ");
		System.out.println("************************************");
		
	}
	@After
	public void close_the_browser(){

		System.out.println("************************************");
		System.out.println("Closing the browser in hooks ");
		System.out.println("************************************");
		
	}
}
