package com.c2t.testng.enabled;

import org.testng.annotations.Test;

public class TestNg1 {

	@Test(enabled=true)
	public void test1(){
		System.out.println("Hello");
	}
	
	@Test(invocationCount=4)
	public void test(){
		System.out.println("Hello");
	}
}
