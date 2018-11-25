package com.c2t.edureka.module5;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertProgram {

	public static void main(String[] args) {
		
		String url = "http://cookbook.seleniumacademy.com/DragDropDemo.html";
		System.setProperty("webdriver.firefox.marionette", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get(url);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
		
		Actions actions2 = actions.dragAndDrop(source, target);
		actions2.perform();
		
		
		
	}
}