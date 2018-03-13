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

public class DoubleClick {

	WebDriver driver = null;

	@BeforeTest
	public void beforeTest() {
		String baseUrl = SeleniumUtil.getSrcTestJava() + "com/c2t/events/DoubleClick.html";
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(baseUrl);
	}

	@Test
	public void doubleClick() {

		WebElement we = driver.findElement(By.id("message"));
		
		Actions builder = new Actions(driver);
		
		Actions perform = builder.moveToElement(we).doubleClick();
		perform.perform();
		
		String bgColor =  we.getCssValue("background-color");
		System.out.println("bgColor = "+bgColor);
		

	}

	@AfterTest
	public void afterTest() {
		// driver.quit();
	}
}
