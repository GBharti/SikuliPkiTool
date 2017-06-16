package com.test.SikuliMaven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

public class PkiUserEditTest extends ExcelData{

	@Test public void pkiUserEditTest() throws FindFailed 
 
	{
		
	
	PkiUserEdit pkiUsrEdt= new PkiUserEdit();
	
	pkiUsrEdt.pkiUserEdit();
	
	}

}
