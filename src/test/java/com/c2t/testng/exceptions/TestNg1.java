package com.c2t.testng.exceptions;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNg1 {

	@Test(expectedExceptions = ArithmeticException.class)
	public void firstNameAlphabets() {
		int e = 1 / 0;
	}
	
	@Test
	public void testAddCategories() throws Exception {
		
		int a = 5;
		
	    if (a>0) {
	        throw new SkipException("Using HSQL will fail this test. aborting...");
	    }

	}
}
