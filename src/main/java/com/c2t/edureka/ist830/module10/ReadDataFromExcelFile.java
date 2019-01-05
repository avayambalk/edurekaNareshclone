package com.c2t.edureka.ist830.module10;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : https://connect2tech.in/
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class ReadDataFromExcelFile {
	public Sheet readExcel(String filePath, String fileName, String sheetName) throws IOException {
		// Create a object of File class to open xlsx file
		File file = new File(filePath + "\\" + fileName);
		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);
		Workbook wb = null;
		// Find the file extension by spliting file name in substing and getting
		// only extension name
		// Check condition if the file is xlsx file
		wb = new XSSFWorkbook(inputStream);
		// Read sheet inside the workbook by its name
		Sheet guru99Sheet = wb.getSheet(sheetName);
		return guru99Sheet;
	}
	
	public static void main(String[] args) {
		
		try {
			ReadDataFromExcelFile obj = new ReadDataFromExcelFile();
			obj.readExcel("D:\\nchaurasia\\Automation-Architect\\connect2tech.in-SeleniumWebDriver3.x_2", "TestCase.xlsx", "KeywordFramework");	
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
