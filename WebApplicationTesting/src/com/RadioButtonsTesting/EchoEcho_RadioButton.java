package com.RadioButtonsTesting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EchoEcho_RadioButton {
	
	WebDriver driver = null;
	String url="http://www.echoecho.com/htmlforms10.htm";
	
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void radiobutton() throws InterruptedException
	{
		/*
		<input type="radio" name="group1" value="Milk">
		<input type="radio" name="group1" value="Butter" checked="">
		<input type="radio" name="group1" value="Cheese">
		 */
		// xpath of Block of Radio Buttons
		// /html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td
		
	WebElement radioButtonsBlock=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		List<WebElement>group1_RadioButtons=radioButtonsBlock.findElements(By.name("group1"));
		
		System.out.println(" The number of group1 radio buttons are : "+group1_RadioButtons.size());
		
		for(int i=0;i<group1_RadioButtons.size();i++) // will click on each radio button
		{
			group1_RadioButtons.get(i).click();
			
			Thread.sleep(5000);
	for(int j=0;j<group1_RadioButtons.size();j++) // will get the status of all the radio buttons
			{
				System.out.println(group1_RadioButtons.get(j).getAttribute("value")+" "+group1_RadioButtons.get(j).getAttribute("checked"));
			}
		}
		
			
	}

}
