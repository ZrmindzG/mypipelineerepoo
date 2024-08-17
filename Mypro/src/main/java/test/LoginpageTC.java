package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.mystore.base.Baseclass;
import com.mystore.dataprovider.DataProviders;
//import com.mystore.dataprovider.DataProvider;
import com.mystore.pageobject.Indexpage;
import com.mystore.pageobject.Loginpage;


public class LoginpageTC extends Baseclass {
	
	 Loginpage lg=new Loginpage(Baseclass.driver);
	
	@BeforeMethod(groups = { "Smoke", "Sanity", "Regression" })
	public void init(@Optional String browser) throws Exception {
		
		Baseclass.loadConfig();
		Thread.sleep(1000);
		launchApp(browser);
		
	}
	@Test(groups = { "Smoke", "Sanity", "Regression" }, dataProvider="Credentials", dataProviderClass=DataProviders.class)
	public void loginm(String Username,String Password) throws Exception
	{
		lg.loginpage1();
		//lg.loginpage1(Username, Password);
		
	}
	
	
//	@FindBy(xpath="//input[@class='input_error form_input' and @id='user-name']")
//	public WebElement username;
//	
//	@FindBy(xpath="//input[@class='input_error form_input' and @id='password']")
//	public WebElement password;
//	
//	@FindBy(xpath="//input[@type='submit' and @id='login-button']")
//	public WebElement login;
//	
//	WebDriver driver;
	
//	public LoginpageTC(WebDriver driver)
//	{
//		this.driver=driver;
//		PageFactory.initElements(driver, this);
//	}
//	public LoginpageTC()
//	{
//		PageFactory.initElements(driver, this);
//	}
	
	//Indexpage idxpg=new Indexpage();
	
//	@Parameters("browser")
//	@BeforeTest(groups= { "smoke","sanity","Regression"})
//	public void init(@Optional String browser) {
//		try {
//		loadConfig(browser);
//		Thread.sleep(1000);
//		}
//		catch(Exception e)
//		{
//			e.getStackTrace();
//		}
//		
//	}
//	@AfterTest(groups= {"smoke","sanity","Regression"})
//	public void teardown()
//	{
//		driver.close();
//	}
	
//	@Test(groups= {"smoke","sanity"}, dataProvider="Credentials", dataProviderClass = DataProviders.class)
//	public void loginmetod(String Username,String Password) throws Exception
//	{
//		
//		username.clear();
//		username.sendKeys(Username);;
//		Thread.sleep(3000);
//		password.clear();
//		password.sendKeys(Password);;
//		Thread.sleep(1000);
//		
//		System.out.println(Username);
//		System.out.println(Password);
//		idxpg.username(Username);
//		Thread.sleep(1000);
//		idxpg.password(Password);
//		Thread.sleep(1000);
//		idxpg.login();
	
			
//	
//	
//	
//
}

