package com.c2t.testng.groups;

import org.testng.annotations.Test;

public class TestNGIncludeExcludeGroups2 {
	@Test()
	public void testMethodOne() {
		System.out.println("-----------testMethodOne------------------");
	}

	@Test
	public void testMethodTwo() {
		System.out.println("-----------testMethodTwo------------------");
	}

	@Test
	public void testMethodThree() {
		System.out.println("-----------testMethodThree------------------");
	}
	
}
