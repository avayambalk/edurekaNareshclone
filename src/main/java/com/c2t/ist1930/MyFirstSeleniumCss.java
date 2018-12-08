package com.c2t.ist1930;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSeleniumCss {

	public static void main(String[] args) {
		String url = "view-source:file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/java/com/c2t/session/ist730/LocatingMultipleElements.html";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette",
				"D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(url);

	/*	WebElement we = driver.findElement(By.cssSelector("html body form fieldset div input"));
		we.sendKeys("css selector");*/
		
		/*WebElement we = driver.findElement(By.cssSelector("p.firstname"));
		System.out.println(we.getText());*/

		
		 driver.findElement(By.cssSelector("img:not([alt])"));
	}
}