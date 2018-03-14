package com.c2t.selenium.locate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.c2t.util.SeleniumUtil;

public class LocatingElementByXpath {

	static WebDriver driver;

	static void launchBrowser() {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		
		WebDriver.Options opt = driver.manage();
		WebDriver.Window win = opt.window();
		win.maximize();
		
		//driver.manage().window().maximize();
		//String resourceDir = SeleniumUtil.getRootDir() + "LocatingMultipleElements.html";
		String resourceDir = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/resources/LocatingMultipleElements.html";
		driver.get(resourceDir);
	}

	public static void main(String[] args) {
		launchBrowser();
		
		
		findByXapth();
	}
	
	static void findByXapth() {
		WebElement we = driver.findElement(By.xpath("//input[ends-with(@id,'name')"));
		boolean bool = we.isEnabled();
		System.out.println(bool);
		
		String textInTextbox = we.getAttribute("value");
		System.out.println("textInTextbox = "+textInTextbox);
		
	}
	


	
}
