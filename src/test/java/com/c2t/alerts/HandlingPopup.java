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

public class HandlingPopup {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
	}

	@Test(priority = 1, enabled = true)
	public void popUp() {
		// Launching the site.
		
	
		
		
		driver.findElement(By.linkText("Click Here")).click();
		
		
		String parent = driver.getWindowHandle();
		Set <String>windows = driver.getWindowHandles();
		
		Iterator <String> iter = windows.iterator();
		
		while(iter.hasNext()){
			String window = iter.next();
			
			if(window.equals(parent)){
				
			}else{
				driver.switchTo().window(window);
				driver.findElement(By.name("emailid")).sendKeys("hello");
				driver.findElement(By.name("btnLogin")).click();
				//driver.close();
				
			}
			
		}
		
		//driver.switchTo().window(parent);

	}

	public void pause() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
