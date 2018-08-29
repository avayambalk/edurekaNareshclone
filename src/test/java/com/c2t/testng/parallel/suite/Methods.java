package com.c2t.testng.parallel.suite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Methods {

	@Test
	public void testMethodOne1() {
		System.out.println("testMethodOne1");
	}
	
	@Test
	public void testMethodOne2() {
		System.out.println("testMethodOne2");
	}

}