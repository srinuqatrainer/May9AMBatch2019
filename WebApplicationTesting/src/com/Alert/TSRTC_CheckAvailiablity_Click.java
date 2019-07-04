package com.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TSRTC_CheckAvailiablity_Click {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = null;
		String url="https://tsrtconline.in/oprs-web/";
		
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		
		// Browser Maximize
		driver.manage().window().maximize();
		
		// id="searchBtn" - property of check Availability Button
		
		driver.findElement(By.id("searchBtn")).click();
		
		// Alert is an interface in Selenium WebDriver used to handle alerts
		Alert alt =driver.switchTo().alert(); 
		
		String alert_Message=alt.getText();
		System.out.println(" The alert message is : "+alert_Message);
		
		Thread.sleep(5000);
		
		alt.accept(); // performs click/accept on Ok button
		
		//alt.dismiss(); // performs operation on cancel button
		
	//	alt.sendKeys("Hello"); // sending text into an alert window
		
		}
}
