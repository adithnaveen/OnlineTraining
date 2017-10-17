package com.naveen.poi.test;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mycompany.utility.Driver;
import com.naveen.poi.ApachePOIExcelRead;

@RunWith(Parameterized.class)
public class PoiTest {
	private List<Object> objects; 
	private static String fileName= "C:/Training Material/TempFiles/MyFirstExcel.xlsx";
	
	// selenium variables 
	WebDriver driver;
	String baseURL;
	
	
	// selenium code 
 	@Before
	public void setUp() {
		// driver location
		System.setProperty(Driver.CHROME_KEY, Driver.CHROME_PATH);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		baseURL = "http://naveenks.com/selenium/LoginForm.html";
	}

	 @After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	@Parameterized.Parameters
	public static List<List<Object>> excelValues(){
		 return new ApachePOIExcelRead().getExcelContent(fileName);
	 }
	
	public PoiTest(List<Object> objects){
		this.objects = objects;
	}
	
	@Test
	public void test() throws InterruptedException{
	// System.out.println(objects);
	System.out.println("------------------------");

	driver.get(baseURL);
	
	driver.findElement(By.id("uname")).sendKeys(objects.get(0).toString());
	driver.findElement(By.id("pwd")).sendKeys(objects.get(1).toString());
	Thread.sleep(1600);
	driver.findElement(By.id("submitBtn")).click();
	}

}