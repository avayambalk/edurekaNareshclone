package com.c2t.testng.annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("beforeTest");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("afterTest");
	}

	@Test
	public void testMethods1() {
		System.out.println("testMethods1");
	}
	
	@Test
	public void testMethods2() {
		System.out.println("testMethods2");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}

}
