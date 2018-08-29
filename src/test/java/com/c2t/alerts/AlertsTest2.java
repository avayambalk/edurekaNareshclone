package com.c2t.alerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;

public class AlertsTest2 {

	private static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		//driver.get("http://cookbook.seleniumacademy.com/Alerts.html");
		driver.get("file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/resources/Alert.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void testSimpleAlert() {
		
		driver.findElement(By.id("simple")).click();
		TargetLocator target = driver.switchTo();
		Alert al = target.alert();
		//al.accept();
		System.out.println(al.getText());
		al.accept();
	}
}
