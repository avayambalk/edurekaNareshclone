package com.c2t.ist830;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFrames {

	public static void main(String[] args) {
		
		String url = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/java/com/c2t/edureka/module4/ParentFrame.html";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		
		
		//Ctrl + shift + T
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		
		driver.switchTo().frame("top");
		String s = driver.getPageSource();
		//System.out.println(s);
		
		driver.switchTo().defaultContent();
		String s2 = driver.getPageSource();
		System.out.println(s2);
		
		
	
	}
}