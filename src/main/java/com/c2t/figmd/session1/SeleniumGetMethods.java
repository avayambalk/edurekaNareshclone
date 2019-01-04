package com.c2t.figmd.session1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumGetMethods {

	public static void main(String[] args) {
		String url = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/resources/LocatingMultipleElements.html";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(url);

		
		/*WebElement we = driver.findElement(By.name("firstname"));
		//we.clear();
		we.sendKeys("hello selenium");*/
		
	}
}