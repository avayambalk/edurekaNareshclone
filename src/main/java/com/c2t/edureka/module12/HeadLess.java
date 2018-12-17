package com.c2t.edureka.module12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HeadLess {

	@Test
	public void test1() {
		// Creating a new instance of the HTML unit driver

		WebDriver driver = new HtmlUnitDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Navigate to Google
		driver.get("https://www.facebook.com/");

		// Locate the searchbox using its name
		WebElement email = driver.findElement(By.id("email"));

		// Enter a search query
		email.sendKeys("naresh.javapro@gmail.com");
		
		WebElement pass = driver.findElement(By.id("pass"));

		// Enter a search query
		pass.sendKeys("Hello12#$");
			
		
		driver.findElement(By.id("loginbutton")).click();

		// Submit the query. Webdriver searches for the form using the text
		// input element automatically
		// No need to locate/find the submit button
		//element.submit();

		// This code will print the page title
		System.out.println("Page title is: " + driver.getTitle());


	}

}
