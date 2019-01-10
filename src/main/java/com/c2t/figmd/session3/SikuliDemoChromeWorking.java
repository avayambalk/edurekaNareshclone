package com.c2t.figmd.session3;

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

		Pattern pattern3 = new Pattern("D:/nchaurasia/Automation-Architect/img/DownArrow-08.01.2019.jpg");
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/chromedriver_win32_2.45/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/resources/FileUpload.html");
		driver.findElement(By.id("fileToUpload")).click();
		
		Screen s = new Screen();
		
		s.click(pattern3);

		
		
		
	}

}
