package com.c2t.edureka.module3;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		String url = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/java/com/c2t/edureka/module2/LocatingMultipleElements.html";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		

		WebDriverWait wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.titleContains("My First Selenium!!!"));
		
		WebDriverWait wait2 = new WebDriverWait(driver, 5);
		//wait.until(ExpectedConditions.titleContains("My First Selenium!!!"));
		wait2.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("theButton"))));
		
		
	
	}
}