package com.c2t.testng.basic;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG4 {
	

	
	
	@Test
	public void test2(){
		System.out.println("test2");
		System.out.println("TestNG4/test2="+Thread.currentThread().getId());
	}
	
	@Test
	public void test1(){
		System.out.println("test1");
		System.out.println("TestNG4/test1="+Thread.currentThread().getId());
	}

}
