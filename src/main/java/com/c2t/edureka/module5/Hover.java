package com.c2t.edureka.module5;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover {

	public static void main(String[] args) {
		
		String url = "http://newtours.demoaut.com/";
		System.setProperty("webdriver.firefox.marionette", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		
		WebElement home = driver.findElement(By.linkText("Home"));
		
		WebElement firstRow = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr"));
		
		String color_bkground_no_hover = firstRow.getCssValue("background-color");
		System.out.println("color_bkground_no_hover="+color_bkground_no_hover);
		
		Actions action = new Actions(driver);
		action.moveToElement(home).perform();
		
		String color_bkground_hover = firstRow.getCssValue("background-color");
		System.out.println("color_bkground_hover="+color_bkground_hover);
		
	}
}