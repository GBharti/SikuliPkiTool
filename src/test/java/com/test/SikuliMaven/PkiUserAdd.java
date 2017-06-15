package com.test.SikuliMaven;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;
import org.testng.Reporter;

public class PkiUserAdd {


	
	public void pkiUserAdd(String pkiUserFirstName, String pkiUserLastName,String pkiUserLoginName, String pkiUserPasswrd, String pkiUserEmail ) throws FindFailed
	{
		Screen s = new Screen();
		
		
		
		s.click(s.wait("PkiTool_management_tab", 20));
		
		Reporter.log("management link is available");
		
		s.click("PkiTool_PkiUseroption.PNG");
		
		Reporter.log("Pki user option is found");
		
		s.click(s.wait("PkiTool_PkiUser_add_btn",20));
		
		s.find("PkiTool_PkiUser_Add_FirstName_textfield");
		
		
		s.type(pkiUserFirstName);
		
		//s.type("Gaurav");
		
		s.type(Key.TAB);
		
		s.type(pkiUserLastName);
		
		//s.type("bharti");
		
		s.type(Key.TAB);

		s.type(pkiUserLoginName);
		
		
		//s.type("gbharti");
		
		s.type(Key.TAB);
		
		s.type(Key.TAB);
		
		s.type(pkiUserPasswrd);
		
		//s.type("Test@123");
		
		s.type(Key.TAB);
		
		s.type(pkiUserPasswrd);
		
		//s.type("Test@123");
		
		s.type(Key.TAB);
		s.type(Key.TAB);
		
		s.type(pkiUserEmail);
		
		
		//s.type("Gaurav.bharti@trivium.com");
		
		s.click("PkiTool_PkiUser_Window_add_btn");
		
		s.click(s.wait("PkiTool_PkiUser_Window_add_success_message",20));
		
		

		
	
		
		
	}}


