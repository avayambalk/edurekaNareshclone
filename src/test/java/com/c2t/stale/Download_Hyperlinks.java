package com.c2t.stale;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class Download_Hyperlinks {

	WebDriver driver;
	WebElement Tab_2;

	@Test(priority = -1)
	public void call_home_page() {

		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.guru99.com/");

	}
	
	@Test
	public void m1(){
		driver.findElement(By.linkText("Testing")).click();
		driver.findElement(By.xpath("html/body/div[2]/section[2]/div/div/div/div/div/div/div[1]/div[5]/div[1]/div/div[2]/ul/li[1]/a/span")).click();
	}

	@Parameters({ "Tab_Options", "Course_Option" })
	@Test(priority = 2, enabled=false)
	public void Screen_1(String Tab_Options, String Course_Option) {

		WebElement Tab = driver.findElement(By.cssSelector("ul[class='maximenuck']"));
		List<WebElement> ListOfTabs = Tab.findElements(By.tagName("li"));
		System.out.println("Count of tabs : " + ListOfTabs.size());

		Actions action = new Actions(driver);
		int count = 0;
		for (WebElement Tabs_1 : ListOfTabs) {

			if (count == 0) {
				count++;
				continue;
			} else {
				Tab_2 = Tabs_1.findElement(By.tagName("a")).findElement(By.tagName("span"));

				String Tab_Name = Tab_2.getText();

				if (Tab_Name.equalsIgnoreCase(Tab_Options)) {

					action.moveToElement(Tab_2).click().build().perform();

					Select_Testing_Option(Course_Option);
					
					//Trying to handle the Stale Element Exception*********
					
					new WebDriverWait(driver, 5).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[class='titreck']")));
					driver.findElement(By.cssSelector("span[class='titreck']")).click();
					break;
				}

			}
		}
	}

	public void Select_Testing_Option(String Course_Option) {

		Actions action = new Actions(driver);

		List<WebElement> Test_2 = driver.findElements(By.xpath(".//*[@id='maximenuck243']/div[5]/div[1]/div/div"));

		System.out.println("Test_2 Size : " + Test_2.size());

		String TypeOfTesting;

		for (WebElement List_1 : Test_2) {

			List<WebElement> List_2 = List_1.findElements(By.tagName("li"));

			System.out.println("List_2 size : " + List_2.size());
			for (int i = 0; i < List_2.size(); i++) {

				WebElement List_3 = List_2.get(i).findElement(By.cssSelector("span[class='titreck']"));

				TypeOfTesting = List_3.getText();
				System.out.println("Text : " + TypeOfTesting);

				if (TypeOfTesting.equalsIgnoreCase(Course_Option)) {
					action.moveToElement(List_3).click().build().perform();
					break;
				}

			}
		}

	}

}

