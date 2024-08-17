package test;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.Baseclass;
import com.mystore.pageobject.Indexpage;

public class Dashborardpage extends Baseclass {
	
	Indexpage idxpg=new Indexpage();

	com.mystore.pageobject.dashboard ds = new com.mystore.pageobject.dashboard();
	//dashboard ds=new dashboard();

	@Parameters("browser")
	@BeforeTest(groups = { "Smoke", "Sanity", "Regression" })
	public void init(@Optional String browser) throws IOException, InterruptedException {
		//();
		//launchApp(browser);
		loadConfig(browser);
		Thread.sleep(200000);
	}
	@AfterTest(groups = { "Smoke", "Sanity", "Regression" })
	public void teardown() {
		driver.close();
	}
	
//	@Test(groups = {"Smoke", "Sanity", "Regression" })
//	public void login() throws Exception
//	{
//		idxpg.username();
//		Thread.sleep(1000);
//		idxpg.password();
//		Thread.sleep(1000);
//		idxpg.login();
//	}

	@Test(groups = { "Smoke", "Sanity", "Regression" })
	public void dashboard() {
		com.mystore.pageobject.dashboard.pageTitle();
	}

	@Test(groups = { "Smoke", "Sanity", "Regression" })
	public void verifymenu() throws InterruptedException {
		//ds.menu();
		Thread.sleep(1000);
		//ds.menuclosebutton();
	}

	@Test(groups = { "Smoke", "Sanity", "Regression" })
	public void verifyfilterbutton() throws InterruptedException {
		ds.filterbutton();
		Thread.sleep(1000);
		ds.filterztoafilter();
		Thread.sleep(1000);
		ds.filterbylowtohighprice();
		Thread.sleep(1000);
		ds.filterbyhightolowprice();
	}

	@Test(groups = { "Smoke", "Sanity", "Regression" })
	public void addtocart() throws InterruptedException {
//		ds.addtocart();
//		Thread.sleep(1000);
//		ds.remove();
	}
	
}
