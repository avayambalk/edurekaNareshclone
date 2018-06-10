
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSeleniumProgramFF {
	
	public static WebDriver driver;
	
	public static void main(String str[]){
		System.setProperty("webdriver.firefox.marionette", "D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/geckodriver.exe");
		
		
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
	}
}
