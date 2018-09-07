package com.c2t.sikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.openqa.selenium.chrome.ChromeDriver;

public class SikuliDemoChromeFnameLname2 {

	public static void main(String[] args) throws FindFailed {

		System.setProperty("webdriver.chrome.driver",
				"D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/chromedriver.exe");
		String path = "D:/nchaurasia/Automation-Architect/img/";
		
		
		
		Screen s = new Screen();
		Pattern first = new Pattern(path + "FirstName1-NoLabel.PNG");
		Pattern last = new Pattern(path + "LastName2-NoLabel.PNG");
		
		
		WebDriver driver;

		// Open Chrome browser
		driver = new ChromeDriver();
		driver.get(
				"file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/test/java/com/c2t/sikuli/LocatingMultipleElements.html");

	/*	s.wait(first, 5);
		s.type(first, "C:\\Users\\naresh\\Desktop\\intern.txt");
		
		s.wait(last, 5);
		s.type(last, "C:\\Users\\naresh\\Desktop\\test.txt");*/

	}

}
