package com.test.SikuliMaven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;


public class PkiLoginTest extends ExcelData
{

 @Test public void pkiLoginTest() throws FindFailed, EncryptedDocumentException, InvalidFormatException, IOException
 {
 
    
		ExcelData exlData= new ExcelData();
		
		String userName = exlData.getExcelData("Sheet1", 1,1);
		
		String pasWrd = exlData.getExcelData("Sheet1", 1,2);
		
		
		PkiLogin pkiT= new PkiLogin();
		
		
		pkiT.pkiLogin(userName,pasWrd );
		
		
		
		
	}}