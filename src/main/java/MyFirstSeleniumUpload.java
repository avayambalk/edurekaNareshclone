import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSeleniumUpload {
	
	public static WebDriver driver;
	
	static String url = "file:///D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/src/main/resources/LocatingMultipleElements.html";
	
	public static void main(String str[]){
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		
		//System.setProperty("webdriver.chrome.driver", "");
		
		driver = new FirefoxDriver();
		
		//driver.manage().window().maximize();

		driver.get(url);
		
		/*WebElement var = driver.findElement(By.className("w3-input"));
		var.clear();
		var.sendKeys("Praveen.");*/
		
		driver.findElement(By.partialLinkText("Partial")).click();
		
		//Partial Link Test
		
		
		/*driver.navigate().refresh();
		
		String url = driver.getCurrentUrl();
		System.out.println("url = "+url);
		
		String title = driver.getTitle();
		System.out.println("title = "+title);*/
		
		/*WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys("Mridhula");*/
		
		/*List<WebElement> list = 	driver.findElements(By.name("firstname"));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++){
			WebElement we = list.get(i);
			
			we.sendKeys("Pratima"  + i);
		}*/
		
		/*WebElement var = driver.findElement(By.className("w3-input"));
		var.clear();
		var.sendKeys("Praveen.");*/
		
		
		
		
	}
}
