package com.c2t.figmd.session2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : https://connect2tech.in/
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class LocatorId {
	public static void main(String[] args) {
		String url = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/resources/LocatingMultipleElements.html";
		// declaration and instantiation of objects/variables
		/*System.setProperty("webdriver.chrome.driver",
				"D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/chromedriver.exe");*/
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get(url);
		
		/*WebElement we1 = driver.findElement(By.id("fname"));
		we1.clear();
		we1.sendKeys("locating with id");*/
		
		/*WebElement we = driver.findElement(By.linkText("Emp100"));
		we.click();*/
		
		/*WebElement we = driver.findElement(By.partialLinkText("Emp"));
		we.click();*/
		
		/*WebElement we = driver.findElement(By.className("w3-input"));
		we.clear();
		we.sendKeys("This is last name");
*/
		
		/*WebElement we = driver.findElement(By.tagName("input"));
		we.clear();
		we.sendKeys("using tags");*/
		
		/*List<WebElement> radios = driver.findElements(By.className("w3-radio"));
		
		for(int i=0;	i<radios.size();	i++){
			WebElement we = radios.get(i);
			String val = we.getAttribute("value");
			if(val.equals("female")){
				we.click();
			}
		}*/
		
		WebElement dropdown = driver.findElement(By.id("designation"));
		
		Select select = new Select(dropdown);
		//select.selectByVisibleText("CEO");
		//select.selectByValue("CEO1");
		select.selectByIndex(2);
		
	
		
	}
}
