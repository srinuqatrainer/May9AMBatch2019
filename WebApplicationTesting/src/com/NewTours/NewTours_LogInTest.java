package com.NewTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_LogInTest {

	public static void main(String[] args) {
		
		//FirefoxDriver driver = new FirefoxDriver();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://newtours.demoaut.com");
		
		// <input type="text" name="userName" size="10">
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		
		// <input type="password" name="password" size="10">
		
		driver.findElement(By.name("password")).sendKeys("tutoria");
		
		// <input type="image" name="login" value="Login" src="/images/btn_signin.gif?osCsid=a480b7bb28903609ec93a2fcdfc3220a" width="58" height="17" alt="Sign-In" border="0">
		
		driver.findElement(By.name("login")).click();
		
		String expected_Title="Find";
		System.out.println(" The expected title after successfull login is :"+expected_Title);
		
		String actual_Title=driver.getTitle();
		System.out.println(" The actual title after logIn is :"+actual_Title);
		
		if(actual_Title.contains(expected_Title))
		{
			System.out.println(" LogIn Successfull - PASS");
		}
		else
		{
			System.out.println(" LogIn Failed - FAIL");
		}
		
		driver.quit();

	}

}
