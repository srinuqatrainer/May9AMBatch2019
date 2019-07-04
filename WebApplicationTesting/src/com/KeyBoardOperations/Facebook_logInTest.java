package com.KeyBoardOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_logInTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = null;
		String url="http://facebook.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		// Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys("Srini");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.TAB).perform();

		act.sendKeys("Testing").perform();
		
		act.sendKeys(Keys.ENTER).perform();
	}

}
