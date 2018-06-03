package com.c2t.testng.basic;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyFirstTestNG {
	
	@BeforeMethod
	public void beforeTest1(){
		System.out.println("Before Test1...");
	}
	
	
	@Test
	public void test1(){
		System.out.println("hello...");
	}
	
	@Test
	public void test2(){
		int a = 5/0;
	}
	
}
