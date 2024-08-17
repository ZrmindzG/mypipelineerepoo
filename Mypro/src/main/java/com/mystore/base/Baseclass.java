package com.mystore.base;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mystore.actiondriver.ActionClass;
import com.mystore.dataprovider.DataProviders;
import com.mystore.utility.ExtentManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static Properties prop;
	public static WebDriver driver;
	public static FileReader fr;
    @BeforeTest
	public static void loadConfig() {
		try {
		if(driver==null)
		{   prop =new Properties();
			FileReader fr=new FileReader("E:\\testworkspace\\Mypro\\configuration\\config.properties");
			prop.load(fr);
		}
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
    }
		public void launchApp(String browser) throws Exception {
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
		  WebDriverManager.chromedriver().setup();
		  Thread.sleep(1000);
		  driver= new ChromeDriver();
		  Thread.sleep(5000);
		  driver.get(prop.getProperty("url"));//properties
		  Thread.sleep(2000);
		}
//		if(prop.getProperty("browser").equalsIgnoreCase("Firefox"))
//	       {
//				//WebDriverManager.firefoxdriver().setup();
//				driver =new FirefoxDriver(); 
//				driver.get(prop.getProperty("url"));
//	       }
//		else if(prop.getProperty("browser").equalsIgnoreCase("edgebrowser"))
//			{
//				//WebDriverManager.edgedriver().setup();
//				driver=new EdgeDriver();
//				driver.get(prop.getProperty("url"));
//			}
}
    
//    public static WebDriver getDriver() {
//        return driver;
//    }
    
	@AfterTest
	public void teardown()
	{
		if(driver!=null)
		{
			driver.close();
			System.out.println("tear down successful");
			driver=null;
		}
		
	}
	
	

}


	



