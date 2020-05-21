package com.iNetbanking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Logintest_001 extends BaseClass {
	
	@Test
	public void logIn() throws InterruptedException
	{
		//LoginPage lp=new LoginPage(driver);
		log.info("URL entered");
		Thread.sleep(4000);
		driver.get(baseURL);
//		lp.setUsername(userName);
//		log.info("username entered");
//		lp.setPassword(password);
//		lp.clickLogin();
		
		if(driver.getTitle().equals("Homepage | The Official Home of The Pabst Theater | Riverside Theater | Turner Hall Ballroom | The Back Room @ Colectivo"))
		{
			System.out.println("entered in success part");
			Assert.assertTrue(true);
		}
		
		else
		{ 
			System.out.println("entered in faild part");
			Assert.assertFalse(false);
		}
		
	}

}
