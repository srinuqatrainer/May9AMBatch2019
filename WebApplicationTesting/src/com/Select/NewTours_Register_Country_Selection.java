package com.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTours_Register_Country_Selection {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		// <a href="mercuryregister.php">REGISTER</a>
		driver.findElement(By.linkText("REGISTER")).click();
		
		// name="country" - property of Country Element
		
		WebElement country=driver.findElement(By.name("country"));
		
		Select selection = new Select(country);
		
		//selection.selectByIndex(3); // Index always starts from 0
		//selection.selectByVisibleText("INDIA"); // Give the text of the option value to be selected
		
// provide the optional value number given by the developer - after inspection of an element
		selection.selectByValue("251"); 
		


	}

}
