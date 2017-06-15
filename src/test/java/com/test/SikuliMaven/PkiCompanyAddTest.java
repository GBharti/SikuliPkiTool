package com.test.SikuliMaven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

public class PkiCompanyAddTest {

	
	@Test public void pkiCompanyAddTest() throws EncryptedDocumentException, InvalidFormatException, IOException, FindFailed
	{

         ExcelData exlData= new ExcelData();

		
		String pkiCompanyName = exlData.getExcelData("Sheet1",7,1);
		
		String pkiCompanyEmail = exlData.getExcelData("Sheet1",7,2);
		
		String authStartDate = exlData.getExcelData("Sheet1",7,3);
		
		
		PkiCompanyAdd pkiCompadd = new PkiCompanyAdd();
		
		pkiCompadd.pkiCompanyAdd(pkiCompanyName, pkiCompanyEmail, authStartDate);
		
		
		
		
	}
}
