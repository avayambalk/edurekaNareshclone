package com.c2t.ist830;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCasesUsingTestNg {
	
	@DataProvider
	public String [][] dataMethod(){
		String [][] data = {
				{"a","b"},
				{"c","d"},
				{"e","f"}
		};
		
		return data;
	}
	
	
	@Test(dataProvider="dataMethod")
	public void test1(String c1, String c2){
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
	}
	
	
	
}
