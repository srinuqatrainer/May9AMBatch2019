package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercuryTours{
	
// Object Repository class - Identification of an element and performing the operation on element
	
	// <a href="mercurysignon.php">SIGN-ON</a>
	
	//WebElement singOn=driver.findElement(By.linkText("SIGN-ON"));
	// singOn.click();
	
	// identification of the Element
	@FindBy(linkText="SIGN-ON")
	WebElement singOn;
	
	// Performing the operation on the Element- method or Business Logic
	public void SignOn()
	{
		singOn.click();
	}
	
	// <a href="mercuryregister.php">REGISTER</a>
	
	@FindBy(linkText="REGISTER")
	WebElement Register;
	
	public void register()
	{
		Register.click();
	}
	
	@FindBy(name="userName")
	WebElement UserName;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="login")
	WebElement SignIn;
	
	public void logIn(String userName,String password)
	{
		UserName.sendKeys(userName);
		Password.sendKeys(password);
		SignIn.click();
	}
	
}
