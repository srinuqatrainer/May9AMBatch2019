package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TSRTC_HeaderBlock_ElementsCount_DisplayNames {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="https://tsrtconline.in/oprs-web/";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		// class="menu-wrap" - property of HeaderBlock
		
	WebElement headerBlock=driver.findElement(By.className("menu-wrap"));
	
	List<WebElement>headerBlock_Links=headerBlock.findElements(By.tagName("a"));
	
System.out.println(" THe total number of links on the HeaderBlock are : "+headerBlock_Links.size());
	
	
	for(int n=0;n<headerBlock_Links.size();n=n+1)
	{
		String headerBlock_linkName=headerBlock_Links.get(n).getText();
		System.out.println(headerBlock_linkName);
		
		headerBlock_Links.get(n).click();
	}
	
	driver.quit();
		

	}

}
