package com.c2t.testng.parallel.methods;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelMethodSingleClassTest {
	
	
	/*@BeforeMethod
	public void beforeMethod() {
		long id = Thread.currentThread().getId();
		System.out.println("BeforeMethod. Thread id is:............. " + id);
	}
	
	@AfterMethod
	public void afterMethod() {
		long id = Thread.currentThread().getId();
		System.out.println("AfterMethod. Thread id is:......................" + id);
	}
	
	@BeforeTest
	public void beforeTest() {
		long id = Thread.currentThread().getId();
		System.out.println("BeforeTest. Thread id is:............. " + id);
	}
	
	@AfterTest
	public void afterTest() {
		long id = Thread.currentThread().getId();
		System.out.println("AfterTest. Thread id is:......................" + id);
	}*/
	

	@Test
	public void testMethodsOne() {
		long id = Thread.currentThread().getId();
		System.out.println("Simple test-method One. Thread id is:............." + id);
	}

	@Test
	public void testMethodsTwo() {
		long id = Thread.currentThread().getId();
		System.out.println("Simple test-method Two. Thread id is:................. " + id);
	}
	
	/*@Test
	public void testMethodsThree() {
		long id = Thread.currentThread().getId();
		System.out.println("Simple test-method Three. Thread id is:.................... " + id);
	}*/

	
}