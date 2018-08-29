package com.c2t.alerts;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HandlingPopupChrome {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/popup.php");
	}

	@Test
	public void popUp() {
		// Launching the site.

		// String MainWindow = driver.getWindowHandle();
		// To handle all new opened window.
		// Set<String> s1 = driver.getWindowHandles();
		// driver.switchTo().window(ChildWindow);
		
		driver.findElement(By.linkText("Click Here")).click();
		String parent = driver.getWindowHandle();
		Set <String> windows = driver.getWindowHandles();
		
		Iterator<String> iter = windows.iterator();
		
		while(iter.hasNext()){
			String window = iter.next();
			if(!parent.equals(window)){
				driver.switchTo().window(window);
				
				driver.findElement(By.name("btnLogin")).click();
				//driver.close();
				
			}
		}
		
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		/*driver.findElement(By.linkText("Click Here")).click();
		 * 
		 * 
		 * 

		String parent = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String>  iter = windows.iterator();
		while(iter.hasNext()){
			String s = iter.next();
			
			if(s.equals(parent)){
				
			}else{
				driver.switchTo().window(s);
			}
		}*/
		
		
		
	}

}
