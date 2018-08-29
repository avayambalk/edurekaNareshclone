package com.c2t.testng.enabled;

import org.testng.annotations.Test;

public class TestNg1 {

	@Test(enabled=false)
	public void test1(){
		System.out.println("Hello");
	}
	
	@Test
	public void test(){
		System.out.println("Hello");
	}
}
