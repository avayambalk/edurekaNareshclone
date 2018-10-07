package com.c2t.edureka.locate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatingElementsYatra {

	public static void main(String[] args) {

		String url = "https://www.yatra.com/";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get(url);

		driver.findElement(By.xpath(".//*[@id='BE_flight_origin_date']")).click();
		driver.findElement(By.xpath(".//*[@id='08/10/2018']")).click();

	}
}