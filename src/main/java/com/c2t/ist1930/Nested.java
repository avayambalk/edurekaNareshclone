package com.c2t.ist1930;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Nested {

	public static void main(String[] args) {
		String url = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/java/com/c2t/session/ist730/NestedElements.html";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette",
				"D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(url);

		WebElement we1 = driver.findElement(By.tagName("div"));
		WebElement we2 =  we1.findElement(By.tagName("div"));
		WebElement we3 = we2.findElement(By.tagName("div"));
		String s = we3.getText();
		System.out.println(s);
		
	}
}