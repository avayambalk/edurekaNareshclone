package in.connect2tech.drag.n.drop;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DragDropTest {
	
	private WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void testDragDrop() {
		driver.get("http://cookbook.seleniumacademy.com/DragDropDemo.html");
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		Actions builder = new Actions(driver);
		builder.dragAndDrop(source, target).perform();
		assertEquals("Dropped!", target.getText());
		
		/*Actions builder = new Actions(driver);
		builder.clickAndHold(source).moveToElement(target).release(target).build().perform();*/
		
	}
	
	@After
	public void tearDown() {
		//driver.quit();
	}
}