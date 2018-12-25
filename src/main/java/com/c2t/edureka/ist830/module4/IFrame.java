package com.c2t.edureka.ist830.module4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.List;

public class IFrame {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/java/com/c2t/edureka/ist830/module4/iFrame.html");
	
		WebElement we = driver.findElement(By.name("iframe1"));
		driver.switchTo().frame(we);
		
		String text = driver.findElement(By.xpath("html/body/div[1]/div/div[1]/main/article/header/h2")).getText();
		
		System.out.println(text);
	
	}
}
