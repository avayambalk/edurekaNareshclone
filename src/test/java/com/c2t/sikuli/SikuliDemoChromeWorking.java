package com.c2t.sikuli;

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
		Pattern fileInputTextBox = new Pattern(path + "img1.PNG");
		Pattern openButton = new Pattern(path + "img2.PNG");
		WebDriver driver;

		// Open Chrome browser
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/image_upload/index.php");
		driver.findElement(By.xpath(".//*[@id='photoimg']")).click();

		s.wait(fileInputTextBox,5);
		//s.type(fileInputTextBox,"C:\\Users\\naresh\\Pictures\\Youtube\\c2t home page-python.PNG");
		s.type(fileInputTextBox,"C:\\Users\\naresh\\Desktop\\intern.txt");
		//C:\Users\naresh\Desktop
		s.click(openButton);
		
	}

}
