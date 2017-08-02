package com.mycomp.generics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mycomp.utils.ElementType;

// this class shall be treated as generic class and shall be shared to all selenium scripts 
public class GenericMethods {
	
	private WebDriver driver;
	
	// this shall be invoked from setup 
	public GenericMethods(WebDriver driver){
		this.driver = driver;
	}
	
	
	/**
	 *  type -> either id, xpath, css, linktext, partiallinktext, name 
	 *  locator -> shall be the locator which user gives it from the page 
	 */
	
	public WebElement getElement(String locator, String type){
		WebElement element = null; 
		if(type.equals(ElementType.ID)){
			element = driver.findElement(By.id(locator));
		}else if(type.equals(ElementType.XPATH)){
			element = driver.findElement(By.xpath(locator));
		}else if(type.equals(ElementType.NAME)){
			element = driver.findElement(By.name(locator));
		}
		// other TODO 
		return element;
	}
	
	
}

















