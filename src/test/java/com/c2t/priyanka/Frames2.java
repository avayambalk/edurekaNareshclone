package com.c2t.priyanka;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

import org.testng.annotations.*;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames2 {
	private WebDriver driver;
	private Scanner s;

	@BeforeTest
	public void OpenConnect2Tech() {
		System.setProperty("webdriver.chrome.driver", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/connect2tech.in-Selenium-Automation-Java-1.x/");
	}

	@Test(enabled=true)
	public void Fra() throws InterruptedException {


		String parent = driver.getWindowHandle();
		WebElement felem = driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[1]/td[2]/button"));//locating frames
		felem.click();
				
		Set<String> windows = driver.getWindowHandles();

		Iterator<String> iter = windows.iterator();

		while (iter.hasNext()) {
			String window = iter.next();
			if (!window.equals(parent)) {
				driver.switchTo().window(window);
				String title = driver.getTitle();
				System.out.println(title);
				
				List <WebElement> list = driver.findElements(By.tagName("frameset"));
				System.out.println(list);
				
				WebElement we = list.get(1).findElement(By.tagName("frame"));
				String frameName = we.getAttribute("name");
				System.out.println(frameName);
				driver.switchTo().frame(we);
				
				/*
				
				String fTitle = driver.getTitle();
				System.out.println(fTitle);*/
						
			}
		}
	
		/*WebElement web1 = driver.findElement(By.tagName("ul"));// finding the
																// parent tag
		List<WebElement> total = web1.findElements(By.tagName("li"));// finding
																		// the
																		// tags
																		// of
																		// the
																		// packages
		System.out.println("The total no of packagaes : " + total.size());// get
																			// the
																			// total
																			// no
																			// of
																			// elements
																			// in
																			// the
																			// tag
*/	}

	@Test(enabled=false)
	public void Inter() throws InterruptedException {
		s = new Scanner(System.in);
		System.out.println("Enter the package to click on and check the classes , interfaces and exceptions: ");
		String pack = s.nextLine();
		WebElement web2 = driver.findElement(By.linkText(pack));// org.openqa.selenium
		Thread.sleep(4000);
		web2.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");

		WebElement web3 = driver.findElement(By.className("indexContainer"));
		WebElement web4 = web3.findElement(By.xpath("//html/body/div/ul[1]"));
		List<WebElement> web5 = web4.findElements(By.tagName("li"));

		// Total no of interfaces in the package:
		System.out.println("The total no of interfaces" + web5.size());

	}
}
