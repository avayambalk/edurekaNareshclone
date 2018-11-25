package com.c2t.edureka.module7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TcFB {
	
	String url;
	WebDriver driver;
	PomFB pom;

	@BeforeTest
	public void beforeTest() {
		url = "https://www.facebook.com/";
		System.setProperty("webdriver.firefox.marionette",
				"D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");

		driver = new FirefoxDriver();
		driver.get(url);
		
		pom = new PomFB(driver);
	}

	@Test
	public void test1() {
		pom.findEmail();
		pom.findPassword();
	}

}