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
		
		String name = arg0.getName();
		System.out.println("name->" + name);
		
		String fileName = "d:/pass_" + name + ".jpg";
		
		System.out.println("fileName -- "+fileName);
		
		WebDriver driver = TestUtil.getDriver();
		
		File f = ((TakesScreenshot)driver).getScreenshotAs((OutputType.FILE));
		try {
			FileUtils.copyFile(f, new File(fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestFailure(ITestResult arg0) {
		String name = arg0.getName();
		System.out.println("name->" + name);
		
		String fileName = "d:/pass_" + name + ".jpg";
		
		System.out.println("fileName -- "+fileName);
		
		WebDriver driver = TestUtil.getDriver();
		
		File f = ((TakesScreenshot)driver).getScreenshotAs((OutputType.FILE));
		try {
			FileUtils.copyFile(f, new File(fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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