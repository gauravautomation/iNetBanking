package com.iNetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class ReadConfig {
		
	Properties pro;
	
	
	public ReadConfig()
	{
		File src= new File("./Configuration/config.properties");
	     try {
	           	FileInputStream fileip=new FileInputStream(src);  
	      
		        pro=new Properties();  
		        pro.load(fileip);
		    }
	     catch( Exception e)
	     {
	    	   System.out.println("Exception is "+ e.getMessage());
	     }
	     
	}
		    public String getURL()
		    {
	              String URL= pro.getProperty("BaseURL");
	              return URL;
		    }
		    public String getUN()
		    {
	              String UserName= pro.getProperty("UserName");
	              return UserName;
		    }
		    public String getPWD()
		    {	     
		    	String PWD= pro.getProperty("Password");
		    	return PWD;
		    	
		    }
		    
		    public String getChromePath()
		    {	     
		    	String chromepath= pro.getProperty("Chromepath");
		    	return chromepath;
		    }
		    
		    public String getFirefoxPath()
		    {	     
		    	String firefoxpath= pro.getProperty("Firefoxpath");
		    	return firefoxpath;
		    }
		    public String getIEPath()
		    {	     
		    	String iepath= pro.getProperty("iepath");
		    	return iepath;
		    }

	
	}
	
	
