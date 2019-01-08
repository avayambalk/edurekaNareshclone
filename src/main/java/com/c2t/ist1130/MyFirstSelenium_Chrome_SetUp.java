package com.c2t.ist1130;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSelenium_Chrome_SetUp {

	public static void main(String[] args) {
		String url = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/resources/LocatingMultipleElements.html";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver",
				"D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/chromedriver_win32_2.45/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		/*
		 * WebElement we1 = driver.findElement(By.linkText("Emp100"));
		 * we1.click();
		 */

		/*
		 * List<WebElement> elements = driver.findElements(By.name("gender"));
		 * 
		 * for(int i=0; i<elements.size(); i++){ WebElement we =
		 * elements.get(i);
		 * 
		 * String val = we.getAttribute("value");
		 * 
		 * if(val.equals("female")){ we.click(); } }
		 */

		/*WebElement we1 = driver.findElement(By.partialLinkText("Emp"));
		we1.click();*/
		
		List<WebElement> elements  = driver.findElements(By.tagName("input"));

	}
}