package com.c2t.testng.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyFirstTestNgProgram {

	static WebDriver driver;

	@BeforeTest
	public void setUp() {

		System.setProperty("webdriver.firefox.marionette",
				"D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");

		driver = new FirefoxDriver();
		driver.get(
				"file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/java/com/c2t/selenium/locate/LocatingMultipleElements.html");
	}
	
	@Test
	public void assert4() {
		String expectedValue = "Title";
		String actualValue = driver.getTitle();
		Assert.assertEquals(actualValue, expectedValue);
	}

	@Test
	public void testFName() {
		WebElement we = driver.findElement(By.name("firstname"));
		we.sendKeys("Hello...");
	}

	@Test
	public void testLName() {
		//System.out.println("Hello World..");
	}
}
