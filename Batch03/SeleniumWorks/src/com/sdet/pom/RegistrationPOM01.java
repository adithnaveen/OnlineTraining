package com.sdet.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPOM01 {
	private WebElement element; 
	private WebDriver driver; 
	
	
	public RegistrationPOM01(WebDriver driver){
		this.driver = driver; 
	}
	
	// the locator inputEmail, may even be pulled from propery file 
	public void sendEmail(String email){
		element = driver.findElement(By.id("inputEmail")); 
		element.clear();
		element.sendKeys(email);
	}
	
	
	public void sendPassword(String password){
		element = driver.findElement(By.id("inputPassword")); 
		element.clear(); 
		element.sendKeys(password);
	}
	
	public void sendCnfPassword(String cnfPassword){
		element = driver.findElement(By.id("confirmPassword"));
		element.clear(); 
		element.sendKeys(cnfPassword);
	}
	
	public void sendFirstName(String firstName){
		element = driver.findElement(By.id("firstName")); 
		element.clear(); 
		element.sendKeys(firstName);
	}
	
	public void sendLastName(String lastName){
		element = driver.findElement(By.id("lastName"));
		element.clear(); 
		element.sendKeys(lastName);
	}
	
	public void clickRegisterButton(){
		element = driver.findElement(By.xpath("/html/body/div[1]/form/div[15]/div/input[1]")); 
		element.click(); 
	}
}
