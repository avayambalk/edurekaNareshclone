package com.c2t.testng.groups;

import org.testng.annotations.Test;

public class TestNGMultipleGroups2 {
	@Test(groups = { "sanity" })
	public void testMethodOne() {
		System.out.println("com.c2t.testng.groups.TestNGMultipleGroups2.testMethodOne()/sanity");
	}

	@Test(groups = { "sanity", "regression" })
	public void testMethodTwo() {
		System.out.println("com.c2t.testng.groups.TestNGMultipleGroups2.testMethodTwo()/sanity/regression");
	}

	@Test(groups = { "regression" })
	public void testMethodThree() {
		System.out.println("com.c2t.testng.groups.TestNGMultipleGroups2.testMethodThree()/regression");
	}
}
