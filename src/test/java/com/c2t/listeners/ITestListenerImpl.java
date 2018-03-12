package com.c2t.listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;

import org.testng.ITestListener;

import org.testng.ITestResult;

public class ITestListenerImpl implements ITestListener {
	
	

	public void onStart(ITestContext arg0) {
		//System.out.println("Start Of Execution(TEST)->" + arg0.getName());
		
	}

	public void onTestStart(ITestResult arg0) {
		//System.out.println("Test Started->" + arg0.getName());
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Test Pass->" + arg0.getName());
		
		/*WebDriver driver = TestUtil.getDriver();
		
		File f = ((TakesScreenshot)driver).getScreenshotAs((OutputType.FILE));
		try {
			FileUtils.copyFile(f, new File("d:/file.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

	public void onTestFailure(ITestResult arg0) {
		//System.out.println("Test Failed->" + arg0.getName());
	}

	public void onTestSkipped(ITestResult arg0) {
		//System.out.println("Test Skipped->" + arg0.getName());
	}

	public void onFinish(ITestContext arg0) {
		//System.out.println("END Of Execution(TEST)->" + arg0.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
	}

}