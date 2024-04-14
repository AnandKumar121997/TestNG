package com.adactin.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static WebElement element;
	public static Select s;
	
	public static WebDriver browserLaunch(String url) {
		driver = new ChromeDriver();
		driver.get(url);
		return driver;
	}

	public static void sendKeysData(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void click_element(WebElement element) {
		element.click();
	}
	
	public static void maximizee() {
		driver.manage().window().maximize();
	}
	
	public static void implicitWait(long time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	public static String getAttribute_of_Element(WebElement element, String value) {
		String attributeValue = null;
		return attributeValue = element.getAttribute(value);
	}
	
	public static void select_by_visibleText(WebElement element,String value) {
		s = new Select(element);
		s.selectByVisibleText(value);
	}
	public static String excelRead_reuse(int i, int j) {
		String value = null;
		try {
			String location = "C:\\Users\\hello\\eclipse-workspace\\JanProject\\AdactinHotelPageFactory\\src\\test\\resources\\TestData\\AdactinHotelData.xlsx";
			File f = new File(location);
			// file read
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(j);
			// System.out.println(cell);
			int cellType = cell.getCellType();
			if (cellType == 1) {
				value = cell.getStringCellValue();
				// System.out.println(value);
			} else if (cellType == 0) {
				if (DateUtil.isCellDateFormatted(cell)) {
					java.util.Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
					value = sm.format(dateCellValue);
					// System.out.println(value);
				} else {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
					value = String.valueOf(l);
					// System.out.println(value);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}
	
	public static void excelWrite_reuse(int i , int j) {
		String location = "C:\\Users\\hello\\eclipse-workspace\\JanProject\\AdactinHotelPageFactory\\src\\test\\resources\\TestData\\AdactinHotelData.xlsx";
		File f = new File(location);
		try {
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sh = wb.createSheet("Sheet2");
			Row row = sh.createRow(i);
			Cell cell = row.createCell(j);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void excelWrite( int r, int c, String value) {

		try {
			String filePath = "C:\\Users\\hello\\eclipse-workspace\\JanProject\\AdactinHotelPageFactory\\src\\test\\resources\\TestData\\AdactinHotelData.xlsx";
			File file = new File(filePath);
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet createSheet = wb.createSheet("Sheet2");
			Row createRow = createSheet.createRow(r);
			Cell createCell = createRow.createCell(c);
			createCell.setCellValue(value);

			FileOutputStream fos = new FileOutputStream(file);
			wb.write(fos);
			wb.close();

		}

		catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}


	public static String readProperty(String key) {
		String value = null;
		try {
			String filepath = "C:\\Users\\hello\\eclipse-workspace\\JanProject\\AdactinHotelPageFactory\\src\\test\\resources\\TestData\\config.properties";
			FileReader r = new FileReader(filepath);
			Properties prop = new Properties();
			prop.load(r);
			value = prop.getProperty(key);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return value;

	}
	
}
