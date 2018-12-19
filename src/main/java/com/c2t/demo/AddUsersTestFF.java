package com.c2t.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddUsersTestFF {

	WebDriver driver;
	String baseUrl;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "http://localhost:8888/connect2tech.in-Selenium-Automation-Java-1.x/users/add";
		
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

	@Test
	public void testMethods1() {
		for (int i = 0; i < 10; i++) {
			driver.get(baseUrl);
			Add_New_User();
		}
	}

	public void Add_New_User() {

		// set name
		WebElement name = name();
		name.clear();
		name.sendKeys("Shraddha - FF");

		// set email
		WebElement email = email();
		email.clear();
		email.sendKeys("shraddha.panchal@gmail.com");

		// set password
		WebElement password = password();
		password.clear();
		password.sendKeys("abcd1234");

		// set confirm password
		WebElement confirmPassword = confirmPassword();
		confirmPassword.clear();
		confirmPassword.sendKeys("abcd1234");

		// set address
		WebElement address = address();
		address.clear();
		address.sendKeys("Vishal Nagar");

		// check Newsletter
		WebElement newsletter = newsletter();
		if (!newsletter.isSelected())
			newsletter.click();

		// set all Web Frameworks
		SetWebFrameworks("Spring MVC", false);
		SetWebFrameworks("GWT", false);
		SetWebFrameworks("Struts 2", true);
		SetWebFrameworks("Play", true);

		// set Sex
		SetSex("F", true);

		// set number
		SetNumber("3", true);

		// select none in country drop down
		SelectCountry("US");

		// deselect all the Java Skill Set
		DeselectAllJavaSkills();

		// Set skills
		String[] javaskills = { "Struts", "Hibernate", "Spring" };
		SetJavaSkills(javaskills);

		// click Add button
		Click_AddButton();

	}

	// elements on screen2
	public WebElement name() {
		return driver.findElement(By.id("name"));
	}

	public WebElement email() {
		return driver.findElement(By.id("email"));
	}

	public WebElement password() {
		return driver.findElement(By.name("password"));
	}

	public WebElement confirmPassword() {
		return driver.findElement(By.name("confirmPassword"));
	}

	public WebElement address() {
		return driver.findElement(By.id("address"));
	}

	public WebElement newsletter() {
		return driver.findElement(By.id("newsletter"));
	}

	public void SetWebFrameworks(String value, boolean toCheck) {
		List<WebElement> elements = driver.findElements(By.name("framework"));
		for (WebElement webElement : elements) {
			if (webElement.getAttribute("value").equalsIgnoreCase(value)) {
				if (toCheck != webElement.isSelected()) {
					webElement.click();
				}
			}
		}
	}

	public void SetSex(String value, boolean toCheck) {
		List<WebElement> elements = driver.findElements(By.name("sex"));
		for (WebElement webElement : elements) {
			if (webElement.getAttribute("value").equalsIgnoreCase(value)) {
				if (toCheck != webElement.isSelected()) {
					webElement.click();
				}
			}
		}
	}

	public void SetNumber(String value, boolean toCheck) {
		List<WebElement> elements = driver.findElements(By.name("number"));
		for (WebElement webElement : elements) {
			if (webElement.getAttribute("value").equalsIgnoreCase(value)) {
				if (toCheck != webElement.isSelected()) {
					webElement.click();
				}
			}
		}
	}

	void SelectCountry(String value) {
		WebElement country = driver.findElement(By.id("country"));
		Select drpValue = new Select(country);
		drpValue.selectByValue(value);
	}

	public void SetJavaSkills(String multipleVals[]) {
		Actions action = new Actions(driver);
		Select javaSkills = new Select(driver.findElement(By.id("skill")));
		javaSkills.deselectAll();
		for (String valueToBeSelected : multipleVals) {
			javaSkills.selectByVisibleText(valueToBeSelected);
			action.sendKeys(Keys.CONTROL);
		}
	}

	public void DeselectAllJavaSkills() {
		Actions action = new Actions(driver);
		Select javaSkills = new Select(driver.findElement(By.id("skill")));
		javaSkills.deselectAll();
	}

	public void Click_AddButton() {
		WebElement addButton = driver.findElement(By.cssSelector("button[type='submit']"));
		addButton.click();

	}

}
