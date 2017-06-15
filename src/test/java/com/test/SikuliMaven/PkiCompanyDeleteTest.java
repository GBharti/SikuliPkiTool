package com.test.SikuliMaven;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

public class PkiCompanyDeleteTest {

	
	@Test public void pkiCompDeleteTest() throws FindFailed
	{
		
		PkiCompanyDelete pkiCompDel = new PkiCompanyDelete();
		
		pkiCompDel.pkiCompDelete();
		
		
		
	}
	
}
