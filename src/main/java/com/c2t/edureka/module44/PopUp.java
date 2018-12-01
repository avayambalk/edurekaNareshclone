package com.c2t.edureka.module44;

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
		
		String parentId = driver.getWindowHandle();
		Set<String> ids = driver.getWindowHandles();
		
		Iterator <String> iter = ids.iterator();
		
		while(iter.hasNext()){
			String s = iter.next();
			
			System.out.println("s="+s);
			
			if(!s.equals(parentId)){
				driver.switchTo().window(s);
				driver.findElement(By.name("emailid")).sendKeys("JavaSe");
			}
		}
		
		driver.switchTo().parentFrame();
		
	}
}