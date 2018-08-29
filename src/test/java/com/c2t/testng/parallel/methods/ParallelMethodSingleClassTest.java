package com.c2t.testng.parallel.methods;

import org.testng.annotations.Test;

public class ParallelMethodSingleClassTest {

	@Test
	public void testMethodsOne() {
		long id = Thread.currentThread().getId();
		System.out.println("Simple test-method One. Thread id is:............." + id);
	}

	@Test
	public void testMethodsTwo() {
		long id = Thread.currentThread().getId();
		System.out.println("Simple test-method Two. Thread id is:................. " + id);
	}
	
	@Test
	public void testMethodsThree() {
		long id = Thread.currentThread().getId();
		System.out.println("Simple test-method Three. Thread id is:.................... " + id);
	}

	
}