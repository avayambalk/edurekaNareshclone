package com.c2t.ist830;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertProgram {

	public static void main(String[] args) {
		
		String url = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/java/com/c2t/edureka/module4/Alert.html";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		
		
		//Ctrl + shift + T
		WebDriver driver = new FirefoxDriver();
		
		driver.get(url);
		
		driver.findElement(By.id("simple")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		/*driver.findElement(By.id("confirm")).click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();*/

		/*driver.findElement(By.id("prompt")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Pratima");
		alert.accept();*/
		
		
	}
}