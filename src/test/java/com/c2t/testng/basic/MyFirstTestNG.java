package com.c2t.testng.basic;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyFirstTestNG {
	
		
	@Test(priority=-1)
	public void bName(){
		System.out.println("hello world..");
	}
	
	@Test(priority=-2)
	public void aName(){
		System.out.println("hello world..");
	}
	
	@Test(priority=1)
	public void cName(){
		throw new RuntimeException();
	}
	
	
}
