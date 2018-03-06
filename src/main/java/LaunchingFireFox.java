
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class LaunchingFireFox {

	public static WebDriver driver;

	private static String URL = "https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=O_KdWrKFKqX98wfGo6igCw&gws_rd=ssl";

	
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(URL);
	}
	

}
