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

public class JSExecutor {

	public WebDriver driver;
	public String Url = "http://www.ebay.com";

	@BeforeTest
	public void setDriver() {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(Url);
	}

	@Test
	public void scrollPage() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("window.scrollBy(0,1000)");
	}

	@AfterTest
	public void atEnd() {
		//driver.quit();
	}
}
