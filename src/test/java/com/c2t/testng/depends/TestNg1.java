package com.c2t.testng.depends;

import org.testng.annotations.Test;

public class TestNg1 {

	@Test
	public void test1(){
		System.out.println("test1");
	}
	
	@Test(dependsOnMethods="test1")
	public void test2(){
		System.out.println("test2");
	}
	
}
