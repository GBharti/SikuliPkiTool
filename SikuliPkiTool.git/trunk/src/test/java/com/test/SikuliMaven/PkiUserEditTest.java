package com.test.SikuliMaven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.sikuli.script.FindFailed;

public class PkiUserEditTest extends ExcelData{

	public static void main(String[] args) throws FindFailed, EncryptedDocumentException, InvalidFormatException, IOException
	{
  

	ExcelData exlData= new ExcelData();
	
	String userName = exlData.getExcelData("Sheet1", 1,1);
	
	String pasWrd = exlData.getExcelData("Sheet1", 1,2);
	
	String pkiUserFirstName = exlData.getExcelData("Sheet1",4,3);
	
	String pkiUserLastName = exlData.getExcelData("Sheet1",4,4);
	
	String pkiUserLoginName = exlData.getExcelData("Sheet1",4,5);
	
	String pkiUserPasswrd = exlData.getExcelData("Sheet1",4,6);
	
	String pkiUserEmail = exlData.getExcelData("Sheet1",4,7);
	
	
	
	PkiLogin pkiLog= new PkiLogin();
	
	
	pkiLog.pkiLogin(userName,pasWrd);
	
	
	
	
	PkiUserAdd pkiUsrAdd= new PkiUserAdd();
	
	
	pkiUsrAdd.pkiUserAdd(pkiUserFirstName, pkiUserLastName, pkiUserLoginName, pkiUserPasswrd, pkiUserEmail);

	PkiUserEdit pkiUsrEdt= new PkiUserEdit();
	
	pkiUsrEdt.pkiUserEdit();
	
	}

}
