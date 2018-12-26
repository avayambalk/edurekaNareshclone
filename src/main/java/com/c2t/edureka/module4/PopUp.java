package com.c2t.edureka.module4;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUp {

	public static void main(String[] args) {
		
		String url = "http://demo.guru99.com/popup.php";
		// declaration and instantiation of objects/variables
		//System.setProperty("webdriver.firefox.marionette", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/chromedriver.exe");

		
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		driver.findElement(By.linkText("Click Here")).click();

		String parent = driver.getWindowHandle();
		
		Set <String> allWindows = driver.getWindowHandles();
		
		
		Iterator <String> iter = allWindows.iterator();
		
		while(iter.hasNext()){
			
			String window = iter.next();
			
			if(! window.equals(parent)){
				driver.switchTo().window(window);
				driver.findElement(By.name("emailid")).sendKeys("naresh");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//driver.close();
			}
		}
		
		driver.switchTo().defaultContent();
		driver.quit();
	
	}
}