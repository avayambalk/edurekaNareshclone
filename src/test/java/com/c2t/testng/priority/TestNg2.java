package com.c2t.testng.priority;

import org.testng.annotations.Test;

public class TestNg2 {
	
	@Test(priority=0)
	public void test1() {
		System.out.println("TestNg1");
	}

	@Test(priority=2)
	public void test0() {
		System.out.println("TestNg0");
	}
	
	@Test(priority=1,enabled=false)
	public void test3() {
		System.out.println("TestNg0");
	}


}
