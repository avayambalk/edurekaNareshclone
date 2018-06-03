package com.c2t.testng.basic;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNg1 {

	@Test
	public void testCase1(){
		System.out.println("Hello");
	}
	
	@Test(priority=1)
	public void testCase2(){
	}

	@Test(priority=1)
	public void testCase3(){
		throw new RuntimeException();
	}
	
	
}
