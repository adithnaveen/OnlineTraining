package com.mycomp.basictest;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.mycomp.utils.DriverFactory;
import com.mycomp.utils.DriverNames;

public class DemoCartTest01 {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		baseUrl = "https://demostore.x-cart.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void testIng1() throws Exception {
		// 1. TODO -> Load the page
		driver.get(baseUrl);

		// 2. TODO -> Find the shipping element  
		driver.findElement(By.linkText("Shipping")).click();
		Thread.sleep(2000);

		// 3. TODO -> find Contact us 
		driver.findElement(By.partialLinkText("Contact")).click();
		Thread.sleep(2000);

		// 4. TODO -> enter value for your name 
		driver.findElement(By.id("name")).sendKeys("Testing Name");
		Thread.sleep(2000);

		driver.findElement(By.id("email")).sendKeys("testing@testing.com");
		// sent values for other elements 
		// i'll do click 
		
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
