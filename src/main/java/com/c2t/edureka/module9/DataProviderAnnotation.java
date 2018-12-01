package com.c2t.edureka.module9;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class DataProviderAnnotation {

		@DataProvider
		public String [][] testData(){
			
			String arr[][] = new String[3][2];
			
			try {
				File f = new File("D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/DDT.xlsx");
				FileInputStream fis = new FileInputStream(f);
			
				XSSFWorkbook workbook = new XSSFWorkbook(fis);
				
				XSSFSheet sheet = workbook.getSheet("Employee Data");
				
				Iterator <Row> iter = sheet.iterator();
				
				int rowCount = 0;
				while(iter.hasNext()){
					Row row = iter.next();
					
					Iterator<Cell> cellsIter = row.iterator();
					
					int colCount = 0;
					while(cellsIter.hasNext()){
						Cell cell = cellsIter.next();
						System.out.println("cell="+cell);
						arr[rowCount][colCount] = cell.toString();
						++colCount;
					}
					
					System.out.println("");
					++rowCount;
					
					
				}
				
				
			
			} catch (Exception e) {
				System.out.println("Ex="+e);
			}
			
			
			
			
			return arr;
		}
	
		@Test(dataProvider="testData")
		public void test1(String col1, String col2){
			//Login
		}
	
}
