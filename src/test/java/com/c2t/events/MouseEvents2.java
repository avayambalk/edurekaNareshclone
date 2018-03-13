package com.c2t.events;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.c2t.util.SeleniumUtil;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents2 {

	WebDriver driver = null;

	@BeforeTest
	public void beforeTest() {
		// String baseUrl = "http://www.facebook.com";
		String baseUrl = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/resources/LocatingMultipleElements.html";
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(baseUrl);
	}

	@Test(priority = 2, enabled = true)
	public void testBuildingSeriesOfMultipleActions1() {

		WebElement txtUsername = driver.findElement(By.id("fname"));
		
		Actions builder = new Actions(driver);
		Action perform = builder.moveToElement(txtUsername).click().keyDown(txtUsername, Keys.SHIFT)
				.sendKeys(txtUsername, "Testing").doubleClick().build();

		perform.perform();

	}

	@AfterTest
	public void afterTest() {
		// driver.quit();
	}
}
