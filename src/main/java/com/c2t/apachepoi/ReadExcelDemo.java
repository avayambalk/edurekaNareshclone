package com.c2t.apachepoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.extractor.XSSFExportToXml;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import statements
public class ReadExcelDemo {
	public static void main(String[] args) throws IOException {

		readDataFromExcelSheet();

	}

	static void readDataFromExcelSheet() throws IOException {
		// FileInputStream file = new FileInputStream(new
		// File("howtodoinjava_demo.xlsx"));
		// XSSFWorkbook workbook = new XSSFWorkbook(file);
		// XSSFSheet sheet = workbook.getSheetAt(0);
		// sheet.getSheetName().equals("Employee Data")
		// Iterator<Row> rowIterator = sheet.iterator();
		// Row row = rowIterator.next();
		// Iterator<Cell> cellIterator = row.cellIterator();
		
		File f = new File("DDT.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet  sheet = workbook.getSheet("Employee Data");
		Iterator<Row> rows = sheet.iterator();
		
		while(rows.hasNext()){
			Row row = rows.next();
			
			Iterator<Cell>  cells = row.cellIterator();
			
			while(cells.hasNext()){
				Cell c = cells.next();
				System.out.println("c="+c);
			}
		}
		
		
		/*File f = new File("DDT.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		System.out.println(sheet.getSheetName());
		Iterator<Row> rows = sheet.iterator();
		
		while(rows.hasNext()){
			
			Row r = rows.next();
			
			
			Iterator<Cell> cells = r.iterator();
			
			while(cells.hasNext()){
				Cell cell = cells.next();
				System.out.println(cell);
			}
			 
		}*/
		
		
	
	}
}