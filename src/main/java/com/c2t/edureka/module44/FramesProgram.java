package com.c2t.edureka.module44;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesProgram {

	public static void main(String[] args) {
		
		String url = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/java/com/c2t/edureka/module4/ParentFrame.html";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		
		/*WebDriver wd =driver.switchTo().frame("top");
		String topSource = wd.getPageSource();
		System.out.println(topSource);
		*/
		
		/*WebDriver wd =driver.switchTo().frame(1);
		String topSource = wd.getPageSource();
		System.out.println(topSource);*/
		
		WebElement we = driver.findElement(By.tagName("frame"));
		
		WebDriver wd =driver.switchTo().frame(we);
		String topSource = wd.getPageSource();
		System.out.println(topSource);
		
		
	}
}