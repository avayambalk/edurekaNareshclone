package com.c2t.testng.basic;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNg2 {
	
	@Test
	public void firstName(){
		System.out.println("firstName");
		System.out.println("id1="+Thread.currentThread().getId());
	}
	
	@Test
	public void middleName(){
		System.out.println("middleName");
		System.out.println("id2="+Thread.currentThread().getId());
	}
	
	@Test
	public void lastName(){
		System.out.println("lastName");
		System.out.println("id3="+Thread.currentThread().getId());
	}
}
