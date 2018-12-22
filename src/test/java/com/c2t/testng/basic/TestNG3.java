package com.c2t.testng.basic;

import javax.management.RuntimeErrorException;

import org.testng.annotations.Test;

public class TestNG3 {
	
	
	@Test
	public void test2(){
		System.out.println("test2");
		System.out.println("TestNG3/test2="+Thread.currentThread().getId());
	}
	
	@Test
	public void test1(){
		System.out.println("test1");
		System.out.println("TestNG3/test1="+Thread.currentThread().getId());
		throw new RuntimeException();
	}
	
	
	
}
