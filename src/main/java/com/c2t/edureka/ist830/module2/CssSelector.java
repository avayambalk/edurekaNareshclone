package com.c2t.edureka.ist830.module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette",
				"D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/java/com/c2t/edureka/ist830/module2/LocatingMultipleElements.html");
		
		WebElement previousButton = driver.findElement(By.cssSelector("input:not[name]"));
		
		System.out.println("done...");
	
	}

}