package com.c2t.selenium.session1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSelenium_HTML_Elements {

	public static void main(String[] args) {
		String url = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/resources/LocatingMultipleElements.html";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette",
				"D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		
		WebElement we = driver.findElement(By.name("firstname"));
		we.clear();
		we.sendKeys("Welcome to selenium");
		

	}
}