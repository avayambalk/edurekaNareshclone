package com.c2t.apachepoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import statements
public class ReadExcelDemo {
	public static void main(String[] args) {

		readDataFromExcelSheet();

	}

	static void readDataFromExcelSheet() {
		// FileInputStream file = new FileInputStream(new
		// File("howtodoinjava_demo.xlsx"));
		// XSSFWorkbook workbook = new XSSFWorkbook(file);
		// XSSFSheet sheet = workbook.getSheetAt(0);
		// sheet.getSheetName().equals("Employee Data")
		// Iterator<Row> rowIterator = sheet.iterator();
		// Row row = rowIterator.next();
		// Iterator<Cell> cellIterator = row.cellIterator();
		
		File f = new File("howtodoinjava_out.xlsx");
		try {
			FileInputStream fis = new FileInputStream(f);
			XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = xssfWorkbook.getSheetAt(0);
			
			String sheetName = sheet.getSheetName();
			
			if(sheetName.equals("Employee Data")){
				Iterator<Row> rows = sheet.iterator();
				
				while(rows.hasNext()){
					System.out.println("I am a row....");
					Row row = rows.next();
					
					Iterator <Cell> columns = row.iterator();
					
					while(columns.hasNext()){
						Cell cell = columns.next();
						System.out.println("The value of cell = " + cell);
					}
				}
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		

/*		try {

		
					while (cellIterator.hasNext()) {
						Cell cell = cellIterator.next();
						System.out.println(cell);

						switch (cell.getCellType()) {
						case Cell.CELL_TYPE_NUMERIC:
							double d = cell.getNumericCellValue();
							System.out.println("d=" + d);
							break;
						case Cell.CELL_TYPE_STRING:
							String s = cell.getStringCellValue();
							System.out.println("s=" + s);
							cell.setCellValue("testing");
							break;
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	}
}