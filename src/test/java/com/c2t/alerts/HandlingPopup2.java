package com.c2t.alerts;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HandlingPopup2 {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/popup.php");
	}

	@Test
	public void popUp() {
		// Launching the site.
		
	
		//String MainWindow = driver.getWindowHandle();
		// To handle all new opened window.
		//Set<String> s1 = driver.getWindowHandles();
		//driver.switchTo().window(ChildWindow);
		
		String parent = driver.getWindowHandle();
		
		WebElement we = driver.findElement(By.linkText("Click Here"));
		we.click();
		
		Set<String> windows = driver.getWindowHandles();	
		
		Iterator<String> iter = windows.iterator();
		
		while(iter.hasNext()){
			String window= iter.next();
			if(!window.equals(parent)){
				driver.switchTo().window(window);
				
				driver.findElement(By.name("emailid")).sendKeys("Hello");
			}
		}
		
		driver.switchTo().window(parent);
		
	}

	}
