package com.c2t.ist730;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import org.testng.annotations.*;
import static org.testng.Assert.*;

public class DDT2 {
	
	@DataProvider
	public String [][] data(){
		String [][] arr = {
				{"a","b"},
				{"c","d"},
				{"c2","d2"}
				
		};
		
		return arr;
	}
	
	@Test(dataProvider="data")
	public void test1(String val1, String val2){
		System.out.println("val1="+val1);
		System.out.println("val2="+val2);
	}
	
}
