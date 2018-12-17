package com.c2t.ist830;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLocators {

	public static void main(String[] args) {
		String url = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/java/com/c2t/ist830/LocatingMultipleElements.html";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette",
				"D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		
		//WebElement web = driver.findElement(By.partialLinkText("Hello"));
		driver.findElement(By.tagName("input")).sendKeys("Hello");
	}
}