package com.c2t.corejava;


class UIOperation{
	
	WebDriver driver;
	
	public void setDeriver(WebDriver driver1){
		driver = driver1;
	}
	
	
	void display(){
		System.out.println("i am display..");
	}
}


class WebDriver{
	
	String name;
	
}

public class TestCase {
	public static void main(String[] args) {
		
		WebDriver driver = new WebDriver();
		driver.name = "ff";
		
		UIOperation operation = new UIOperation();
		operation.setDeriver(driver);
		
		
	}
}
