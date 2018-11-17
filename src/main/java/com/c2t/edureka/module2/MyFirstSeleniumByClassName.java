package com.c2t.edureka.module2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSeleniumByClassName {

	public static void main(String[] args) {
		
		String url = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/java/com/c2t/edureka/module2/LocatingMultipleElements.html";
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.firefox.marionette", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		
		
		//Ctrl + shift + T
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		
		//WebElement we1 = driver.findElement(By.cssSelector("input[name='firstname'][class='w3-input']"));
		//we1.sendKeys("input.w3-input");
		
		WebElement we2 = driver.findElement(By.cssSelector("input[name='firstname'],[class='w3-input2']"));
		we2.sendKeys("using multiple");
	
	}
}