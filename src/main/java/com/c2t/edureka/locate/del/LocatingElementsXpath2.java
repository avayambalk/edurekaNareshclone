package com.c2t.edureka.locate.del;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatingElementsXpath2 {

	public static void main(String[] args) {

		String url = "https://www.facebook.com/";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get(url);

		WebElement we = driver.findElement(By.xpath(".//*[@id='email']"));
		we.sendKeys("message4naresh@gmail.com");

	}
}