package com.c2t.edureka.module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class Yatra {

	public static void main(String[] args) {
		String url = "https://www.yatra.com/";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette",
				"D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");

		// Ctrl + shift + T
		WebDriver driver = new FirefoxDriver();
		driver.get(url);

		driver.findElement(By.xpath(".//*[@id='BE_flight_origin_date']")).click();
		driver.findElement(By.xpath(".//*[@id='18/11/2018']")).click();
	}

}
