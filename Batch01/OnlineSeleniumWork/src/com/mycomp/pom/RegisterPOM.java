package com.mycomp.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPOM {
	private WebElement element;
	private WebDriver driver;

	public RegisterPOM(WebDriver driver) {
		this.driver = driver;
	}

	// we return the object
	public void sendEmail(String email) {
		element = driver.findElement(By.id("inputEmail"));
		element.clear();
		element.sendKeys(email);
	}

	public void sendPassword(String password) {
		element = driver.findElement(By.id("inputPassword"));
		element.clear();
		element.sendKeys(password);
	}

	public void sendConfirmPassword(String confirmPassword) {
		element = driver.findElement(By.id("confirmPassword"));
		element.clear();
		element.sendKeys(confirmPassword);
	}

	public void clickRegBtn() {
		element = driver.findElement(By.xpath("html/body/div[1]/form/div[15]/div/input[1]"));
		element.click();
	}

}
