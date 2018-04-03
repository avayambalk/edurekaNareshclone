
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExecuteDownloadTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void initialSetup() {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.last.fm/music/+free-music-downloads");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@Test
	public void testlaunch() {
		WebElement heading = driver.findElement(By.xpath(".//*[@id='mantle_skin']/div[4]/div/div[2]/h2"));
		Assert.assertEquals(heading.getText(), "What Music Can I Download for Free?");
		
		WebElement clickDownload = driver.findElement(By.xpath(".//*[@id='freedownloads-section']/table/tbody/tr[1]/td[3]/a"));
		clickDownload.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("I am before screen");
		Screen screen = new Screen();
		System.out.println("I am on screen");
		
		Pattern save = new Pattern("C:\\images\\saveradio.PNG");
		Pattern open = new Pattern("C:\\images\\open.PNG");
		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("After the sleep");
//		try {
//			screen.click(pattern);
//		} catch (FindFailed e1) {
//			e1.printStackTrace();
//		}
		
		try {
			screen.wait(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			screen.click(save);
		} catch (FindFailed e) {
			e.printStackTrace();
		}
		try {
			screen.click(open);
		} catch (FindFailed e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
	
	}

}

