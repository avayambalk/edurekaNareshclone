package com.c2t.framework.hybrid;

import java.util.Properties;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.c2t.framework.hybrid.ExcelFile;
import com.c2t.framework.hybrid.ReadObject;
import com.c2t.framework.hybrid.UIOperation;

public class ExecuteTest {

	WebDriver webdriver;
	ExcelFile file;
	ReadObject object;
	Properties allObjects;

	@BeforeTest
	public void beforeTest() throws Exception{
		webdriver = new FirefoxDriver();
		file = new ExcelFile();
		object = new ReadObject();
		allObjects = object.getObjectRepository();
	}

	@Test
	public void testLogin() throws Exception {
		
		UIOperation operation = new UIOperation(webdriver);
		// Read keyword sheet
		Sheet sheet = file.readExcel(System.getProperty("user.dir")
				+ "\\", "TestCase.xlsx", "KeywordFramework");
		// Find number of rows in excel file
		int rowCount = sheet.getLastRowNum()
				- sheet.getFirstRowNum();
		// Create a loop over all the rows of excel file to read it
		for (int i = 1; i < rowCount + 1; i++) {
			// Loop over all the rows
			Row row = sheet.getRow(i);
			// Check if the first cell contain a value, if yes, That means it is
			// the new testcase name
			if (row.getCell(0).toString().length() == 0) {
				// Print testcase detail on console
				System.out.println(row.getCell(1).toString() + "----"
						+ row.getCell(2).toString() + "----"
						+ row.getCell(3).toString() + "----"
						+ row.getCell(4).toString());
				// Call perform function to perform operation on UI
				operation.perform(allObjects, row.getCell(1).toString(), row
						.getCell(2).toString(), row.getCell(3).toString(), row
						.getCell(4).toString());
			} else {
				// Print the new testcase name when it started
				System.out.println("New Testcase->" + row.getCell(0).toString()
						+ " Started");
			}
		}
	}
}