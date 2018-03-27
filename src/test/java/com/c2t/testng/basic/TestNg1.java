package com.c2t.testng.basic;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNg1 {

	@Test
	public void firstNameAlphabets(){
		System.out.println("Hello");
	}
	
	@Test
	public void firstNameNumber(){
		int price = 1200;
		Assert.assertEquals("A", "A");
	}

	@Test
	public void test3(){
		System.out.println("Hello");
		//throw new RuntimeException();
	}
}
