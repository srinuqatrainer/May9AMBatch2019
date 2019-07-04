package com.GetAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_getURL {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url ="http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		
		String expectedUrl_registerElement=register.getAttribute("href");
		System.out.println(" The expected Url is :"+expectedUrl_registerElement);
		
		register.click();
		
		String actual_RegisterURl=driver.getCurrentUrl();
		System.out.println(" the actual  url is :"+actual_RegisterURl);
		
		
		if(actual_RegisterURl.equals(expectedUrl_registerElement))
			
		{
			System.out.println(" Successfully reached Register WebPage - PASS");
		}
		else
		{
			System.out.println(" Failed to naviagte to register Webpage - FAIL");
		}
		
		driver.quit();
		

	}

}
