package com.c2t.miscellaneous;


import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumInputRadioCheckboxDropdownEtc {

	WebDriver driver = null;
	String baseUrl = null;

	@BeforeMethod
	public void beforeTest() {
		
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/resources/LocatingMultipleElements.html";
		driver.get(baseUrl);
	}

	@Test
	public void testClearSendKeys() {
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("sendKeys");
	}

	@Test
	public void testRadioButtonByNameIsSelected() {
		List<WebElement> we = driver.findElements(By.name("gender"));
		boolean isSelected = false;
		isSelected = we.get(0).isSelected();
		System.out.println("isSelected-------------------------------->"
				+ isSelected);
		if (isSelected) {
			we.get(1).click();
		} else {
			we.get(0).click();
		}
	}

	@Test
	public void testRadioButtonByNameGetAttribute() {
		List<WebElement> we = driver.findElements(By.name("gender"));
		String selected = we.get(0).getAttribute("value");
		System.out.println("selected-------------------------------->"
				+ selected);
		if (selected != null && selected.equalsIgnoreCase("male")) {
			we.get(1).click();
		}
	}

	@Test
	public void testRadioButtonByCssSelection() {
		List<WebElement> we = driver.findElements(By
				.cssSelector("input[value='female']"));
		String selected = we.get(0).getAttribute("value");
		System.out.println("selected-------------------------------->"
				+ selected);
	}

	@Test
	public void testDropDownSelectByVisibleText() {
		Select dropdown = new Select(driver.findElement(By.id("designation")));
		dropdown.selectByVisibleText("Programmer");
	}

	@Test
	public void testDropDownSelectByIndex() {
		Select dropdown = new Select(driver.findElement(By.id("designation")));
		dropdown.selectByIndex(2);
	}

	@Test
	public void testDropDownSelectByValue() {
		Select dropdown = new Select(driver.findElement(By.id("designation")));
		dropdown.selectByValue("Java");
	}

	@AfterMethod
	public void afterTest() {
		// driver.quit();
	}
}
