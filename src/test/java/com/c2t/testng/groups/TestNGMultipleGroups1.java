package com.c2t.testng.groups;

import org.testng.annotations.Test;

public class TestNGMultipleGroups1 {
	@Test(groups = { "sanity" })
	public void testMethodOne() {
		System.out.println("com.c2t.testng.groups.TestNGMultipleGroups1.testMethodOne()/sanity");
	}

	@Test(groups = { "sanity", "regression" })
	public void testMethodTwo() {
		System.out.println("com.c2t.testng.groups.TestNGMultipleGroups1.testMethodTwo()/sanity/regression");
	}

	@Test(groups = { "regression" })
	public void testMethodThree() {
		System.out.println("com.c2t.testng.groups.TestNGMultipleGroups1.testMethodThree()/regression");
	}
	
	/*@Test(groups = {"g1","g2"})
	public void testMethodFour() {
		System.out.println("com.c2t.testng.groups.TestNGMultipleGroups1.testMethodFour()/regression");
	}*/
}
