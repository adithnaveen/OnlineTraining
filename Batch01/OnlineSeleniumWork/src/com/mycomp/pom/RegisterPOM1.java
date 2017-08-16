package com.mycomp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPOM1 {

	private WebDriver driver; 
	
	// initElement we register the annotated element to selenium 
	public RegisterPOM1(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="inputEmail")
	private WebElement inputEmail;

	@FindBy(id="inputPassword")
	private WebElement inputPassword; 
	
	@FindBy(id="confirmPassword")
	private WebElement confirmPassword;
	
	@FindBy(xpath="html/body/div[1]/form/div[15]/div/input[1]")
	private WebElement regBtn; 
	
	public void sendEmail(String email){
		inputEmail.clear();
		inputEmail.sendKeys(email);
	}
	
	public void sendPassword(String password){
		inputPassword.clear();
		inputPassword.sendKeys(password);
	}

	public void sendConfirmPassword(String confirmPassword){
		this.confirmPassword.clear();
		this.confirmPassword.sendKeys(confirmPassword);
	}
	
	public void clickRegButton(){
		regBtn.click();
	}

}

