package com.c2t.edureka.ist830.module10;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : https://connect2tech.in/
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class TestNg {

	WebDriver driver;
	PropertiesFiles prop;
	Properties properties;
	Sheet sheet;

	@BeforeTest
	public void before() {
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Getting the data into properties file
		prop = new PropertiesFiles();
		properties = prop.getProperties();

		ReadDataFromExcelFile excel = new ReadDataFromExcelFile();

		try {
			sheet = excel.readExcel("D:\\nchaurasia\\Automation-Architect\\connect2tech.in-SeleniumWebDriver3.x_2",
					"TestCase.xlsx", "KeywordFramework");
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	@Test
	public void testCase() throws Exception{
		UIOperation uiOps = new UIOperation();
		uiOps.setDriver(driver);
		
		int lastRow = sheet.getLastRowNum();
		int firstRow = sheet.getFirstRowNum();
		
		int rowCount = lastRow - firstRow;
		
		for(int i=1;i<= rowCount;i++){
			Row row = sheet.getRow(i);
			
			int len = row.getCell(0).toString().length();
			
			if(len > 0){
				System.out.println("Executing " +row.getCell(0).toString() );
			}else{
				String operation = row.getCell(1).toString();
				String objectName = row.getCell(2).toString();
				String objectType = row.getCell(3).toString();
				String value = row.getCell(4).toString();
				uiOps.perform(properties, operation, objectName, objectType, value);
			}
		}
		
		
	}

}
