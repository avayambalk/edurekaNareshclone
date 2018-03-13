package com.c2t.events;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.c2t.util.SeleniumUtil;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents1 {

	WebDriver driver = null;

	@BeforeTest
	public void beforeTest() {
		String baseUrl = "http://newtours.demoaut.com/";
		driver = new FirefoxDriver();
		driver.get(baseUrl);
	}

	@Test(priority = 1, enabled = true)
	public void testMoveToElement() {

		String expectedBefore = "rgba(255, 165, 0, 1)";
		String expectedAfter = "transparent";
		WebElement link_Home = driver.findElement(By.linkText("Home"));
		WebElement td_Home = driver.findElement(By.xpath("//html/body/div" + "/table/tbody/tr/td" + "/table/tbody/tr/td"
				+ "/table/tbody/tr/td" + "/table/tbody/tr"));

		String bgColor = td_Home.getCssValue("background-color");
		// System.out.println("Before hover: " + bgColor);
		Assert.assertEquals(bgColor, expectedBefore);

		SeleniumUtil.slowDownProcess(1000);

		Actions builder = new Actions(driver);
		Action mouseOverHome = builder.moveToElement(link_Home).build();
		SeleniumUtil.slowDownProcess(5000);

		mouseOverHome.perform();

		SeleniumUtil.slowDownProcess(1000);

		bgColor = td_Home.getCssValue("background-color");
		Assert.assertEquals(bgColor, expectedAfter);

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
