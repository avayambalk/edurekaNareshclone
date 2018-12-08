package com.c2t.ist1930;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.extractor.XSSFExportToXml;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import statements
public class ReadExcelDemo2 {
	public static void main(String[] args) throws IOException {

		// FileInputStream file = new FileInputStream(new
		// File("howtodoinjava_demo.xlsx"));
		// XSSFWorkbook workbook = new XSSFWorkbook(file);
		// XSSFSheet sheet = workbook.getSheetAt(0);
		// sheet.getSheetName().equals("Employee Data")
		// Iterator<Row> rowIterator = sheet.iterator();
		// Row row = rowIterator.next();
		// Iterator<Cell> cellIterator = row.cellIterator();

		File f = new File("D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/DDT.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Employee Data");
		
		Iterator<Row> rows = sheet.rowIterator();
		
		while(rows.hasNext()){
			
			Row row = rows.next();
			
			
			Iterator<Cell> cells = row.iterator();
			
			while(cells.hasNext()){
				Cell cell = cells.next();
				System.out.println(cell.toString());
			}
		}
	}

}