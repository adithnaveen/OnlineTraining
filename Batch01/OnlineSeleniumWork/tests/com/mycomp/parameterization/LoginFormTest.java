package com.mycomp.parameterization;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.mycomp.generics.GenericsMethods;
import com.mycomp.utils.DriverFactory;
import com.mycomp.utils.DriverNames;

// this unit test case is to show working of parameterization in junit 



@RunWith(Parameterized.class)
public class LoginFormTest {

	WebDriver driver;
	String baseURL;
	GenericsMethods genMethods; 

	// a constructor will takes the values from the parameters and gives it to @Test 
	
	String userName; 
	String password; 
	
	public LoginFormTest(String userName, String password){
		this.userName = userName;
		this.password = password;
	}
	
	
	/// everytime the list is invokes for each entry there will be a call to 
	// parametric constructor which in turn call @Test 
	@Parameters
	public static List<Object[]> data(){
		// this can even be takes from excel sheet 
		return Arrays.asList(new String [][] {
			{"radha", "secret@123"},
			{"harry", "@123Secret"},
			{"natraj", "123secret"},
			{"luis", "secret2211"}
		});
	}
	
	
	@Before
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		genMethods = new GenericsMethods(driver);
		baseURL = "http://naveenks.com/selenium/LoginForm.html";
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void loginFormTest() throws Exception{
		driver.get(baseURL);
		genMethods.getElement("uname", "id").sendKeys(this.userName);
		genMethods.getElement("pwd", "id").sendKeys(this.password);
		genMethods.getElement("submitBtn", "id").click();
	}
		
	
	
	
}
