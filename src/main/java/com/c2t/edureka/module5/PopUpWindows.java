package com.c2t.edureka.module5;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class PopUpWindows {

	public static void main(String[] args) {
		
		String url = "http://demo.guru99.com/popup.php";
		System.setProperty("webdriver.firefox.marionette", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		
		driver.findElement(By.linkText("Click Here")).click();
		
		String parent = driver.getWindowHandle();
		System.out.println("parent="+parent);
		Set<java.lang.String> set = driver.getWindowHandles();
		
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()){
			
			String windowId = iter.next();
			
			if(! windowId.equals(parent)){
				System.out.println("windowId="+windowId);
				driver.switchTo().window(windowId);
				driver.findElement(By.name("emailid")).sendKeys("Monika");
				driver.close();
			}
			
		}
		
		driver.switchTo().window(parent);
		
	
	}
}