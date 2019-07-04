package com.MouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HelloSignIn_MouseHoverOpeation {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://amazon.in";
		
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		
		// Browser Maximize
		driver.manage().window().maximize();
		
		// id="nav-link-yourAccount" - Property of HelloSignIn Element
		
		WebElement helloSingIn=driver.findElement(By.id("nav-link-yourAccount"));
		
		// Actions class is used to automate Mouse and KeyBoard related Operation
		
		Actions act = new Actions(driver);
		
		act.moveToElement(helloSingIn).perform();
		
		// Automating Your Orders Element under Hello SignIn - link
		
		driver.findElement(By.linkText("Your Orders")).click();
	}

}
