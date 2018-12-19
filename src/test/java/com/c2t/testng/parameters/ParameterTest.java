package com.c2t.testng.parameters;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	/**
	 * Following method takes one parameter as input. Value of the said
	 * parameter is defined at suite level.
	 */
	
	@Parameters({"browser"})
	@BeforeClass
	public void before(String param1) {
		System.out.println("before:" + param1);
		if(param1.equals("FF")){
			System.out.println("Create FF");
		}else{
			System.out.println("Chrome");
		}
	}


	@Test
	public void prameterTestOne() {
	}

	/**
	 * Following method takes one parameter as input. Value of the said
	 * parameter is defined at test level.
	 */
	/*@Parameters({ "param1" })
	@Test
	public void prameterTestTwo(String param) {
		System.out.println("Thread.currentThread().getId():: " + Thread.currentThread().getId());
		System.out.println("Test two param is: " + param);
	}*/

	/**
	 * Following method takes two parameters as input. Value of the test
	 * parameter is defined at test level. The suite level parameter is
	 * overridden at the test level.
	 */
	/*@Parameters({ "suite-param", "test-three-param" })
	@Test
	public void prameterTestThree(String param, String paramTwo) {
		System.out.println("Test three suite param is: " + param);
		System.out.println("Test three param is: " + paramTwo);
	}*/
}