package com.c2t.edureka.module12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HeadLessAutoIT {

	@Test
	public void test1() {
		// Creating a new instance of the HTML unit driver

		WebDriver driver = new HtmlUnitDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://jkorpela.fi/forms/file.html");

		WebElement we = driver.findElement(By.name("datafile"));
		System.out.println(we);
		we.click();
		
		try {
			Runtime.getRuntime().exec("D:/nchaurasia/Automation-Architect/AutoIT/FileUpload_Dec2018.exe");
		} catch (Exception e) {
			System.out.println(e);
		}


	}

}
