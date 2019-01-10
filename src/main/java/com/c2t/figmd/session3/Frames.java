package com.c2t.figmd.session3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;

public class Frames {

	private static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/chromedriver_win32_2.45/chromedriver.exe");
		driver = new ChromeDriver();
		// driver.get("http://cookbook.seleniumacademy.com/Alerts.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/java/com/c2t/figmd/session3/ParentFrame.html");
		
		String code1 = driver.getPageSource();
		System.out.println(code1);
		
		driver.switchTo().frame("top");

		String code2 = driver.getPageSource();
		System.out.println(code2);
	}

}
