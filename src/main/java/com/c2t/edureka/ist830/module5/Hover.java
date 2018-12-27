package com.c2t.edureka.ist830.module5;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Hover {

	public static void main(String[] args) {
		
		String url = "http://newtours.demoaut.com/";
		// declaration and instantiation of objects/variables
		//System.setProperty("webdriver.firefox.marionette", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		System.setProperty("webdriver.firefox.marionette", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");


		WebDriver driver = new FirefoxDriver();
		driver.get(url);
	
		
		WebElement row1 = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr"));
		String existing_background_color = row1.getCssValue("background-color");
	
		
		
		WebElement home = driver.findElement(By.linkText("Home"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(home).perform();
		
		String new_background_color = row1.getCssValue("background-color");
		
		System.out.println("existing_background_color="+existing_background_color);
		System.out.println("new_background_color="+new_background_color);
		
		
		
		
		
				
		
		
	}
}