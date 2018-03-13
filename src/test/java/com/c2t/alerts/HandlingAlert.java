package com.c2t.alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAlert {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		String alertMessage = "";

		driver.get("http://jsbin.com/usidix/1");
		driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
		
		//driver.findElement(By.name("theButton")).click();
		
		alertMessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();

		System.out.println(alertMessage);
		//driver.quit();

	}
}
