package com.c2t.edureka.locate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatingElements {

	public static void main(String[] args) {
		
		String url = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/java/com/c2t/edureka/locate/LocatingMultipleElements.html";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		
		
		/*WebElement we = driver.findElement(By.id("fname"));
		we.clear();*/
		
		/*WebElement we2 = driver.findElement(By.name("lastname"));
		we2.sendKeys("I am last name");*/
		
		/*WebElement we = driver.findElement(By.linkText("Hello"));
		we.clear();*/
		
		/*WebElement we3 = driver.findElement(By.partialLinkText("Hello"));
		we3.click();*/
		
		
		
	}
}