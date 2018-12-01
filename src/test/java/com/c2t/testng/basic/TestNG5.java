package com.c2t.testng.basic;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG5 {
	
	/*@BeforeTest
	public void before1(){
		System.out.println("Before1...");
	}
	
	@BeforeTest
	public void before2(){
		System.out.println("Before2...");
	}*/
	
	
	/*@BeforeMethod
	public void beforeMethod(){
		System.out.println("beforeMethod...");
	}*/
	
	
	@Test(priority=1,enabled=false)
	public void test2(){
		System.out.println("test2");
	}
	
	@Test(priority=2)
	public void test1(){
		System.out.println("test1");
	}
	
	
	
	/*@AfterTest
	public void after(){
		System.out.println("after...");
	}*/
}
