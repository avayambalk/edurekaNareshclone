package com.c2t.edureka.ist830.module9;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.c2t.edureka.ist830.module8.PomFacebook;

/**
 * @author : Naresh Chaurasia
 * @email : message4naresh@gmail.com
 * @Code : https://bitbucket.org/connect2tech
 * @WebSite : https://connect2tech.in/ 
 * @Profile : https://goo.gl/2mCt6v
 * @YouTubeChannel: https://goo.gl/c7FAsq
 */

public class DDT {
	
	WebDriver driver;
	
	@DataProvider
	public String[][] loginData(){
		
		String data [][] = new String [3][2];
		
		
		try {
			File file = new File("D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/DDT.xlsx");
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet("Employee Data");
			
			
			
			
			Iterator<Row> rows = sheet.rowIterator();
			
			int rowCount = 0;
			while(rows.hasNext()){
				Row row = rows.next();
				
				Iterator<Cell>  cell = row.cellIterator();
				
				int colCount = 0;
				while(cell.hasNext()){
					Cell c = cell.next();
					data[rowCount][colCount] = c.toString();
					++colCount;
					System.out.println(c);
				}
				++rowCount;
				System.out.println("--------------------");
			}
			
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return data;
		
	}
	
	@BeforeTest
	public void before() {
		String url = "https://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver",
				"D:/nchaurasia/Automation-Architect/connect2tech.in-SeleniumWebDriver3.x_2/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	
	
	@Test(dataProvider="loginData")
	public void login(String u, String p){
		
		System.out.println("send username="+u);
		System.out.println("send password="+p);
		System.out.println("click");
		
		driver.findElement(By.id("mail")).sendKeys(u);
		driver.findElement(By.id("pass")).sendKeys(p);
		driver.findElement(By.id("loginbutton")).click();
	}
	
}
