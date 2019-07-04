package com.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_LogInTest {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://facebook.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//<input type="email"  data-testid="royal_email">
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("Hello");
		
		// <input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">
		
driver.findElement(By.xpath("//*[@class='inputtext' and @data-testid='royal_pass']")).sendKeys("Hiiiii");

	}

}
