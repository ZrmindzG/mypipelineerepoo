package com.mystore.utility;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.mystore.base.Baseclass;

public class ExtentManager {
	
	public static ExtentHtmlReporter htmlreporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static void setreport()
	{
	htmlreporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/Extentreport/"+"myreport_"+
	Baseclass.getCurrentTime()+".html");
	
	htmlreporter.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml");
	
	extent =new ExtentReports();
	
	extent.attachReporter(htmlreporter);
	
	extent.setSystemInfo("hostname", "myhost");
	
	extent.setSystemInfo("projectname", "myproject");
	
	extent.setSystemInfo("tester", "omprabhu");
	
	extent.setSystemInfo("OS", "window");
	
	extent.setSystemInfo("browser", "chrome");
	
   }
	
	public static void endreport()
	{
		extent.flush();
	}
	

}
