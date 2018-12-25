package com.c2t.edureka.module4;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Modal {

	public static void main(String[] args) {
		
		String url = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/java/com/c2t/edureka/module4/Modal.html";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get(url);
				
		driver.findElement(By.id("myBtn")).click();
		
		WebElement we = driver.findElement(By.id("myModal"));
		String text = we.getText();
		System.out.println(text);
		
		//we.click();
		
		
	}
}