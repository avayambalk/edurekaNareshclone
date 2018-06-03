package com.c2t.testng.priority;

import org.testng.annotations.Test;

public class TestNg2 {
	
	@Test(priority=0,enabled=false)
	public void test1() {
		System.out.println("TestNg1");
	}

	@Test(priority=1)
	public void test0() {
		System.out.println("TestNg0");
	}


}
