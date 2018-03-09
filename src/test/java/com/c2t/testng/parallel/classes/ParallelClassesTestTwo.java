package com.c2t.testng.parallel.classes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParallelClassesTestTwo {
	
	/*@BeforeClass
	public void beforeClass() {
		long id = Thread.currentThread().getId();
		System.out.println("before ParallelClassesTestTwo:............... " + id);
	}
	
	@AfterClass
	public void afterClass() {
		long id = Thread.currentThread().getId();
		System.out.println("after ParallelClassesTestTwo:..............." + id);
	}*/

	@Test
	public void testMethodTwo1() {
		long id = Thread.currentThread().getId();
		System.out.println(" ParallelClassesTestTwo testMethodTwo1:................" + id);
	}

	@Test
	public void testMethodTwo2() {
		long id = Thread.currentThread().getId();
		System.out.println("ParallelClassesTestTwo testMethodTwo2:................" + id);
	}
	
}