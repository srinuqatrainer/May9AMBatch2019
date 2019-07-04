package com.OHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OHRM_LogIn_DisplayingLinkNames {

	public static void main(String[] args) {
		
			WebDriver driver = null;
			String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
			
			String userName="admin";
			String Password="password";
			
			driver = new FirefoxDriver();
			driver.get(url);
			
			driver.findElement(By.id("txtUsername")).sendKeys(userName);
			
			WebElement password=driver.findElement(By.id("txtPassword"));
			password.sendKeys(Password);
			
			WebElement logIn=driver.findElement(By.id("btnLogin"));
			logIn.click();
						
			List<WebElement>links=driver.findElements(By.tagName("a"));
			
			System.out.println("The total number of links are : "+links.size());
			
			
			for(int k=0;k<links.size();k++)
			{
				if(links.get(k).isDisplayed())
				{
					String linkName=links.get(k).getText();
					System.out.println(linkName);
				}
			}
			
		driver.quit();
			
			
	}

}
