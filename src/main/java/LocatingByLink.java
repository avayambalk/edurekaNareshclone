import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatingByLink {
	
	public static WebDriver driver;
	
	static String url = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/resources/LocatingMultipleElements.html";
	
	public static void main(String str[]){
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		WebDriver.Options options = driver.manage();
		WebDriver.Window window = options.window();
		window.maximize();
		
		//driver.manage().window().maximize();

		driver.get(url);
		
		/*WebElement we = driver.findElement(By.linkText("Click Me"));
		we.click();*/
		
		WebElement we = driver.findElement(By.name("theButton"));
		we.click();
		
		
		
		
		
		
		
		
	}
}
