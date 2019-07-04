package com.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_LogInTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","./driverFiles/geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://facebook.com");
		
		// 	<input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">

		// id  - locator
		// Selector - email
		
		
		driver.findElement(By.id("email")).sendKeys("srini");
		
		// <input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">
		
		driver.findElement(By.id("pass")).sendKeys("hello");
		
	// <label class="uiButton uiButtonConfirm" id="loginbutton" for="u_0_2">
		
		driver.findElement(By.id("loginbutton")).click();
		
		
		
		driver.close();

	}

}
