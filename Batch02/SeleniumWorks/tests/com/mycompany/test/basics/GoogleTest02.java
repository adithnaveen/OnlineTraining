package com.mycompany.test.basics;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mycompany.utility.Driver;

// program to send keys to google.com and search 
public class GoogleTest02 {

	WebDriver driver;
	@Before
	public void setUp(){
		// driver location
		System.setProperty(Driver.CHROME_KEY, Driver.CHROME_PATH);

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String baseURL = "http://google.com";
		driver.get(baseURL);
	}
	
	@After
	public void tearDown() throws InterruptedException{
		Thread.sleep(2000);
		driver.quit();
	}

	
	@Test
	public void googleTest(){
		// in google.com, there is 1 element and 3 logical names 
//		lst-ib
//		gs_taif0
//		gs_htif0

		WebElement searchElement = driver.findElement(By.id("gs_taif0"));
		
		if(searchElement.isEnabled()){
			System.out.println("The field is enabled ");
			searchElement.sendKeys("places near me");
		}else{
			System.out.println("The filed is disabled");
		}
		// your todo 
//		gs_htif0
	}
	
	
	
	
	
	
	
}
