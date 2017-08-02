package com.mycomp.basictest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mycomp.utils.DriverFactory;
import com.mycomp.utils.DriverNames;

/**
 * This program is to show working of parameters passing values 
 * this can be even got 
 * @author Naveen
 *
 */

@RunWith(Parameterized.class)
public class LoginTest {
	String baseUrl;
	WebDriver driver ; 

	@Parameters
	public static List<Object[]> data(){
		return Arrays.asList(new String[][]{
			{"Ben@hello.com", "ben123"},
			{"Surya@hello.com", "surya123"},
			{"Sreeni@hello.com", "sreeni123"}
		});
	}
	
	private String uName; 
	private String pwd;
	
	public LoginTest(String uName, String pwd){
		this.uName = uName;
		this.pwd = pwd;
	}
	
	@Before
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		baseUrl="http://naveenks.com/selenium/LoginForm.html";
		driver.get(baseUrl);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void test() throws Exception {
		driver.findElement(By.id("uname")).sendKeys(this.uName);
		Thread.sleep(1500);
		
		driver.findElement(By.id("pwd")).sendKeys(this.pwd);
		Thread.sleep(1500);

		driver.findElement(By.id("submitBtn")).click();
		
	}

}
