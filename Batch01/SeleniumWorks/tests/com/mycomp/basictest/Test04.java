package com.mycomp.basictest;
// This program is to show working of radio button 

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mycomp.utils.Driver;
import com.mycomp.utils.DriverFactory;
import com.mycomp.utils.DriverNames;


/*
 * Write a selenium script to select a radio with name which return all the radio buttons 
 * under that, and click on each of that with delay of 2 seconds 
 */
public class Test04 {
	WebDriver driver;
	String baseURL;


	@Before
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		baseURL = "http://naveenks.com/selenium/RegForm.html";
		driver.get(baseURL);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	// select radio button
	@Test
	public void test() throws Exception {
		WebElement male = driver.findElement(By.id("genderMale"));
		male.click();
		Thread.sleep(2000);

		WebElement female = driver.findElement(By.id("genderFemale"));
		female.click();
		Thread.sleep(2000);

		WebElement trans = driver.findElement(By.id("genderTrans"));
		trans.click();

		System.out.println("Selected Male -> " + male.isSelected());
		System.out.println("Selected Female -> " + female.isSelected());
		System.out.println("Selected Trans Gender -> " + trans.isSelected());

	}

}