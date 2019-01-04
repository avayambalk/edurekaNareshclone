package com.c2t.edureka.ist830.module2;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : https://connect2tech.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
	
	public static void main(String[] args) {
		
		String url = "https://www.goindigo.in/?linkNav=home_header";
		String a1 = "Bengaluru"; //"Bengaluru, India"; //"BLR"; //
		String a2 = "Lucknow";
		
		int timeOut = 100;
		int waitFor = 30;
		
		
		System.setProperty("webdriver.chrome.driver", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		// 1. Launch the browser with “https://www.goindigo.in/?linkNav=home_header”
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(timeOut,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(waitFor,TimeUnit.SECONDS) ;
		driver.manage().timeouts().setScriptTimeout(waitFor, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		/* A person wants to check for the one-way flights from Bengaluru to Lucknow for 5
		passengers (3 Adults and 2 children) on Indigo portal for the current date. Automate
		the same using (https://www.goindigo.in/?linkNav=home_header ) portal. The steps
		are as below.*/
		
		// 2. Select “One way” in the option
		// type //*[@id="bookFlightTab"]/form/div[2]/span[1]/label
		driver.findElement(By.xpath("//*[@id='bookFlightTab']/form/div[2]/span[1]/label")).click();
		
		// from: 
		
		// using findElements
		driver.findElement(By.xpath("//*[@id='bookFlightTab']/form/div[3]/div[1]/div[1]/div/div/input")).click();
		List <WebElement> c1 = driver.findElements(By.xpath("/html[1]/body[1]/div[5]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
		for(int i=0; i<c1.size(); i++) {
			WebElement city1 = c1.get(i);
			System.out.println("i" + i + ": " + city1.getText());
			
			if(city1.getText().contains(a1)) {
				WebElement select1 = city1.findElement(By.xpath("preceding-sibling::div[1]"));
				select1.click();
			}
		}
		
		/*// using findElement
		WebElement from = driver.findElement(By.xpath("//*[@id='bookFlightTab']/form/div[3]/div[1]/div[1]/div/div/input"));
		from.click();
		from.sendKeys("Benga");
		from.sendKeys(Keys.DOWN);
		from.sendKeys(Keys.ENTER);
		*/
		
		
		
		
		
		/*// to: 
		
		//*[@id="bookFlightTab"]/form/div[3]/div[1]/div[2]/div/div/input
		driver.findElement(By.xpath("//*[@id='bookFlightTab']/form/div[3]/div[1]/div[2]/div/div/input")).click();
		List<WebElement> c2 = driver.findElements(By.xpath("/html[1]/body[1]/div[5]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
		// List<WebElement> c2 = driver.findElements(By.xpath("//*[@id=\\\"bookFlightTab\\\"]/form/div[3]/div[1]/div[2]/div/div/input"));
		
		for(int j=0; j<c2.size(); j++) {
			WebElement city2 = c2.get(j);
			text = city2.getText();
			System.out.println("j" + j + ": " + city2.getText());

			if(city2.getText().contains(a2)) {
				//city2.isSelected();				
			}else {
				System.out.println("j" + j + ": " + city2.getText());
			}
		}
		//i2.sendKeys("Lucknow");
		*/
		
		/*
		// passengers:  //*[@id="bookFlightTab"]/form/div[5]/div[1]/div[1]/input
		// //input[@placeholder='pax-class']
		driver.findElement(By.xpath("//*[@id='bookFlightTab']/form/div[5]/div[1]/div[1]/input")).click();
		
		// adults: //*[@id="bookFlightTab"]/form/div[5]/div[1]/div[2]/ul/li[1]/div/input
		// //div[@class='passenger-dropdown pax-selection-row']//li[@class='adult-pax-list']//button[@title='Up']
		driver.findElement(By.xpath("//*[@id='bookFlightTab']/form/div[5]/div[1]/div[2]/ul/li[1]/div/input")).sendKeys("3");
		
		// children: //*[@id="bookFlightTab"]/form/div[5]/div[1]/div[2]/ul/li[2]/div/input
		// //div[@class='passenger-dropdown pax-selection-row']//li[@class='child-pax-list']//button[@title='Up']
		driver.findElement(By.xpath("//*[@id='bookFlightTab']/form/div[5]/div[1]/div[2]/ul/li[2]/div/input")).sendKeys("2");
		
		// done: //*[@id="bookFlightTab"]/form/div[5]/div[1]/div[2]/div/button
		// //div[@class='passenger-done-blck']//button[@type='button'][contains(text(),'Done')]
		driver.findElement(By.xpath("//*[@id='bookFlightTab']/form/div[5]/div[1]/div[2]/div/button")).click();
		
		// search: //*[@id="bookFlightTab"]/form/div[7]/div[6]/button/span[1]
		// //div[@class='col-md-5 col-6 padd-right ml-auto']//button[@type='submit']
		driver.findElement(By.xpath("//*[@id='bookFlightTab']/form/div[7]/div[6]/button/span[1]")).click();
		*/
		
		System.out.println("END");
		
		/*// Terminate
		driver.close();
		driver.quit();
		Runtime rt = Runtime.getRuntime();
		try {
			Process proc = rt.exec("taskkill /im chromedriver.exe /f /t");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}

