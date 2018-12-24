package com.c2t.edureka.ist830.module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yatra {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette",
				"D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yatra.com/");

		driver.findElement(By.xpath("//*[@id='BE_flight_origin_date']")).click();
		
		String userDate = "27/12/2018";
		
		String date1 = userDate + 7;
		
		String date = "//*[@id='"+ date1  + "']";
		
		driver.findElement(By.xpath(date)).click();
		

	}

}