package com.c2t.edureka.module4.old;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertProgram2 {

	public static void main(String[] args) {
		
		String url = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/java/com/c2t/edureka/module4/Alert.html";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		
		driver.findElement(By.id("prompt")).click();
		
		TargetLocator tl = driver.switchTo();
		Alert alt = tl.alert();
		
		
		alt.sendKeys("This is 3rd alert");
		
		
		
		
		
	}
}