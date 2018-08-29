package com.c2t.selenium.locate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.c2t.util.SeleniumUtil;

public class LocatingRadio {

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
		
		List<WebElement> radios = driver.findElements(By.name("gender"));
	
		for(int i=0;i<radios.size();i++){
			WebElement we = radios.get(i);
			
			if(i==1){
				we.click();
			}
			
		}
	
	}
	


	
}
