package com.c2t.testng.groups;

import org.testng.annotations.Test;

public class TestNGIncludeExcludeGroups {
	@Test
	public void testMethodOne() {
		System.out.println("-----------testMethodOne------------------");
	}

	@Test(groups={"sanity","regression"})
	public void testMethodTwo() {
		System.out.println("-----------testMethodTwo------------------");
	}

	@Test(groups={"sanity"})
	public void testMethodThree() {
		System.out.println("-----------testMethodThree------------------");
	}
	
}
