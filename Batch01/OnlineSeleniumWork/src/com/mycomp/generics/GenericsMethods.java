package com.mycomp.generics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericsMethods {
	WebDriver driver; 
	
	// this driver will be given by selenium script at the time of initialization 
	public GenericsMethods(WebDriver driver){
		this.driver = driver;
	}
	
	
	// are called facade methods 
	public WebElement getElement(String locator, String type){
		WebElement element = null;
		
		type = type.toLowerCase();
		
		if(type.equals("id")){
			element = driver.findElement(By.id(locator));
		}else if(type.equals("css")){
			element = driver.findElement(By.cssSelector(locator));
		}else if(type.equals("class")){
			element = driver.findElement(By.className(locator));
		}else if(type.equals("xpath")){
			element = driver.findElement(By.xpath(locator));
		}else if(type.equals("name")){
			element = driver.findElement(By.name(locator));
		}else {
			element = null;
		}
		
		if(checkSingleEntry(locator, type)){
			System.out.println("Element found and it is single entry ");
			return element;
		}else {
			System.out.println("Element not found ");
			return null;
		}
	}
	
	
	// incase if you have an element which has multiple entries in the DOM 
	
	public List<WebElement> getElementAsList(String locator, String type){
		type= type.toLowerCase();
		List<WebElement> element = null ; 
		
		if(type.equals("id")){
			element = driver.findElements(By.id(locator));
		}else if(type.equals("name")){
			element = driver.findElements(By.name(locator));
		}else if(type.equals("xpath")){
			element = driver.findElements(By.xpath(locator));
		}else if(type.equals("class")){
			element = driver.findElements(By.className(locator));
				
		}
		
		return element;
	}
	
	
	// this method will check for single entry for the element in the DOM 
	
	public boolean checkSingleEntry(String locator, String type){
		 return getElementAsList(locator, type).size()==1;
		
//		if(getElementAsList(locator, type).size()==1){
//			return true; 
//		}else {
//			return false;
//		}
		
	}
	
	
	
}
