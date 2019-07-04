package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_Country_DisplayCount {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		// <a href="mercuryregister.php">REGISTER</a>
		driver.findElement(By.linkText("REGISTER")).click();
		
		// name="country" - property of Country Element
		
		WebElement country=driver.findElement(By.name("country"));
		
		List<WebElement>countryNames=country.findElements(By.tagName("option"));
		
		System.out.println("The number of Countries are :"+countryNames.size());
		
		for(int k=0;k<countryNames.size();k++)
		{
			String countryName=countryNames.get(k).getText();
			System.out.println(countryName);
		}
				driver.quit();
	}

}
