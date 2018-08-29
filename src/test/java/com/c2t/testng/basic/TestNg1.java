package com.c2t.testng.basic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNG1 {
	
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("beforeTest");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("beforeMethod");
	}
	
	@Test(priority=1)
	public void firstName(){
		System.out.println("firstName");
		//d.findElement(by)
	}
	
	@Test(priority=-2)
	public void lastName(){
		System.out.println("lastName");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("afterTest");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("afterMethod");
	}
	
}
