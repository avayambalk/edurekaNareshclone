package com.c2t.edureka.module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class TestNG1 {

	WebDriver driver;
	String url = "http://cookbook.seleniumacademy.com/DragDropDemo.html";

	@BeforeTest
	public void before() {

		System.setProperty("webdriver.firefox.marionette",
				"D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);

	}

	@Test
	public void test1() {
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		Actions actions = new Actions(driver);

		Actions actions2 = actions.dragAndDrop(source, target);
		actions2.perform();
	}

	@Test
	public void test2() {
		
	}

}
