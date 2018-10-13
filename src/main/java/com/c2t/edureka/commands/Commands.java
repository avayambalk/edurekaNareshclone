package com.c2t.edureka.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Commands {

	public static void main(String[] args) {
		
		String url = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/java/com/c2t/edureka/locate/LocatingMultipleElements.html";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		
		
		/*String s = driver.getCurrentUrl();
		System.out.println(s);
		
		System.out.println("-------------------------------------");
		
		String source = driver.getPageSource();
		System.out.println(source);
		
		System.out.println("-------------------------------------");*/
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("My First Selenium!!!")){
			System.out.println("Test passed...");
		}else{
			System.out.println("Test failed...");
		}
		
		driver.close();
		
		
	}
}