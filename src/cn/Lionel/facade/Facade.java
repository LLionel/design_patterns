package cn.Lionel.facade;

import org.junit.Test;

public class Facade {

	@Test
	public void test()
	{
		ModenPostOffice mpo = new ModenPostOffice() ;
		mpo.sendLetter("Hello World!" , "ÖÐ¹ú°²»Õ") ;
	}
}
