package com.test.SikuliMaven;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

public class PkiToolApplicationExitTest {

	
	
	@Test public void pkiToolApplicationExit() throws FindFailed
	{
		
		PkiToolApplicationExit pkiAppExit= new PkiToolApplicationExit();
		
		
		pkiAppExit.pkiToolApplicationExit();
		
	}
}
