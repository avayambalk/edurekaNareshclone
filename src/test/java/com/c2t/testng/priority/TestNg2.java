package com.c2t.testng.priority;

import org.testng.annotations.Test;

public class TestNg2 {
	
	@Test(priority=0)
	public void enterTextInFirstName() {
		System.out.println("TestNg2");
	}

	@Test(priority=-1,enabled=false)
	public void daunchBrowser() {
		System.out.println("TestNg1");
	}


}
