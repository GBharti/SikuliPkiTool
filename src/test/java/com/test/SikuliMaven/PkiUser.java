package com.test.SikuliMaven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;



public class PkiUser {
	
	@Test public void PkiUserTest1() throws EncryptedDocumentException, InvalidFormatException, IOException, FindFailed
	
	{
		
	
	ExcelData exlData= new ExcelData();
	
	String userName = exlData.getExcelData("Sheet1", 1,1);
	
	String pasWrd = exlData.getExcelData("Sheet1", 1,2);
		Screen s = new Screen();
		
     PkiLogin pkiLog= new PkiLogin();
		
		
		pkiLog.pkiLogin(userName,pasWrd);
		
		
		
		/*s.find("PkiTool_icon.PNG");
		
		s.doubleClick("PkiTool_icon.PNG");
		
		
		s.find("PkiTool_Login_Username.PNG");

s.click(s.wait("PkiTool_management_tab", 30));
	
	s.click("PkiTool_PkiUseroption.PNG");
	
	s.click("PkiTool_PkiUser_add_btn");
	
	s.find("PkiTool_PkiUser_Add_FirstName_textfield");
	
	s.type("Gaurav");
	
	s.type(Key.TAB);
	
	s.type("bharti");
	
	s.type(Key.TAB);
	
	
	
	s.type("gbharti");
	
	s.type(Key.TAB);
	
	s.type(Key.TAB);
	
	s.type("Test@123");
	
	s.type(Key.TAB);
	
	s.type("Test@123");
	
	s.type(Key.TAB);
	s.type(Key.TAB);
	
	s.type("Gaurav.bharti@trivium.com");
	
	s.click("PkiTool_PkiUser_Window_add_btn");
	
	
		s.click(s.wait("PkiTool_PkiUser_Window_add_success_message",20));
		


		
	s.click("PkiTool_PkiUser_edit_btn");
	
	
	
	s.click(s.wait("PkiTool_PkiUser_edit_save_btn"),10);


	
s.click(s.wait("PkiTool_PkiUser_edit_success_ok_btn"), 20);

	
	s.find("PkiTool_PkiUser_delete_btn");
	
	s.click("PkiTool_PkiUser_delete_btn");
	
	s.find("PkiTool_PkiUser_delete_success_yes_btn");
	
s.click("PkiTool_PkiUser_delete_success_yes_btn");


s.wait(("PkiTool_PkiUser_delete_success_ok_btn"),20);

s.find("PkiTool_PkiUser_delete_success_ok_btn");


s.click("PkiTool_PkiUser_delete_success_ok_btn");

s.find("PkiTool_applicationclose_btn");

s.click("PkiTool_applicationclose_btn");


s.find("PkiTool_close_ok_btn");

s.click("PkiTool_close_ok_btn");

*/
}
}
