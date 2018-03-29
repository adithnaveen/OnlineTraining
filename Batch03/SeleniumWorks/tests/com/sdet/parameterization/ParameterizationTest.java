package com.sdet.parameterization;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class ParameterizationTest {

	private String userName; 
	private String password;

	@Parameters
	public static List<Object[]> data(){
		return Arrays.asList(new Object[][]{
			{"hello", "hello123"},
			{"hi", "hi123"},
			{"test", "test123"},
			{"laptop", "laptop123"}
		});
	}
	
	public ParameterizationTest(String userName, String password){
		this.userName = userName; 
		this.password = password; 
	}
	
	
	@Test
	public void loginTest(){
		System.out.println("User Name " + this.userName +", Password " 
				+ this.password);
	}
	
	
	
}
