package com.c2t.listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyTCListener2.class)
public class MyTC2 {
	
	@Test
	public void test1(){
		System.out.println("MyTc..");
	}
	
	@Test()
	public void test2(){
		throw new RuntimeException();
	}

}
