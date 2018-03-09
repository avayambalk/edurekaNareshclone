package com.c2t.testng;

import org.testng.annotations.Test;

public class TestCasesUsingTestNg {
	
	@Test
	public void test1(){
		System.out.println("My First Test case...");
	}
	
	@Test
	public void test2(){
		System.out.println("My First Test case...");
		throw new RuntimeException();
	}
	
}
