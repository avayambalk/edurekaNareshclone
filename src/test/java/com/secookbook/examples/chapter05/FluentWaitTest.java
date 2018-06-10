package com.secookbook.examples.chapter05;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

public class FluentWaitTest {

	@Test
	public void testFluentWait() {

		/*
		 * Function<String, Integer> lengthFunction = new Function<String,
		 * Integer>() { public Integer apply(String string) { return
		 * string.length(); } };
		 */

		WebDriver driver = new ChromeDriver();
		// Launch the sample Ajax application
		driver.get("http://cookbook.seleniumacademy.com/AjaxDemo.html");

		try {
			driver.findElement(By.linkText("Page 4")).click();

			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS)
					.pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

			// https://google.github.io/guava/releases/20.0/api/docs/com/google/common/base/Function.html
			// apply(F input) Returns the result of applying this function to
			// input.
			WebElement message = wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver d) {
					WebElement we = d.findElement(By.id("pageContent"));
					return we;
				}
			});

			assertTrue(message.getText().contains("Nunc nibh tortor"));
		} finally {
			driver.quit();
		}
	}

}
