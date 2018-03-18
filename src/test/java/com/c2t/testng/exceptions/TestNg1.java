package com.c2t.testng.exceptions;

import org.testng.annotations.Test;

public class TestNg1 {

	@Test(expectedExceptions = ArithmeticException.class)
	public void firstNameAlphabets() {
		int e = 1 / 0;
	}
}
