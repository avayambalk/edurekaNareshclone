package com.c2t.testng.parameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	/**
	 * Following method takes one parameter as input. Value of the said
	 * parameter is defined at suite level.
	 */

	@Parameters({"package_name","class_name"})
	@Test
	public void prameterTestOne(String param1, String param2) {
		System.out.println("Test one suite param1 is: " + param1);
		System.out.println("Test one suite param2 is: " + param2);
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