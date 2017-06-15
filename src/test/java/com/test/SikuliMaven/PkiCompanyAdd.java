package com.test.SikuliMaven;


import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

public class PkiCompanyAdd {

	
	
	public void pkiCompanyAdd(String pkiCompanyName, String pkiCompanyEmail, String authStartDate) throws FindFailed
	{
			
		Screen s = new Screen();
		
		s.click(s.wait("PkiTool_management_tab", 20));
		
		s.click(s.wait("PkiTool_Company option",20));

		s.click(s.wait("PkiTool_CompanyAdd_btn",20));
		
		s.find("PkiTool_Company_AddScreen_CompanyNametextbox")	;
		
		s.click("PkiTool_Company_AddScreen_CompanyNametextbox");
		
		s.type(pkiCompanyName);
		
		
		
		s.click("PkiTool_Company_AddScreen_Companytype_dropdown");
		
		s.click("PkiTool_Company_AddScreen_CompanyType_Company");
		
		
		s.type(Key.TAB);
		
		s.type(pkiCompanyEmail);
		
		
	s.find("PkiTool_Company_AddScreen_AuthorizationStartDate");
	
	s.click("PkiTool_Company_AddScreen_AuthorizationStartDate");
		
	s.type(authStartDate);
	
	s.click("PkiTool_CompanyAdd_Window_add_btn");
	
	
	//s.find("PkiTool_Company_AddScreen_AddSuccess_Ok_Btn");
	
		
		
	s.click(s.wait("PkiTool_Company_AddScreen_AddSuccess_Ok_Btn",20));
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
}}
