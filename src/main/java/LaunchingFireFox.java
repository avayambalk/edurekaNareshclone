
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LaunchingFireFox {

	public static WebDriver driver;

	private static String URL = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/java/com/c2t/selenium/locate/LocatingMultipleElements.html";

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(URL);

		WebElement we1 = driver.findElement(By.id("fname"));
		we1.sendKeys("Hello Selenium");
	
	}
	

}
