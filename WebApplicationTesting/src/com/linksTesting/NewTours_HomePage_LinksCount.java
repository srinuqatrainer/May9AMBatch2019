package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_HomePage_LinksCount {

	public static void main(String[] args) 
	{
	
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		// <a href="mercurysignon.php">SIGN-ON</a>
		// <a href="mercuryregister.php">REGISTER</a>
		// <a href="mercuryunderconst.php">SUPPORT</a>
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		int linksCount=links.size();
		
		System.out.println(" The total number of links on the NewTours HomePage are : "+linksCount);
		
		driver.quit();
		
		

	}

}
