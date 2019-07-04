package com.OHRM.lib;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.Utility.Log;

public class General extends Global 
{

	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get(url);
		//System.out.println("Successfully Navigated to OHRM Application Home Page");
		
		Log.info("Successfully Navigated to OHRM Application Home Page");
		
	}
	
	public void tearDown()
	{
		driver.quit();
		//System.out.println("OHRM Application successfully closed");
		Log.info("OHRM Application successfully closed");
	}
	
	public void verifyLogIn()
	{
		String actual_VeryLogInText=driver.findElement(By.id("welcome")).getText();
		assertTrue(actual_VeryLogInText.equals("Welcome Admin"));
		//System.out.println("Successfully Logged into OHRM Application");
		Log.info("Successfully Logged into OHRM Application");
	}
	
	public void logIn()
	{
		driver.findElement(By.id(text_UserName)).sendKeys(userName);
		Log.info("Entered Username");
		driver.findElement(By.id(text_Password)).sendKeys(password);
		Log.info("Entered Password");
		driver.findElement(By.name(text_SubmitButton)).click();
		Log.info("Perfom click operation of LogIn button");
		//System.out.println("LogIn Successfull");
		Log.info("LogIn Successfull");
	}
	
	public void pim() throws InterruptedException
	{
		WebElement pim=driver.findElement(By.id(text_PIM));
		Actions act = new Actions(driver);
		act.moveToElement(pim).perform();
		Log.info("MouseHover on PIM ");
		
		Thread.sleep(5000);
	}
	
	public void addEmployee()
	{
		driver.findElement(By.id(text_AddEmployee)).click();
		Log.info("Perform click on AddEmployee ");
		driver.findElement(By.id(text_FirstName)).sendKeys("user1");
		Log.info("Entered FirstName");
		driver.findElement(By.id(text_MiddleName)).sendKeys("hello");
		Log.info("Entered MiddleName");
		driver.findElement(By.id(text_LastName)).sendKeys("hiiii");
		Log.info("Entered LastName");
		
String empId=driver.findElement(By.id(text_EmpId)).getAttribute("value");
		//System.out.println("Employee id is : "+empId);
Log.info("Employee id is : "+empId);
		
		driver.findElement(By.id(text_SaveButton)).click();
Log.info("click on Save button");		
	String reg_EmpName=driver.findElement(By.xpath("//*[@id='profile-pic']/h1")).getText();
		//System.out.println("Registed Employee name is : "+reg_EmpName);
	Log.info("Registed Employee name is : "+reg_EmpName);
		
	}
	
	public void logOut()
	{
		driver.findElement(By.id(text_welcomeMessage)).click();
		Log.info("Click on Welcome Admin link");
		driver.findElement(By.linkText(text_logOut)).click();
		Log.info("Click on LogOut");
		//System.out.println("Successfully logged Out of OHRM Application");
		Log.info("Successfully logged Out of OHRM Application");
				
	}
}
