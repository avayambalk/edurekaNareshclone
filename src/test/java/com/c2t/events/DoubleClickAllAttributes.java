package com.c2t.events;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
import org.openqa.selenium.support.events.WebDriverEventListener;

public class DoubleClickAllAttributes {

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
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		String script = "var s = '';" +
		                "var o = getComputedStyle(arguments[0]);" +
		                "for(var i = 0; i < o.length; i++){" +
		                "s+=o[i] + ':' + o.getPropertyValue(o[i])+';';}" + 
		                "return s;";

		System.out.println(executor.executeScript(script, we));

	}

	@AfterTest
	public void afterTest() {
		// driver.quit();
	}
}
