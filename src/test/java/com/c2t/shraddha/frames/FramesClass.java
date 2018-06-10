package com.c2t.shraddha.frames;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : http://c2t.nchaurasia.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.*;

public class FramesClass {
	public static WebDriver driver;

	public FramesClass(WebDriver passedDriver) {
		driver = passedDriver;
	}

	public List<WebElement> GetAllPackages() {
		driver.switchTo().frame("packageListFrame");
		WebElement packages = driver.findElement(By.cssSelector("div.indexContainer>ul"));
		return packages.findElements(By.tagName("li"));
	}

	public void clickOnPackage(String packageName) {
		List<WebElement> links = GetAllPackages();
		for (WebElement webElement : links) {
			if (webElement.getText().equals(packageName)) {
				webElement.click();
			}

		}
		driver.switchTo().defaultContent();

	}

	public void WritePackageNameIntoExcel(String filePath, String packageName) {

		File myExcel = new File(filePath);
		try {

			if (!myExcel.exists()) {
				myExcel.createNewFile();
			}
			XSSFWorkbook workbook = new XSSFWorkbook();
			// Create sheet
			workbook.createSheet(packageName);

			// Write the workbook in file system
			FileOutputStream fileOut = new FileOutputStream(filePath);
			workbook.write(fileOut);
			fileOut.close();
			System.out.println("File creatation successful");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void WritePackageDetailsIntoExcel(String filePath, String packageName) throws IOException {

		// switch to package frame
		driver.switchTo().frame("packageFrame");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Get all the implementations
		List<WebElement> packageElements = driver.findElements(By.tagName("ul"));

		System.out.println("The totel no of Implementations for this package is : " + packageElements.size());

		// Create a object of File class to open xlsx file
		File file = new File(filePath);

		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);
		Workbook workBook = new XSSFWorkbook(inputStream);

		// Read sheet inside the workbook by its name
		Sheet sheet = workBook.getSheet(packageName);

		int cellNum = 0;
		int rowNum = 0;
		// Get the links for each implementation
		for (WebElement webElement : packageElements) {

			String elementTitle = webElement.getAttribute("title");

			sheet.createRow(rowNum).createCell(cellNum).setCellValue(elementTitle);
			List<WebElement> elementList = webElement.findElements(By.tagName("li"));

			System.out.println(elementTitle + " : " + elementList.size());
			for (WebElement subElement : elementList) {
				WebElement refList = subElement.findElement(By.tagName("a"));
				// String link = refList.getAttribute("href");
				String link = refList.getText();
				rowNum++;
				sheet.createRow(rowNum).createCell(cellNum + 1).setCellValue(link);
			}
			rowNum = elementList.size() + 1;

		}
		// Write the workbook in file system
		FileOutputStream out = new FileOutputStream(file);
		System.out.println(out);
		workBook.write(out);
		out.close();

		System.out.println("Write successful");

	}

	public boolean clickOnElement_BottomLeftFrame(String value) {

		boolean result = false;
		// Get all the implementations
		List<WebElement> packageElements = driver.findElements(By.tagName("ul"));

		for (WebElement webElement : packageElements) {

			String elementTitle = webElement.getAttribute("title");

			List<WebElement> elementList = webElement.findElements(By.tagName("li"));

			for (WebElement subElement : elementList) {
				WebElement refList = subElement.findElement(By.tagName("a"));
				if (refList.getText().equals(value)) {
					refList.click();
					result = true;
				}
			}
		}

		driver.switchTo().defaultContent();
		return result;
	}

	public boolean WriteImplementingClassesOrInterfacesIntoExcel(String filePath, String packageName)
			throws IOException {

		boolean result = false;
		int rowNum = 0;
		driver.switchTo().defaultContent();

		// switch to middle frame
		driver.switchTo().frame("classFrame");

		List<WebElement> classesOrInterface = driver.findElements(By.xpath("//div[@class = 'description']/ul/li/dl"));
		System.out.println(classesOrInterface.size());
		for (WebElement webElement : classesOrInterface) {
			if (webElement.getText().contains("All Known Implementing Classes:")
					|| webElement.getText().contains("All Implemented Interfaces:")) {
				result = true;
				System.out.println(webElement.getText());

				String[] val = webElement.getText().split(":");
				// Create a object of File class to open xlsx file
				File file = new File(filePath);

				// Create an object of FileInputStream class to read excel file
				FileInputStream inputStream = new FileInputStream(file);
				Workbook workBook = new XSSFWorkbook(inputStream);

				// Read sheet inside the workbook by its name
				Sheet sheet = workBook.getSheet(packageName);
				rowNum = sheet.getLastRowNum() + 2;

				sheet.createRow(rowNum).createCell(0).setCellValue(val[0] + " for : " + driver.getTitle());
				sheet.createRow(rowNum + 1).createCell(1).setCellValue(val[1]);

				// Write the workbook in file system
				FileOutputStream out = new FileOutputStream(file);
				System.out.println(out);
				workBook.write(out);
				out.close();

				System.out.println("Write successful");

			} else {
				System.out.println("No Implementing Classes or Interfaces available");
			}
		}
		return result;
	}

	public boolean WriteMethodsIntoExcel(String filePath, String packageName) throws IOException {

		boolean result = false;
		int rowNum = 1;
		WebElement methodTable = driver.findElement(By.xpath(
				"//table[@class = 'memberSummary' and @summary = 'Method Summary table, listing methods, and an explanation']"));
		List<WebElement> methodList = methodTable.findElements(By.cssSelector("td.colLast"));
		System.out.println("Number of methods : " + methodList.size());

		// Create a object of File class to open xlsx file
		File file = new File(filePath);

		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);
		Workbook workBook = new XSSFWorkbook(inputStream);

		// Read sheet inside the workbook by its name
		Sheet sheet = workBook.getSheet(packageName);

		// get the last row no
		rowNum = sheet.getLastRowNum() + 2;
		sheet.createRow(rowNum).createCell(0).setCellValue("All the methods for : " + driver.getTitle());
		rowNum++;
		for (WebElement webElement : methodList) {

			System.out.println(webElement.findElement(By.tagName("a")).getText());

			String val = webElement.getText();
			
			sheet.createRow(rowNum).createCell(1).setCellValue(val);

			rowNum++;

			result = true;
		}

		// Write the workbook in file system
		FileOutputStream out = new FileOutputStream(file);
		System.out.println(out);
		workBook.write(out);
		out.close();

		System.out.println("Write successful");

		return result;
	}

}
