package com.c2t.testng.suites.parallel;

import org.testng.annotations.Test;

public class Flipkart {

	@Test
	public void openBrowser() {
		System.out.println("I am flipkart");
		System.out.println("Flipkart: " + Thread.currentThread().getId());
	}
}