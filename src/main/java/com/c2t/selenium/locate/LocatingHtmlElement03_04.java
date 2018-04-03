package com.c2t.selenium.locate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.c2t.util.SeleniumUtil;

public class LocatingHtmlElement03_04 {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		// driver.manage().window().maximize();
		driver.get(
				"file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/resources/LocatingMultipleElements.html");

//		WebElement we = driver.findElement(By.name("firstname"));
//		we.sendKeys("my first selenium...");
		
		/*WebElement we2 = driver.findElement(By.id("lname"));
		we2.clear();
		we2.sendKeys("New Value of lname");*/
		
		//WebElement we3 = driver.findElement(By.className("w3-input"));
		
		/*WebElement we4 = driver.findElement(By.linkText("Click Me"));
		we4.click();*/
		
		/*WebElement we4 = driver.findElement(By.partialLinkText("Link"));
		we4.click();*/
		
		List<WebElement> l = driver.findElements(By.tagName("input"));
		
		WebElement second = l.get(1);
		second.sendKeys("input tag...");
		
		
	}

}
