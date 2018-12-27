package com.c2t.edureka.ist830.module5;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FacebookEvent {

	public static void main(String[] args) {
		
		String url = "https://www.facebook.com/";
		// declaration and instantiation of objects/variables
		//System.setProperty("webdriver.firefox.marionette", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		System.setProperty("webdriver.firefox.marionette", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");


		WebDriver driver = new FirefoxDriver();
		driver.get(url);
	
		
		WebElement emailPhone = driver.findElement(By.id("email"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(emailPhone);
	
		Actions action1 = actions.click();
		Actions action2 = action1.keyDown(Keys.SHIFT);
		Actions action3 = action2.sendKeys("hello");
		Actions action4 = action3.doubleClick();
		Action  action = action4.build();
		
		action.perform();
		
		
		
		
		
		
		
				
		
		
	}
}