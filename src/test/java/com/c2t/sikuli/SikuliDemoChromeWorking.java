package com.c2t.sikuli;

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
		String path = "D:/nchaurasia/Automation-Architect/img/";
		Screen s = new Screen();
		Pattern fileInputTextBox = new Pattern(path + "Img-Text1.PNG");
		Pattern openButton = new Pattern(path + "Img-Save1.PNG");
		WebDriver driver;

		// Open Chrome browser
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/resources/FileUpload.html");
		driver.findElement(By.id("fileToUpload")).click();

		s.wait(fileInputTextBox,5);
		s.type(fileInputTextBox,"C:\\Users\\naresh\\Desktop\\intern.txt");
		s.click(openButton);
		
	}

}
