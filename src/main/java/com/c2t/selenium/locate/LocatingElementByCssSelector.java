package com.c2t.selenium.locate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.c2t.util.SeleniumUtil;

public class LocatingElementByCssSelector {

	static WebDriver driver;

	static void launchBrowser() {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		
		WebDriver.Options opt = driver.manage();
		WebDriver.Window win = opt.window();
		win.maximize();
		
		//driver.manage().window().maximize();
		//String resourceDir = SeleniumUtil.getRootDir() + "LocatingMultipleElements.html";
		String resourceDir = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/resources/LocatingMultipleElements.html";
		driver.get(resourceDir);
	}

	public static void main(String[] args) {
		launchBrowser();
		
		
//		findByCssSelector1();
//		findByCssSelector2();
//		findByCssSelector3();
//		findByCssSelector4();
//		findByCssSelector5();
//		findByCssSelector6();
//		findByCssSelector7();
//		closeBrowser();
		
		
		//findByCssSelector8();
	}
	
	static void findByCssSelector8() {
		WebElement we = driver.findElement(By.cssSelector("input#fname"));
		boolean bool = we.isEnabled();
		System.out.println(bool);
		
		String textInTextbox = we.getAttribute("value");
		System.out.println("textInTextbox = "+textInTextbox);
		
	}
	
	
	static void findByCssSelector7() {
		WebElement we = driver.findElement(By.cssSelector("input[type='hidden'][name='country']"));
		String value = we.getAttribute("value");
		System.out.println(value);
	}
	
	
	static void findByCssSelector6() {
		WebElement we = driver.findElement(By.cssSelector(".w3-input"));
		//System.out.println("we = "+we);
		we.clear();
		we.sendKeys("Himaja");
	}
	
	static void findByCssSelector5() {
		WebElement we = driver.findElement(By.cssSelector("input[name]"));
		System.out.println("we = "+we);
	}

	static void findByCssSelector1() {
		WebElement we = driver.findElement(By.cssSelector("input#fname"));
		
		driver.findElement(By.id("fname"));
		
		System.out.println("we = "+we);
	}
	
	static void findByCssSelector3() {
		
		WebElement we = driver.findElement(By.cssSelector("html body form fieldset div input"));
		we.sendKeys("vijay joshi");
		//WebElement we = driver.findElement(By.cssSelector("html body form fieldset div input"));
		//System.out.println("we = "+we);
	}
	
	static void findByCssSelector4() {
		WebElement we = driver.findElement(By.cssSelector("html > body > form > fieldset > div > input"));
		System.out.println("we = "+we);
	}
	
	static void findByCssSelector2() {
		WebElement we = driver.findElement(By.cssSelector(".w3-input"));
		System.out.println("we = "+we);
		we.clear();
		we.sendKeys("Bell the mouse");
	}
	
	static void closeBrowser() {
		//driver.close();
	}


	
}
