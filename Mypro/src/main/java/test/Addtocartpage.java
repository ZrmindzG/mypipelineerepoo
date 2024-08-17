package test;

import org.testng.annotations.Test;

import java.util.HashMap;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.Baseclass;
//import com.mystore.dataprovider.DataProvider;
import com.mystore.dataprovider.DataProviders;
import com.mystore.pageobject.Cartpage;
import com.mystore.pageobject.Checkoutpage;
import com.mystore.pageobject.dashboard;

public class Addtocartpage extends Baseclass{
	
	dashboard ds=new dashboard();
	Cartpage ct=new Cartpage();
	private Checkoutpage chk;
	
	@Parameters("browser")
	@BeforeMethod(groups = { "Smoke", "Sanity", "Regression" })
	public void init(@Optional String browser) {
		loadConfig(null);
		//lunchapp(browser);
	}

//	@AfterTest(groups = { "Smoke", "Sanity", "Regression" })
//	public void teardown() {
//		driver.close();
//	}
	@Test(groups = { "Smoke", "Sanity", "Regression" })
	public void verifytheaddtocart() throws InterruptedException
	{   //adding bags to the cart
		ds.addtocart();
		//click on the cart
		ct.yourcart();
		//click on the continue shopping
		ct.conbutton();
		//click on the checkout button
		ct.checkout();
	}
	@Test(groups="Regression", dataProvider="checkoutdetails",dataProviderClass = DataProviders.class)
	public void checkoutdetails(HashMap<String,String> hashMapValue) throws InterruptedException
	{
		chk.imfcheckoutpage(
		hashMapValue.get("FirstName"),
	    hashMapValue.get("LastName"),
		hashMapValue.get("Zip/Postal Code")
		   );
		Thread.sleep(1000);
		chk.checkout();
		chk.finish();
		//verify use making the order successfull
		chk.verifytext();
		chk.backtohomepage();
		
	}

}
