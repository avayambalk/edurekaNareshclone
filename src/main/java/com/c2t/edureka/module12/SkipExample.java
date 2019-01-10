package com.c2t.edureka.module12;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : https://connect2tech.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipExample {

	@Test(enabled = false)
	public void testCaseEnabling() {
		System.out.println("I'm Not Ready, please don't execute me");
	}

	@Test
	public void testCaseSkipException() {
		System.out.println("Im in skip exception");
		throw new SkipException("Skipping this exception");
	}

	@Test
	public void testCaseConditionalSkipException() {
		System.out.println("Im in Conditional Skip");
		if (10 != 20)
			throw new SkipException("Skipping this exception");
		System.out.println("Executed Successfully");
	}

}
