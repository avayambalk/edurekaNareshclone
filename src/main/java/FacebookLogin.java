import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogin {

	public static WebDriver driver;

	static String url = "https://www.facebook.com/";

	public static void main(String str[]) {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");

		driver = new FirefoxDriver();
		driver.get(url);

		/*
		 * WebDriver.Options options = driver.manage(); WebDriver.Window window
		 * = options.window(); window.maximize();
		 */

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement we1 = driver.findElement(By.id("email"));
		we1.sendKeys("message4naresh@gmail.com");

		WebElement we2 = driver.findElement(By.id("pass"));
		we2.sendKeys("abcdef");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement submit = driver.findElement(By.cssSelector("input[data-testid='royal_login_button']"));
		submit.click();
		// System.out.println(submit);

	}
}
