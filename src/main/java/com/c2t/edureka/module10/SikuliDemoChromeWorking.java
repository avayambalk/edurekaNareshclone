package com.c2t.edureka.module10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.openqa.selenium.chrome.ChromeDriver;

public class SikuliDemoChromeWorking {

	public static void main(String[] args) throws FindFailed {

		System.setProperty("webdriver.chrome.driver", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/chromedriver.exe");
		WebDriver driver;
		
		Pattern p1 = new Pattern("D:/nchaurasia/Automation-Architect/img/Downarrow.PNG");
		Pattern p2 = new Pattern("D:/nchaurasia/Automation-Architect/img/Img-Save1.PNG");
		
		Screen s = new Screen();
		
		

		// Open Chrome browser
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/resources/FileUpload.html");
		driver.findElement(By.id("fileToUpload")).click();

		
		//s.wait(p1,5);
		//s.type(p2,"hello.txt");
		s.click(p1);
		//s.click(p2);
		
	}

}
