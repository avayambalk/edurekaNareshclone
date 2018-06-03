package com.c2t.apachepoi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import statements
public class WriteExcelDemo {
	// XSSFWorkbook workbook = new XSSFWorkbook();
	// XSSFSheet sheet = workbook.createSheet("Employee Data");
	// Row row = sheet.createRow(rowCount);
	// Cell cell = row.createCell(colCount);
	// cell.setCellValue(data[rowCount][colCount]);
	// FileOutputStream out = new FileOutputStream(new
	// File("howtodoinjava_out.xlsx"));
	// workbook.write(out);
	// out.close();
	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook  = new XSSFWorkbook();
		XSSFSheet  sheet = workbook.createSheet("Students");
		Row row0 = sheet.createRow(0);
		Cell cell = row0.createCell(0);
		cell.setCellValue("Write to excell");
		
		File f  =  new File("WriteFile.xlsx");
		FileOutputStream fos = new FileOutputStream(f);
		workbook.write(fos);
		fos.close();
	}

}