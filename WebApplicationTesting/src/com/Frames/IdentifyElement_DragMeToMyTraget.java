package com.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdentifyElement_DragMeToMyTraget {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = null;
		String url="https://jqueryui.com/droppable/";
		
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		
		// Browser Maximize
		driver.manage().window().maximize();
		
		Thread.sleep(5000);

		// <iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		// id="draggable" - property of Drag me to my Traget Element
		
		WebElement drag_Element=driver.findElement(By.id("draggable"));
		
		// id="droppable" - property of "Drop here" Element
		
		WebElement drop_Element=driver.findElement(By.id("droppable"));


	}

}
