package com.test.SikuliMaven;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class PkiUserDelete {


	
public void pkiUserDelete() throws FindFailed
	
	{
		
		
		Screen s = new Screen();
		
		s.find("PkiTool_PkiUser_delete_btn");
		
		s.click("PkiTool_PkiUser_delete_btn");
		
		s.find("PkiTool_PkiUser_delete_success_yes_btn");
		
	 s.click(s.wait("PkiTool_PkiUser_delete_success_yes_btn",20));
	 
	
   //s.wait(("PkiTool_PkiUser_delete_success_ok_btn"),20);
	 
	 //s.find("PkiTool_PkiUser_delete_success_ok_btn");
	 
	 
	 s.click(s.wait("PkiTool_PkiUser_delete_success_ok_btn",20));

}}
