package com.naveen.selenium.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerTest {

	WebDriver driver ; 
	String baseURL;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\software\\SeleniumDriver\\chromedriver.exe");
	}

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
		baseURL = "http://naveenks.com/selenium/RegForm.html";
		driver.get(baseURL);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		// driver.quit();
	}
	
	@Test
	public void test() throws Exception{
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(1500);
		driver.findElement(By.id("travelfrom")).click();
		Thread.sleep(1500);
//		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[4]/td[4]/a")).click();
		
		String dateXpath =".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td/a";
		
		List<WebElement> allDates = driver.findElements(By.xpath(dateXpath));
		
		for(WebElement temp : allDates){
			System.out.println(temp.getText());
		}
		
	}
}





















