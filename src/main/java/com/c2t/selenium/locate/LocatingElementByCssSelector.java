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
		driver.manage().window().maximize();
		String resourceDir = SeleniumUtil.getRootDir() + "LocatingMultipleElements.html";
		driver.get(resourceDir);
	}

	public static void main(String[] args) {
		launchBrowser();
		
//		findByCssSelector1();
//		findByCssSelector2();
//		findByCssSelector3();
//		findByCssSelector4();
		findByCssSelector5();
		closeBrowser();
	}
	
	static void findByCssSelector5() {
		WebElement we = driver.findElement(By.cssSelector("input[name='firstname']"));
		System.out.println("we = "+we);
	}

	static void findByCssSelector1() {
		WebElement we = driver.findElement(By.cssSelector("input#fname"));
		System.out.println("we = "+we);
	}
	
	static void findByCssSelector3() {
		WebElement we = driver.findElement(By.cssSelector("html body form fieldset div input"));
		System.out.println("we = "+we);
	}
	
	static void findByCssSelector4() {
		WebElement we = driver.findElement(By.cssSelector("html > body > form > fieldset > div > input"));
		System.out.println("we = "+we);
	}
	
	static void findByCssSelector2() {
		WebElement we = driver.findElement(By.cssSelector("input.w3-input"));
		System.out.println("we = "+we);
	}
	
	static void closeBrowser() {
		driver.close();
	}


	
}
