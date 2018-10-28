package in.connect2tech.js;

import java.util.concurrent.TimeUnit;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JSExecutor2 {

	WebDriver driver;
	String url = "http://www.ebay.com";
	
	
	@BeforeTest
	public void openURL(){
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);
	}
	
	@Test(enabled = false)
	public void testOpenAlert(){
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		
		js.executeScript("alert('welcome to java selenium')");
	}
	
	@Test
	public void testScrollDown(){
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
	}
	
}
