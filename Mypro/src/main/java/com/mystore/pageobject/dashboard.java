package com.mystore.pageobject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.mystore.actiondriver.ActionClass;
import com.mystore.base.Baseclass;

public class dashboard extends Baseclass {

	@FindBy(xpath = "//button[@id='react-burger-menu-btn']/parent::div[@class='bm-burger-button']")
	WebElement menu;

	@FindBy(xpath = "//title[contains(text(),'Swag Labs')]")
	static WebElement pagetile;

	@FindBy(xpath = "//button[@class='btn btn_primary btn_small btn_inventory ' and @id='add-to-cart-sauce-labs-backpack']")
	WebElement addtocart;

	@FindBy(xpath = "//button[@class='btn btn_secondary btn_small btn_inventory ' and @id='remove-sauce-labs-backpack']")
	WebElement removebutton;

	@FindBy(xpath = "//select[@class='product_sort_container']")
	WebElement filterbutton;

	@FindBy(xpath = "//select[@class='product_sort_container']//option")
	WebElement alldropdown;

	@FindBy(xpath = "//select[@class='product_sort_container']/option[@value='az']")
	WebElement filteratoz;

	@FindBy(xpath = "//select[@class='product_sort_container']/option[@value='za']")
	WebElement filterztoa;

	@FindBy(xpath = "//select[@class='product_sort_container']/option[@value='lohi']")
	WebElement filterbylowtohighprice;

	@FindBy(xpath = "//select[@class='product_sort_container']/option[@value='hilo']")
	WebElement filterbyhightolowprice;

	@FindBy(xpath = "//span[@class='title']")
	WebElement productTitle;
	
	@FindBy(xpath="//button[@id='react-burger-cross-btn']")
	WebElement closebutton;
	
	@FindBy(xpath="//div[@class='app_logo']")
	WebElement logo;

	public dashboard() {
		PageFactory.initElements(driver, this);
	}

	public static void pageTitle() {

		//ActionClass.isDisplayed(driver, pagetile);

	}

	public void menu() {
		menu.click();
	}

	public void addtocart() {
		addtocart.click();
	}

	public void remove() {
		removebutton.click();
	}

	public void filterbutton() {
		filterbutton.click();
	}

	public void alldropdown() {
		alldropdown.click();
	}

	public void filteratozfilter() {
		filteratoz.click();
	}

	public void filterztoafilter() {
		filterztoa.click();
	}

	public void filterbylowtohighprice() {
		filterbylowtohighprice.click();
	}

	public void filterbyhightolowprice() {
		filterbyhightolowprice.click();
	}

	public void productTitle() {
		productTitle.click();
	}
	 
	public void menuclosebutton()
	{
		closebutton.click();	
	}
	public void verifylogo() throws Exception
	{
		String expected=logo.getText();
		
		Thread.sleep(1000);
		
		String actual="Swag Labs";
		
		Thread.sleep(1000);
		
	    Assert.assertEquals(actual, expected);
	    
	}
	
}
