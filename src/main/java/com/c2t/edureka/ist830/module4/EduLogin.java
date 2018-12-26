package com.c2t.edureka.ist830.module4;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EduLogin {

	public static void main(String[] args) {
		
		String url = "https://www.edureka.co/";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		//Ctrl + shift + T
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get(url);
		
		driver.findElement(By.linkText("Log In")).click();
		
		driver.findElement(By.id("si_popup_email")).sendKeys("email id");
		
		
		
	}
}