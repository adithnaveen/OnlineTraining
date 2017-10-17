package com.mycompany.waits;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mycompany.generics.GenericMethods;
import com.mycompany.utility.Driver;
import com.mycompany.utility.ScreenShot;

public class ExplicitWaitTest {

	WebDriver driver;
	GenericMethods genericMethod;
	String baseURL;
	ScreenShot screenShot;

	@Before
	public void setUp() {
		// driver location
		System.setProperty(Driver.CHROME_KEY, Driver.CHROME_PATH);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		genericMethod = new GenericMethods(driver);
		screenShot = new ScreenShot(driver);
		baseURL = "http://naveenks.com/selenium/LoginForm.html";

	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		// driver.quit();
		screenShot.captureScreenShot("Step2.png");
	}
	
	
	@Test
	public void loginExplicitWaitTest(){
		driver.get(baseURL);
		
//		genericMethod.getElement("uname", "id").click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement userName = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("uname"))
				);
		userName.sendKeys("harry@gmail.com");
				
		
	}
	
	
}
