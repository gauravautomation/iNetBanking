package com.iNetbanking.testcases;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.iNetbanking.utilities.ReadConfig;

public class BaseClass {
	ReadConfig re=new ReadConfig();

		public String baseURL= re.getURL(); 
//		public String userName=readdata.getUN();
//		public String password=readdata.getPWD();
		public static WebDriver driver;
		public static Logger log;
		
		@Parameters("browser")
		@BeforeClass
		public void setUp(String br) throws InterruptedException
		{
			if(br.equals("chrome"))
			{
			System.setProperty("webdriver.chrome.driver",re.getChromePath());
			driver=new ChromeDriver();
			Thread.sleep(5000);
			driver.manage().window().maximize();
			}
			else if(br.equals("firefox"))
			{
				System.setProperty("webdriver.firefox.driver",re.getFirefoxPath());
				driver=new FirefoxDriver();
			}
			
			else if(br.equals("ie"))
			{
				System.setProperty("webdriver.ie.driver", re.getIEPath());
				driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
			}
//			
//			log = Logger.getLogger("iNetBanking");
//			PropertyConfigurator.configure("Log4j.properties");			
			
		}	
		
		@AfterClass
		public void tearDown() throws InterruptedException
		{
			driver.quit();  
		}
		

}
