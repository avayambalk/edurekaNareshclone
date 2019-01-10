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

public class PopUp {

	private static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/chromedriver_win32_2.45/chromedriver.exe");
		driver = new ChromeDriver();
		// driver.get("http://cookbook.seleniumacademy.com/Alerts.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/popup.php");
		
		driver.findElement(By.linkText("Click Here")).click();
		
		String parent = driver.getWindowHandle();
		Set <String> windows = driver.getWindowHandles();
		System.out.println("parent="+parent);
		System.out.println(windows);
		
		
		System.out.println("title2="+driver.getTitle());
		
		
		Iterator<String> iter = windows.iterator();
		
		while(iter.hasNext()){
			String name = iter.next();
			
			if(!name.equals(parent)){
				driver.switchTo().window(name);
				driver.findElement(By.name("emailid")).sendKeys("java selenium");
				System.out.println("title1="+driver.getWindowHandle());
				driver.close();
			}
		}
		

	}

}
