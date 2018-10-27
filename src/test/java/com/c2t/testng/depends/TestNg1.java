package com.c2t.testng.depends;

import org.testng.annotations.Test;

public class TestNg1 {

	@Test(dependsOnMethods="test2")
	public void test1(){
		System.out.println("test1");
	}
	
	@Test
	public void test2(){
		System.out.println("test2");
	}
	
	@Test
	public void test3(){
		System.out.println("test3");
	}
	
}
