package com.c2t.edureka.locate.del;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatingElementsCss {

	public static void main(String[] args) {
		
		String url = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/java/com/c2t/edureka/locate/LocatingMultipleElements.html";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		
		//WebElement we = driver.findElement(By.cssSelector("html>body>form>fieldset>div>input"));
		
		/*WebElement we1 = driver.findElement(By.cssSelector("input"));
		we1.sendKeys("using css selector");*/
		
		/*WebElement we2 = driver.findElement(By.cssSelector("input.w3-input"));
		we2.sendKeys("using class w3-input");*/
		
		/*WebElement we3 = driver.findElement(By.cssSelector(".w3-input"));
		we3.sendKeys("only class w3-input");*/
		
		//WebElement userName = driver.findElement(By.cssSelector("input[name='firstname']"));
		
		WebElement we4 = driver.findElement(By.cssSelector("input[type='text'],[name='lastname']"));
		we4.sendKeys("and condition in css");
	}
}