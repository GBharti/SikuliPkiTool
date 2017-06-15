package com.test.SikuliMaven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {

	
	String filePath ="D:\\Elipse\\maven\\SikuliMaven\\TestData\\TestData.xlsx";
	
	
	
		public String getExcelData(String sheetName, int rowNum, int colNum) throws EncryptedDocumentException, InvalidFormatException, IOException {
			
			FileInputStream fileInput= new FileInputStream(filePath);
		
			
			Workbook wb= WorkbookFactory.create(fileInput);
			
			Sheet sh = wb.getSheet(sheetName);
			
			Row row = sh.getRow(rowNum);
			
			String data = row.getCell(colNum).getStringCellValue();
			
			
			
		
			
			 return data;
			 
			
			}
		

@SuppressWarnings("static-access")
public void setExcelData(String sheetname, int rowNum, int colNum, int res) throws EncryptedDocumentException, InvalidFormatException, IOException
{
			
			FileInputStream fileInput= new FileInputStream(filePath);
		
			
			Workbook wb= WorkbookFactory.create(fileInput);
			
			Sheet sh = wb.getSheet("Sheet1");
			
			Row row = sh.getRow(rowNum);
			
			Cell cell= row.createCell(res);
			
			cell.setCellType(cell.CELL_TYPE_STRING);
			
			
			
			FileOutputStream  fileOutput= new FileOutputStream(filePath);
			
			cell.setCellValue("Pass");
			wb.write(fileOutput);
			wb.close();
		
			
		

		
}
	}

