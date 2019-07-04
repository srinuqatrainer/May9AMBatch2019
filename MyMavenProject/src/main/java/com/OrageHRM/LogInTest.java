package com.OrageHRM;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LogInTest {
	
	Logger logger = Logger.getLogger(LogInTest.class);
	
	WebDriver driver = null;
	String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
	
	@BeforeTest
	public void setUp()
	

	{
		PropertyConfigurator.configure("Log4j.properties");
		
		driver = new FirefoxDriver();
		logger.info("Firefox Browser launched Successfully");
		
		driver.get(url);
		logger.info(" Successfully launched OrangeHRM Application");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void logIn()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		logger.info(" Successfully Entered UserName");
		
		driver.findElement(By.id("txtPassword")).sendKeys("password");
		logger.info(" Successfully Entered Password");
		
		driver.findElement(By.id("btnLogin")).click();
		logger.info(" Successfully performed click operation on LogIn button");
		
		String expected_Text ="Welcome Admin";
		//System.out.println(" The expected logIn text is : "+expected_Text);
		logger.info(" The expected logIn text is : "+expected_Text);
		
		String actual_Text=driver.findElement(By.id("welcome")).getText();
		//System.out.println(" The actual LogIn text is : "+actual_Text);
		logger.info(" The actual LogIn text is : "+actual_Text);
		
		if(actual_Text.equals(expected_Text))
		{
			//System.out.println("LogIn Successfull - PASS");
			logger.info("LogIn Successfull - PASS");
		}
		else
		{
			//System.out.println("LogIn Failed - FAIL");
			logger.info("LogIn Failed - FAIL");
		}
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
		logger.info("Successfully closed OrageHRM Application");
	}
	

}
