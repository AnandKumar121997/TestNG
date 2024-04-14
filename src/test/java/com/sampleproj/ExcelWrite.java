package com.sampleproj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void exel_write() {

		try {
			File f = new File(
					"C:\\\\Users\\\\anand\\\\eclipse-workspace\\\\TestingEx\\\\src\\\\test\\\\resources\\\\TestExcel\\\\ExcelTest.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wk = new XSSFWorkbook(fis);
			Sheet createSheet = wk.createSheet("Aiite");
			Row createRow = createSheet.createRow(0);
			Cell createCell = createRow.createCell(0);
			createCell.setCellValue("Java");
			FileOutputStream fos = new FileOutputStream(f);
			wk.write(fos);
			wk.close();
			System.out.println("Successfully written");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
}
	}
	
	public static void exelWriteReuse() {

		try {
			File f = new File(
					"C:\\\\\\\\Users\\\\\\\\anand\\\\\\\\eclipse-workspace\\\\\\\\TestingEx\\\\\\\\src\\\\\\\\test\\\\\\\\resources\\\\\\\\TestExcel\\\\\\\\ExcelTest.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet getSheet = wb.getSheet("Aiite");
			Row getRow = getSheet.getRow(0);
			Cell getCell = getRow.getCell(0);
			String stringCellValue = getCell.getStringCellValue();
			if(stringCellValue.equals("Java")) {
				getCell.setCellValue("Selenium");
			}
			
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
			wb.close();
			System.out.println("Successfully written");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		exelWriteReuse();
	}
}
