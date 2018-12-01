package com.c2t.edureka.module5;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsEvent {

	public static void main(String[] args) {
		
		String url = "https://www.facebook.com/";
		/*System.setProperty("webdriver.firefox.marionette", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		*/
		
		System.setProperty("webdriver.chrome.driver", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		WebElement email = driver.findElement(By.id("email"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(email).click().keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().perform();
		
		
		
	}
}