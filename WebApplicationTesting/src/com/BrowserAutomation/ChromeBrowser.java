package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		
		// Chrome Browser Automation
														
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\srinivas1\\Desktop\\May9AMBatch\\WebApplicationTesting\\driverFiles\\chromedriver.exe");
												// path of the driver file in the project
//ChromeDriver c = new ChromeDriver();
		
		// Firefox Browser Automation
	//	System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
		FirefoxDriver f = new FirefoxDriver();
		
		// Edge Browser Automation
	//	System.setProperty("webdriver.edge.driver", "./driverFiles/MicrosoftWebDriver.exe");
	// EdgeDriver e = new EdgeDriver();
		
		// Internet Explorer Browser
		// System.setProperty("webdriver.ie.driver", "./driverFiles/IEDriverServer.exe");
		// InternetExplorerDriver i = new InternetExplorerDriver();

	}

}
