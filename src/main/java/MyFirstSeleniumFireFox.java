import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class MyFirstSeleniumFireFox {

	public static void main(String[] args) {
		
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.google.com/");
		WebElement we = driver.findElement(By.id("lst-ib"));
		we.sendKeys("Hello");
		driver.findElement(By.name("btnK")).click();
		System.out.println(driver.getTitle());
		
	}
}