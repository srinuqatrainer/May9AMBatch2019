package com.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster_CurrentLocation_Industry_Selection {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="https://my.monsterindia.com/sponsered_popup.html";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		WebElement currentLocation=driver.findElement(By.className("border_grey1"));
		
		List<WebElement>currentLocationElements=currentLocation.findElements(By.tagName("option"));
		
System.out.println(" The number of elements in the currenLocation dropDown are :"+
																currentLocationElements.size());
		
		for(int a=0;a<currentLocationElements.size();a++)
		{
			String currentLocationElement_Name=currentLocationElements.get(a).getText();
			System.out.println(currentLocationElement_Name);
		}
		
		Select selection = new Select(currentLocation);
		selection.selectByIndex(5);
				
		WebElement industry=driver.findElement(By.id("id_industry"));
		
		Select selection1 = new Select(industry);
		selection1.selectByIndex(1);
		selection1.selectByVisibleText("Automotive/ Ancillaries");
		selection1.selectByValue("5");
		
		selection1.deselectByValue("4");
		selection1.deselectByVisibleText("Banking");
		selection1.deselectByIndex(1);
		
		selection1.deselectAll();
			
		//driver.quit();
	}

}
