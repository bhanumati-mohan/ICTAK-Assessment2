package com.tech.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	private static XSSFWorkbook book;
	private static XSSFSheet sheet;
	private static XSSFCell cell;
	
	public static XSSFCell readDetails(int row,int column) throws IOException {
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelTest.xlsx");
		book=new XSSFWorkbook(file);
		sheet=book.getSheetAt(0);
		cell=sheet.getRow(row).getCell(column);
		return cell;
	}
}
