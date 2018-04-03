package com.c2t.selenium.locate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.c2t.util.SeleniumUtil;

public class LocatingHtmlElement {

	static WebDriver driver;

	static void launchBrowser() {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		String resourceDir = SeleniumUtil.getRootDir() + "LocatingMultipleElements.html";
		driver.get(resourceDir);
	}

	public static void main(String[] args) {
		launchBrowser();
		
		findByName();
		/*findById();
		findByClassName();
		
		closeBrowser();*/
	}

	static void findByName() {
		/*List <WebElement> we  = driver.findElements(By.name("firstname"));
		System.out.println("we = "+we);*/
		
		WebElement we = driver.findElement(By.name("firstname"));
		System.out.println(we);
		we.sendKeys("Hello Selenium");
	}
	
	static void findById() {
		WebElement we = driver.findElement(By.id("fname"));
		System.out.println("we = "+we);
	}
	
	static void findByClassName() {
		WebElement we = driver.findElement(By.className("w3-input"));
		System.out.println("we = "+we);
	}
	
	static void closeBrowser() {
		driver.close();
	}

}
