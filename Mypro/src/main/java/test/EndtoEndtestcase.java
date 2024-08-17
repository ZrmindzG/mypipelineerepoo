package test;


import org.testng.annotations.Test;

import java.util.Map;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.Baseclass;
import com.mystore.dataprovider.DataProvider;
import com.mystore.pageobject.Cartpage;
import com.mystore.pageobject.Checkoutpage;
import com.mystore.pageobject.dashboard;

public class EndtoEndtestcase extends Baseclass{
	
	dashboard ds=new dashboard();
	Cartpage ct=new Cartpage();
	//Action act=new Action();
	private Checkoutpage chk;
	
	@Parameters("browser")
	@BeforeMethod(groups = { "Smoke", "Sanity", "Regression" })
	public void init(@Optional String browser) {
		loadConfig();
		lunchapp(browser);
	}

	@AfterTest(groups = { "Smoke", "Sanity", "Regression" })
	public void teardown() {
		driver.close();
	}
	
	@Test(groups= {"Smoke","Sanity","Regression"})
	public void verifydashboardpage() throws Exception
	{
		//verify user is in the dashboard page
		com.mystore.pageobject.dashboard.pageTitle();
		//verify the logo
		ds.verifylogo();
		
	}
	@Test(groups= {"Smoke","Sanity","Regression"})
	public void itemisaddedincart() throws InterruptedException
	{
		    //adding bags to the cart
			ds.addtocart();
			//click on the cart
			ct.yourcart();
			//click on the continue shopping
			ct.conbutton();
			//click on the checkout button
			ct.checkout();
	}
	@Test(groups= {"Regression","Sanity","Smoke"},dataProvider="checkoutdetails",dataProviderClass=DataProvider.class)
	public void customerdetails(Map<String,String>Hashmpvalu) throws Exception
	{
		chk.imfcheckoutpage(Hashmpvalu.get("FirstName"), 
		Hashmpvalu.get("LastName"), 
		Hashmpvalu.get("postalcode"));
		Thread.sleep(1000);
		chk.checkout();
		chk.finish();
		//verify use making the order successfull
		chk.verifytext();
		chk.backtohomepage();
	}
	
	

}
