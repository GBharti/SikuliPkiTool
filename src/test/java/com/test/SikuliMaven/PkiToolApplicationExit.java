package com.test.SikuliMaven;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class PkiToolApplicationExit {

	public void pkiToolApplicationExit() throws FindFailed
	{
	

	Screen s = new Screen();
	

	//s.find(s.wait("PkiTool_applicationclose_btn",20));
	 
	 s.click("PkiTool_applicationclose_btn");
	 
	 
	 s.find("PkiTool_close_ok_btn");
	 
	 s.click(s.wait("PkiTool_close_ok_btn",20));
	
}
}