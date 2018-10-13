package com.c2t.edureka.locate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathPreceding {

	public static void main(String[] args) {

		String url = "https://www.facebook.com/";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get(url);

		

	}
}