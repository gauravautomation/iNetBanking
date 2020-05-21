package com.iNetbanking.testcases;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import com.iNetbanking.pageObject.Header;

public class TC_HeaderLogoDisplayed_002 extends BaseClass {
	
	@Test
	public void headerlogos() throws InterruptedException
	{
		Header hd=new Header(driver);
		driver.get(baseURL);
		log.info("URL entered");
//		WebDriverWait wait=new WebDriverWait(driver, 20);
//		WebElement mainLogo;
//		mainLogo= wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("desktopLogo")));
		assertEquals(hd.primaryLogo(), true);
		log.info("Primary Logo Displayed");
		assertEquals(hd.secLogo1(), true);
		assertEquals(hd.secLogo2(), true);
		assertEquals(hd.secLogo3(), true);
		assertEquals(hd.secLogo4(), true);
		assertEquals(hd.secLogo5(), true);
		log.info("All Secondary Logos Displayed");
	}

}
