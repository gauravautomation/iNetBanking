package com.iNetbanking.utilities;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends TestListenerAdapter{
	
   public ExtentHtmlReporter htmlReporter;
   public ExtentReports extent;
   public ExtentTest logger;
    //helps to generate the logs in test report.
    
    public void startReport(ITestContext textContext) {
    	String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//timestamp
    	String repName="Test-Report-"+timestamp+".html";
    	// initialize the HtmlReporter
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/"+repName);
        htmlReporter.loadXMLConfig(System.getProperty("user.dir")+"extent-config.xml");       
        //initialize ExtentReports and attach the HtmlReporter
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Host name", "localhost");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("user", "gaurav");
        
        //configuration items to change the look and feel
        //add content, manage tests etc
        htmlReporter.config().setDocumentTitle("Pabst Site Demo");
        htmlReporter.config().setReportName("Pabst UI Report");
        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
        htmlReporter.config().setTheme(Theme.STANDARD);
    }
     
    public void onTestSuccess(ITestResult tr)
    {
    	
    	logger=extent.createTest(tr.getName());
    	logger.log(Status.PASS,MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
    }
    
    public void onTestFaiure(ITestResult tr)
    {
    	
    	logger = extent.createTest(tr.getName());
    	logger.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
    	
    	String screenshotpath=System.getProperty("user.dir")+"\\Screenshots\\"+tr.getName()+".png";
    	File f=new File(screenshotpath);
    	
    	if(f.exists())
    	{
    		try {
    			logger.fail("Screenshots is below:" + logger.addScreenCaptureFromPath(screenshotpath));
    			
    		}
    		catch (IOException e)
    		{
    			e.printStackTrace();
    		}
    	}
    }
    

}
