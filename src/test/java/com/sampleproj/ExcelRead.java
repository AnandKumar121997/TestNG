 package com.sampleproj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
public static void excelRead() {
	
	try {
		File file=new File("C:\\Users\\anand\\eclipse-workspace\\TestingEx\\src\\test\\resources\\TestExcel\\ExcelTest.xlsx ");
		FileInputStream fis = new FileInputStream(file);
		Workbook wk = new XSSFWorkbook(fis);
		Sheet sheet = wk.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(2);
		System.out.println(cell);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	
	}
}

public static void excelread_AllData() {

	try {
		File f = new File(
				"C:\\\\Users\\\\anand\\\\eclipse-workspace\\\\TestingEx\\\\src\\\\test\\\\resources\\\\TestExcel\\\\ExcelTest.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = sheet.getRow(i);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < physicalNumberOfCells; j++) {
				Cell cell = row.getCell(j);
				System.out.println(cell);
			}
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public static void excelReadCellType() {

	try {
		File f = new File(
				"C:\\\\\\\\Users\\\\\\\\anand\\\\\\\\eclipse-workspace\\\\\\\\TestingEx\\\\\\\\src\\\\\\\\test\\\\\\\\resources\\\\\\\\TestExcel\\\\\\\\ExcelTest.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = sheet.getRow(i);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < physicalNumberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType ==cellType.STRING) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				} else if (cellType ==cellType.NUMERIC) {
					if (DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
						String format = sm.format(dateCellValue);
						System.out.println(format);
					} else {
						double numericCellValue = cell.getNumericCellValue();
						long l = (long) numericCellValue;
						String valueOf = String.valueOf(l);
						System.out.println(valueOf);
					}
				}

			}
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


public static String excelReadReuse(int i , int j) {
	String value = null;
	try {
		File f = new File(
				"C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\anand\\\\\\\\\\\\\\\\eclipse-workspace\\\\\\\\\\\\\\\\TestingEx\\\\\\\\\\\\\\\\src\\\\\\\\\\\\\\\\test\\\\\\\\\\\\\\\\resources\\\\\\\\\\\\\\\\TestExcel\\\\\\\\\\\\\\\\ExcelTest.xlsx");
		// file read
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(i);
		Cell cell = row.getCell(j);
		CellType cellType = cell.getCellType();
		if (cellType == cellType.STRING) {
			value = cell.getStringCellValue();
			System.out.println(value);
		} else if (cellType == cellType.NUMERIC) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
				value = sm.format(dateCellValue);
				System.out.println(value);
			} else {
				double numericCellValue = cell.getNumericCellValue();
				long l = (long) numericCellValue;
				value= String.valueOf(l);
				System.out.println(value);
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

public static void main(String[] args) {
	excelReadReuse(1,1);
}
}

