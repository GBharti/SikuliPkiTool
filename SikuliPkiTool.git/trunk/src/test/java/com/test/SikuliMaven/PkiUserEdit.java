package com.test.SikuliMaven;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class PkiUserEdit {

	public void pkiUserEdit() throws FindFailed
	
	{
		
		
		Screen s = new Screen();
		
		
		s.click("PkiTool_PkiUser_edit_btn");
		
		
		
		s.click(s.wait("PkiTool_PkiUser_edit_save_btn"),10);


		
	 s.click(s.wait("PkiTool_PkiUser_edit_success_ok_btn"), 20);
		
		
	}

	
	
	}


