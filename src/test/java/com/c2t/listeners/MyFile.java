package com.c2t.listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyFileListener.class)
public class MyFile {
	@Test
	public void myTest(){
		System.out.println("Helll.");
	}
	
	@Test
	public void myTest2(){
		Assert.assertEquals(true, true);
	}
}
