package com.c2t.edureka.ist830.module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FramesExample {

	public static void main(String[] args) {
		String url = "https://www.facebook.com/";
		System.setProperty("webdriver.firefox.marionette", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/java/com/c2t/edureka/ist830/module4/ParentFrame.html");
	
		String before = driver.getPageSource();
		
		System.out.println(before);
		
		System.out.println("------------------------------------------");
		
		driver.switchTo().frame("top");
		
		String after = driver.getPageSource();
		System.out.println(after);
		
	
	
	}
}