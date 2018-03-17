package in.connect2tech.pom;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FBLoginTest {
	
	WebDriver driver;
	MyPOM pom;
	

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		pom = new MyPOM(driver);
	}
	
	@Test
	public void loginTest(){
		pom.login("message4naresh@gmail.com", "password");
		
		
	}

}
