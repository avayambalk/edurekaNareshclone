package com.c2t.edureka.module11;

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
		
		Pattern pattern1 = new Pattern("D:/nchaurasia/Automation-Architect/img/Img-Text1.PNG");
		Pattern pattern2 = new Pattern("D:/nchaurasia/Automation-Architect/img/Img-Save1.PNG");
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/resources/FileUpload.html");
		driver.findElement(By.id("fileToUpload")).click();
		
		Screen s = new Screen();
		
		s.wait(pattern1,5);
		s.type(pattern1,"hello.txt");
		s.click(pattern2);

		
		
		
	}

}
