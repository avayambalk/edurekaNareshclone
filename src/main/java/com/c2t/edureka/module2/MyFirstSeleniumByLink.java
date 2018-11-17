package com.c2t.edureka.module2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSeleniumByLink {

	public static void main(String[] args) {
		
		String url = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/java/com/c2t/edureka/module2/LocatingMultipleElements.html";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		
		
		//Ctrl + shift + T
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		
		//WebElement we1 = driver.findElement(By.linkText("1234 Hello, Naresh"));
		//we1.click();
		
		/*WebElement we1 = driver.findElement(By.partialLinkText("Hello"));
		we1.click();*/
		
		List<WebElement> l = driver.findElements(By.partialLinkText("Hello"));
		
		for(int i=0;i<l.size();i++){
			
			
			System.out.println(l.get(i));
			
			
		}
		

		
				
	
	}
}