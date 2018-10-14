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

public class PopUp {

	public static void main(String[] args) {
		
		String url = "http://demo.guru99.com/popup.php";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		
		driver.findElement(By.linkText("Click Here")).click();
		
		String parent = driver.getWindowHandle();
		System.out.println("parent="+parent);
		
		Set <String> s = driver.getWindowHandles();
		
		Iterator <String> iter = s.iterator();
		
		while(iter.hasNext()){
			String next = iter.next();
			System.out.println("next="+next);
			
			if(parent.equals(next)){
				
			}else{
				driver.switchTo().window(next);
				driver.findElement(By.name("emailid")).sendKeys("message4naresh@gmail.com");
				//driver.close();
			}
			
		}
		
		driver.switchTo().window(parent);
		driver.quit();
		
		
	}
}