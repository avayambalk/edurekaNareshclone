package com.c2t.edureka.module2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class MyFirstSeleniumByIdName {

	public static void main(String[] args) {
		
		String url = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/java/com/c2t/edureka/module2/LocatingMultipleElements.html";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		
		
		//Ctrl + shift + T
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		
		/*WebElement we1 = driver.findElement(By.id("fname"));
		we1.sendKeys("First Name is Java");*/
		
		List <WebElement> l = driver.findElements(By.name("firstname"));
		
		for(int i=0;i<l.size();i++){
			if(i == 0){
				//WebElement we1 = l.get(i);
				//we1.sendKeys("i am first name");
			}else{
				WebElement we2 = l.get(i);
				we2.sendKeys("i am last name");
			}
		}
				
	
	}
}