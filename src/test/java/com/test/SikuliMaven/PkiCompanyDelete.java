package com.test.SikuliMaven;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

public class PkiCompanyDelete {
	
	public void pkiCompDelete() throws FindFailed
	{
	
		
		Screen s = new Screen();
		
		s.find("PkiTool_Companydelete_btn");
		
		s.click("PkiTool_Companydelete_btn");
		
		s.type(Key.TAB);
		
		s.click(s.wait("PkiTool_Company_DeleteCompany_yes_btn",30));
		
		s.click(s.wait("PkiTool_Company_DeleteCompany_Success_Ok_btn",20));
		
		
	}
	}


