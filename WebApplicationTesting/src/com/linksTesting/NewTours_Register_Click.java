package com.linksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_Click {

	public static void main(String[] args) 
	{
		WebDriver driver = null;
		
		String url="http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		/*

		 <a href="mercuryregister.php?">REGISTER</a>

 		a - anchor tag

 		href - attribute

 		Element is of Type - link

 		locator - linkText

 		Selector - REGISTER
 
		 */
		
		//driver.findElement(By.linkText("REGISTER")).click();
		
		//driver.findElement(By.partialLinkText("REGIS")).click();
		
		WebElement register=driver.findElement(By.partialLinkText("REGIS"));
		register.click();
		
		String register_ElementText=driver.findElement(By.linkText("REGISTER")).getText();
		System.out.println(" The text of the register element is : "+register_ElementText);
		
		System.out.println(" The title of the Register WebPage is : "+driver.getTitle());
				
		//driver.quit();
	}

}
