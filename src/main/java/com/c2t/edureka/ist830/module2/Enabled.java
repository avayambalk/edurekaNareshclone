package com.c2t.edureka.ist830.module2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Date;

public class Enabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette",
				"D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/java/com/c2t/edureka/ist830/module2/Enabled.html");
		
		WebElement we = driver.findElement(By.name("lname"));
		boolean isDisplayed = we.isDisplayed();
		boolean isEnabled = we.isEnabled();
		boolean isSelected = we.isSelected();
		
		System.out.println("isDisplayed="+isDisplayed);
		System.out.println("isEnabled="+isEnabled);
		System.out.println("isSelected="+isSelected);
		
		

		

	}

}