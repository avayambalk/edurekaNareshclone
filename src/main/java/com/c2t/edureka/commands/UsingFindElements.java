package com.c2t.edureka.commands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingFindElements {

	public static void main(String[] args) {
		
		String url = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/java/com/c2t/edureka/locate/LocatingMultipleElements.html";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		
		
		List<WebElement> list = driver.findElements(By.name("gender1"));
		
		for(int i=0;i<list.size() ; i++){
			if(i == 1){
				WebElement webElement = list.get(i);
				webElement.click();
			}
		}
		
		
	}
}