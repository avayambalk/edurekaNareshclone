package com.c2t.calculator;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : https://connect2tech.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class TestCalculator2 {
	
	Calculator calci;
	
	@BeforeTest
	public void before(){
		calci = new Calculator();
	}
	
	@Test
	public void addTest(){
		
		int expected = 30;
		int actual = calci.add(10, 20);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void substractTest(){
		
		int expected = -10;
		int actual = calci.substract(10, 20);
		
		assertEquals(actual, expected);
		
	}
}
