package com.sdet.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPOM02 {
	private WebElement element; 
	private WebDriver driver; 
	
	public LoginPOM02(WebDriver driver){
		this.driver = driver; 
		
	}
	
	public void sendUserName(String userName){
		element = driver.findElement(By.id("uname"));
		element.clear(); 
		
		element.sendKeys(userName);
	}

	public void sendPassword(String password){
		element = driver.findElement(By.id("pwd")); 
		element.clear(); 
		element.sendKeys(password);
	}
	
	public void clickSubmitBtn(){
		driver.findElement(By.id("submitBtn")).click();
	}
	
	
}
