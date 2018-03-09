package com.c2t.testng.groups;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestNGGroups {

	@BeforeGroups("sanity")
	public void beforeMethod() {
		System.out.println("Before test-method.");
	}

	@Test(groups = { "sanity" })
	public void testMethodOne() {
		System.out.println("---------------testMethodOne/sanity---------------");
	}

	@Test
	public void testMethodTwo() {
		System.out.println("---------------testMethodTwo---------------");
	}

	@Test(groups = { "regression" })
	public void testMethodThree() {
		System.out.println("---------------testMethodThree/regression---------------");
	}
}
