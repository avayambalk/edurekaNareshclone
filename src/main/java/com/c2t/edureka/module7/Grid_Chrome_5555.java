package com.c2t.edureka.module7;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class Grid_Chrome_5555 {

	WebDriver driver;
	String url = "https://www.facebook.com/";
	String nodeUrl = "http://localhost:5555/wd/hub";
	
	@BeforeTest
	public void setUp() throws MalformedURLException{
		
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.WIN10);
		
		URL netUrl = new URL(nodeUrl);
		
		driver = new RemoteWebDriver(netUrl, capability);
		
		driver.get(url);
	}
	
	
	@Test
	public void test1(){
		
	}
	
}
