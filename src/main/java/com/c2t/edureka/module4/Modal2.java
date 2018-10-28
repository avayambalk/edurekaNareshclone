package com.c2t.edureka.module4;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Modal2 {
	
	static WebDriverWait wait;

	public static void main(String[] args) {
		
		
		String url = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/resources/Modal.html";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		
		WebElement we = driver.findElement(By.id("myBtn"));
		we.click();
		
		driver.getWindowHandles();
		
		/*WebElement weModal = driver.findElement(By.id("myModal"));
		String text = weModal.getText();
		System.out.println(text);
		
		weModal.click();*/
		
	}
}