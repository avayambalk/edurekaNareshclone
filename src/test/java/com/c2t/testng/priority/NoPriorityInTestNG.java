package com.c2t.testng.priority;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NoPriorityInTestNG {
	WebDriver driver;

	// Method 1: Open Brower say Firefox
	@Test(priority=-1)
	public void openBrowser() {
	}
	
	// Method 2: Launch Google.com
	@Test(priority=2)
	public void launchGoogle() {
		
	}

	// Method 3: Perform a search using "Facebook"
	@Test(priority=2)
	public void peformSeachAndClick1stLink() {
		
	}

	// Method 4: Verify Google search page title.
	@Test(priority=4)
	public void FaceBookPageTitleVerification() throws Exception {
		throw new Exception();
	}
}