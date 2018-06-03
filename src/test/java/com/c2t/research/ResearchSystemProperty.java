package com.c2t.research;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;


import static org.junit.Assert.*;

public class ResearchSystemProperty {

	private static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		//System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://cookbook.seleniumacademy.com/Alerts.html");
		//driver.get("file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/resources/Alert.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void t1() {
		
	}
	
	@Test
	public void testSimpleAlert() {
		
	}

	
}
