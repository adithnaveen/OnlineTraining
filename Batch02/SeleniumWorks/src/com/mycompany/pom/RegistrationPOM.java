package com.mycompany.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPOM {
	private WebDriver driver; 
	
	public RegistrationPOM(WebDriver driver){
		// now we say selenium instantiate this 
		// class with the driver passed 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="inputEmail")
	private WebElement inputEmail; 
	
	@FindBy(id="inputPassword")
	private WebElement inputPassword; 
	
	@FindBy(id="confirmPassword")
	private WebElement confirmPassword;
	
	@FindBy(id="firstName")
	private WebElement firstName; 
	
	@FindBy(xpath="html/body/div[1]/form/div[15]/div/input[1]")
	private WebElement regBtn;
	
	public void sendEmail(String email){
		this.inputEmail.clear();
		this.inputEmail.sendKeys(email);
	}
	
	public void sendPassword(String password){
		this.inputPassword.clear();
		this.inputPassword.sendKeys(password);
	}
	
	public void sendConfirmPassword(String confirmPassword){
		this.confirmPassword.clear();
		this.confirmPassword.sendKeys(confirmPassword);
	}
	
	public void sendFirstNem(String firstName){
		this.firstName.clear();
		this.firstName.sendKeys(firstName);
	}
	
	public void clickRegBtn(){
		this.regBtn.click();
	}
	
	
	
	
	
	
}
