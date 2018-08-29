package com.c2t.selenium.session1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatingByTag {
	
	public static WebDriver driver;
	
	static String url = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/java/com/c2t/selenium/session1/DomTree.html";
	
	public static void main(String str[]){
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);
		
/*		WebElement we = driver.findElement(By.tagName("div"));
		String id = we.getAttribute("id");
		System.out.println(id);
*/		
		
		List<WebElement> list = driver.findElements(By.tagName("input"));
		
		System.out.println(list.size());
		
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getAttribute("name"));
		}
		
	}
}
