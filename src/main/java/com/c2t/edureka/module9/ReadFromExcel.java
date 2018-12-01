package com.c2t.edureka.module9;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class ReadFromExcel {

	public static void main(String[] args) {

		try {
			File f = new File("D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/DDT.xlsx");
			FileInputStream fis = new FileInputStream(f);
		
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			
			XSSFSheet sheet = workbook.getSheet("Employee Data");
			
			Iterator <Row> iter = sheet.iterator();
			
			while(iter.hasNext()){
				Row row = iter.next();
				
				Iterator<Cell> cellsIter = row.iterator();
				
				while(cellsIter.hasNext()){
					Cell cell = cellsIter.next();
					System.out.println("cell="+cell);
				}
				
				System.out.println("");
				
				
			}
			
			
		
		} catch (Exception e) {
			System.out.println("Ex="+e);
		}

	}
}
