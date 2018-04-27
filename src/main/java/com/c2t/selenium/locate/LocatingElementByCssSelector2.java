package com.c2t.selenium.locate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.c2t.util.SeleniumUtil;

public class LocatingElementByCssSelector2 {

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
		
		//findByCssSelector_absolute();	
		//findByCssSelector_Tag_Class();
		//findByCssSelector_Class();
		//findByCssSelector_Tag_Id();
		//findByCssSelector_Attribute();
//		findByCssSelector1();
//		findByCssSelector2();

//		findByCssSelector4();
//		findByCssSelector5();
//		findByCssSelector6();
//		findByCssSelector7();
//		closeBrowser();
		
		
//		findByCssSelector8();
	}
	
	static void findByCssSelector8() {
		WebElement we = driver.findElement(By.cssSelector("input#fname"));
		boolean bool = we.isEnabled();
		System.out.println(bool);
		
		String textInTextbox = we.getAttribute("value");
		System.out.println("textInTextbox = "+textInTextbox);
		
	}
	
	
	static void findByCssSelector_Attribute() {
		WebElement we = driver.findElement(By.cssSelector("input[name='firstname']"));
		we.sendKeys("I am first name...");
	}
	
	static void findByCssSelector_Attributes() {
		WebElement we = driver.findElement(By.cssSelector("input[type='hidden'][name='country']"));
		String value = we.getAttribute("value");
		System.out.println(value);
	}
	
	
	static void findByCssSelector_Class() {
		WebElement we = driver.findElement(By.cssSelector(".w3-input"));
		//System.out.println("we = "+we);
		we.clear();
		we.sendKeys("Himaja");
	}
	
	static void findByCssSelector5() {
		WebElement we = driver.findElement(By.cssSelector("input[name]"));
		System.out.println("we = "+we);
	}

	static void findByCssSelector_Tag_Id() {
		WebElement we = driver.findElement(By.cssSelector("input#lname"));
		
		String str = we.getAttribute("value");
		
		System.out.println("str = "+str);
	}
	
	static void findByCssSelector_absolute() {
		
		WebElement we = driver.findElement(By.cssSelector("html>body>form>fieldset>div>button"));
		we.click();
	}
	
	static void findByCssSelector4() {
		WebElement we = driver.findElement(By.cssSelector("html > body > form > fieldset > div"));
		System.out.println("we = "+we);
	}
	
	static void findByCssSelector_Tag_Class() {
		WebElement we = driver.findElement(By.cssSelector("input.w3-input"));
		System.out.println("we = "+we);
		we.clear();
		we.sendKeys("Bell the mouse");
	}
	
	static void closeBrowser() {
		//driver.close();
	}


	
}
