package com.mycompany.parameterization;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mycompany.generics.GenericMethods;
import com.mycompany.utility.Driver;

// this program is to show working of parameterization
/// in junit and invoke the test case multiple times 


@RunWith(Parameterized.class)
public class LoginFormTest {

	WebDriver driver;
	GenericMethods genericMethod;
	String baseURL;

	@Before
	public void setUp() {
		// driver location
		System.setProperty(Driver.CHROME_KEY, Driver.CHROME_PATH);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		genericMethod = new GenericMethods(driver);
		baseURL = "http://naveenks.com/selenium/LoginForm.html";

	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	String userName; 
	String password; 
	
	
	// injecting the values for this will be done by junit which 
	// comes from paraterization 
	public LoginFormTest(String userName, String password){
		this.userName = userName; 
		this.password = password; 
	}

	// the values for the constructor will be given by parameters 
	// number of entries coming out of this will be number of times the constructor is 
	// called... 
	
	//POI(apache), csv reader (java.io)
	// List<List<Object>> or List<Object[]>
	@Parameters
	public static List<Object[]> data(){
		return Arrays.asList(new String[][] {
			{"Hareesh", "hareesh"}, 
			{"Mini", "mini"},
			{"Narendar", "narendar"}, 
			{"Nitya", "nitya"}, 
			{"Padma", "padma"}
		});
	} 
	
	@Test
	public void loginTest(){
		// mix of parametric job + selenium 
		driver.get(baseURL);

	 	driver.findElement(By.id("uname")).clear();
	    driver.findElement(By.id("uname")).sendKeys("Harry");
	    driver.findElement(By.id("pwd")).clear();
	    driver.findElement(By.id("pwd")).sendKeys("peter");
	    driver.findElement(By.id("submitBtn")).click();
	    
	    

	}

}
