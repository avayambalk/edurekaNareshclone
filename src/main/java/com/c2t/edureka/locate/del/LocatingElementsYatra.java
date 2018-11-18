package com.c2t.edureka.locate.del;

import java.util.concurrent.TimeUnit;

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
		/*WebDriver.Options opt = driver.manage();
		WebDriver.Timeouts tout = opt.timeouts();
		tout.implicitlyWait(5, TimeUnit.SECONDS);*/
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get(url);

		driver.findElement(By.xpath(".//*[@id='BE_flight_origin_date']")).click();
		driver.findElement(By.xpath(".//*[@id='16/10/2018']")).click();
		
		driver.findElement(By.xpath(".//*[@id='BE_flight_arrival_date']")).click();;
		driver.findElement(By.xpath(".//*[@id='30/11/2018']")).click();

		
	}
}