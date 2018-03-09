package com.c2t.testng.assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgAssertions {

	@Test
	public void assert1() {
		String titleOfPage = "one";
		String expected = "one";
		Assert.assertEquals(titleOfPage, expected);
	}
	
	@Test
	public void assert2() {
		String s1 = "one";
		String s2 = "two";
		Assert.assertEquals(s1, s2);
	}

	@Test
	public void assert3() {
		String s1 = "one";
		String s2 = "one";
		Assert.assertEquals(s1, s2,"The values are not equal");
	}

	@Test
	public void assert4() {
		String s1 = "one";
		String s2 = "two";
		Assert.assertEquals(s1, s2,"The values are not equal...");
	}	
}
