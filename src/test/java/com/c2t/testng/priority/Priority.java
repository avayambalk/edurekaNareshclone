package com.c2t.testng.priority;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority = 1, enabled = false)
	public void lastName() {
		System.out.println("lastName...");
	}

	@Test(priority = 2)
	public void firstName2() {
		System.out.println("firstName...");
	}
	
	@Test(priority = 2)
	public void firstName1() {
		System.out.println("firstName...");
	}

}
