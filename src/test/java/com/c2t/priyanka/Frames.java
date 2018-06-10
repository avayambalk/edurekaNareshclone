package com.c2t.priyanka;
import org.testng.annotations.*;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	private WebDriver driver;
	private Scanner s;

	@BeforeTest
	public void OpenConnect2Tech() {
		System.setProperty("webdriver.chrome.driver", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8888/connect2tech.in-Selenium-Automation-Java-1.x/");
		String currentWindow = driver.getWindowHandle();
		driver.switchTo().window(currentWindow);
	}

	@Test
	public void Fra() throws InterruptedException {
		String parent = driver.getWindowHandle();//window handle
		WebElement felem = driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[1]/td[2]/button"));//locating frames
		felem.click();

		Thread.sleep(6000);
		Set<String> windows = driver.getWindowHandles();//shifting control to next window
		Iterator<String> it = windows.iterator();
		while (it.hasNext()) {
			String window = it.next();

			if (!window.equals(parent)) {
				driver.switchTo().window(window);
				driver.switchTo().frame("packageListFrame");//switch to package list frames
			}
		}
		WebElement web1 = driver.findElement(By.tagName("ul"));//finding the parent tag
		List<WebElement> total = web1.findElements(By.tagName("li"));//finding the tags of the packages
		System.out.println("The total no of packagaes : " + total.size());//get the total no of elements in the tag
	}
	
	@Test
	public void Inter() throws InterruptedException{
	 s=new Scanner(System.in);
		System.out.println("Enter the package to click on and check the classes , interfaces and exceptions: ");
		String pack=s.nextLine();
		WebElement web2=driver.findElement(By.linkText(pack));//org.openqa.selenium
		
		Thread.sleep(1000);
		web2.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		
		String t = driver.getTitle();
	
	
		/*WebElement web3 = driver.findElement(By.className("indexContainer"));
	    WebElement web4 = web3.findElement(By.xpath("//html/body/div/ul[1]")); 
		List<WebElement> web5=web4.findElements(By.tagName("li"));
				
		//Total no of interfaces in the package:
		System.out.println("The total no of interfaces" + web5.size());*/
		
		
		

		
	
	}
}