package com.c2t.testng.suites.parallel;

import org.testng.annotations.Test;

public class Snapdeal {

	@Test
	public void openBrowser() {
		System.out.println("I am Snapdeal");
		System.out.println("Snapdeal: " + Thread.currentThread().getId());
	}
}