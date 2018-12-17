package com.c2t.testng.basic;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {
	
	

	@Test
	public void firstName(){
		System.out.println("test1");
		System.out.println("id11="+Thread.currentThread().getId());
	}
	
	@Test
	public void lastName(){
		System.out.println("test2");
		System.out.println("id22="+Thread.currentThread().getId());
	}
	
	
}
