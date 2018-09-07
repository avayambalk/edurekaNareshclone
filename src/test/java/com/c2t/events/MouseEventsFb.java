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

public class MouseEventsFb {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		String baseUrl = "https://www.facebook.com/";
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(baseUrl);
	}

	@Test(priority = 2, enabled = true)
	public void testBuildingSeriesOfMultipleActions1() {
		WebElement txtUsername = driver.findElement(By.id("email"));
		
		Actions actions = new Actions(driver);
		
		
		/*
		
		Actions actions1 = actions.moveToElement(txtUsername);
		Actions actions2 = actions1.click();
		Actions actions3 = actions2.keyDown(Keys.SHIFT);
		Actions actions4 = actions3.sendKeys("email");
		Actions actions5 = actions4.doubleClick();
		Action action = actions5.build();
		action.perform();*/
		
		Action action = actions.moveToElement(txtUsername).click().
				keyDown(txtUsername, Keys.SHIFT).
		sendKeys(txtUsername, "hello").doubleClick().build();
		action.perform();
		

	}

	@AfterTest
	public void afterTest() {
		//driver.quit();
	}
}
