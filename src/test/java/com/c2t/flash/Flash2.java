package com.c2t.flash;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
import Flash.FlashObjectWebDriver;		
public class Flash2 {				
    public static void main(String[] args) throws InterruptedException {								
  	// Open firefox browser		
	WebDriver driver = new ChromeDriver();	
	System.setProperty("webdriver.chrome.driver", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/chromedriver.exe");
  	// Maximize browser		
	driver.manage().window().maximize();		
  	// Under Flash jar file there is separate FlashObjectWebDriver class		
	FlashObjectWebDriver flashApp = new FlashObjectWebDriver(driver, "clickcolors");		
  	// Pass the URL of video		
	driver.get("http://www.geocities.com/paulocaroli/flash/colors.html");			
	
	
	
  }		
}
