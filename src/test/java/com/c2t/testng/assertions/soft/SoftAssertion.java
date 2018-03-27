package com.c2t.testng.assertions.soft;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	SoftAssert softAssert = new SoftAssert();
	String className = "SoftAssertion";
	
	
	@Test
	public void test1(){
		
		softAssert.assertEquals(true, true);
		softAssert.assertEquals(true, false);
		softAssert.assertEquals(true, true);
		System.out.println("Hello...");
		softAssert.assertAll();
		
	}
	
	@Test
	public void test2(){
		
		softAssert.assertEquals(true, true);
		softAssert.assertEquals(true, false);
		softAssert.assertEquals(true, true);
		System.out.println("Hello Soft...");
		softAssert.assertAll();
		
		Assert.assertEquals(true, true);
		Assert.assertEquals(true, false);
		Assert.assertEquals(true, true);
		System.out.println("Hello Hard...");
		softAssert.assertAll();
		
	}

	/*@Test
	public void test_UsingSoftAssertion() {
		softAssert.assertTrue(true == true);
		softAssert.assertEquals("SoftAssert", "SoftAssertion", "Not Equal!!!");
		softAssert.assertEquals(className, "SoftAssertion");
		System.out.println("Last statement gets executed!");
		softAssert.assertAll();
	}*/
}