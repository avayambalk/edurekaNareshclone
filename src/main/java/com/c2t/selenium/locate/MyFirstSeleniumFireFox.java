package com.c2t.selenium.locate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSeleniumFireFox {

	public static void main(String[] args) {
		
		String url = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/java/com/c2t/selenium/locate/LocatingMultipleElements.html";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		
		WebDriver driver2 = new FirefoxDriver();
		driver2.get(url);
		
		WebElement we = driver.findElement(By.id("fname"));
		we.sendKeys("I am first name");
		
		WebElement we2 = driver.findElement(By.name("lastname"));
		we2.sendKeys("I am last name");
		
	}
}