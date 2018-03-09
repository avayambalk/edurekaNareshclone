package com.c2t.testng.assertions.hard;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion2 {
	String className = "HardAssertion";

	@Test
	public void test_UsingHardAssertion() {
		Assert.assertTrue(true == true);
		Assert.assertEquals("HardAssert", "HardAssertion");
		Assert.assertEquals(className, "HardAssertion");
		System.out.println("Successfully passed!");
	}
}