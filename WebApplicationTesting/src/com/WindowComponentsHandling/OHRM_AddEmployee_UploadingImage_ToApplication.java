package com.WindowComponentsHandling;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OHRM_AddEmployee_UploadingImage_ToApplication {
	
	WebDriver driver = null;
	String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
	String userName="admin";
	String Password="password";
	
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(priority=1)
	public void logIn()
	{
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys(Password);
		
		WebElement logIn=driver.findElement(By.id("btnLogin"));
		logIn.click();
		
	}
	
	@Test(priority=2)
	public void pim() throws InterruptedException
	{
		WebElement pim=driver.findElement(By.id("menu_pim_viewPimModule"));
		
		Actions act = new Actions(driver);
		act.moveToElement(pim).perform();
		
		Thread.sleep(5000);
		
	}
	
	@Test(priority=3)
	public void addEmployee() throws InterruptedException, IOException
	{
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("Kishore");
		
		driver.findElement(By.id("lastName")).sendKeys("hiiiii");
		
		driver.findElement(By.id("photofile")).click();
		
		Thread.sleep(10000);
		
		// uploading the Image to the Application
		// call the AutoIt Script - used to handle window based components
		
	
		java.lang.Runtime.getRuntime().exec("./AutoItScripts/ImageUpload.exe");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("btnSave")).click();
	}
	
	

}
