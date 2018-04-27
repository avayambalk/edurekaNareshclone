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
		softAssert.assertEquals(true, false,"Failure1");
		softAssert.assertEquals(true, true,"Failure2");
		
	}
	
}