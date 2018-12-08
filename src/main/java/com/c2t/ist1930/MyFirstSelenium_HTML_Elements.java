package com.c2t.ist1930;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSelenium_HTML_Elements {

	public static void main(String[] args) {
		String url = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/resources/LocatingMultipleElements.html";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette",
				"D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(url);

		/*WebElement we = driver.findElement(By.name("first_name"));
		we.sendKeys("hello");

		WebElement we2 = driver.findElement(By.linkText("Hello, Naresh. Welcome your id is 12345"));
		we2.click();
		
		driver.findElement(By.partialLinkText("Hello"));
		
		driver.findElement(By.tagName("button"));*/
		
		//driver.findElement(By.className("w3-input")).sendKeys("The class is w3-input");
		
		/*List<WebElement> list = driver.findElements(By.name("gender"));
		
		for(int i=0;i< list.size(); i++){
			WebElement web = list.get(i);
			String str = web.getAttribute("value");
			
			if(str.equals("female")){
				web.click();
			}
		}*/
		
		driver.findElements(By.tagName("input"));
		
	}
}