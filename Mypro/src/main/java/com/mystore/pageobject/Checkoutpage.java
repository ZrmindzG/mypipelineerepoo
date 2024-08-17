package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.mystore.actiondriver.ActionClass;
import com.mystore.base.Baseclass;

public class Checkoutpage extends Baseclass {
	
	ActionClass act=new ActionClass();
	
	@FindBy(xpath="//div[@class='header_secondary_container']/child::span[@class='header_secondary_container']")
	private WebElement checkoutInformationtxt;
	
	@FindBy(xpath="//input[@class='input_error form_input' and @id='first-name']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@class='input_error form_input' and @id='last-name']")
     private WebElement lastname;
	
	@FindBy(xpath="//input[@class='input_error form_input' and @id='postal-code']")
    private WebElement postalcode;
	
	@FindBy(xpath="//input[@type='submit' and @id='continue']")
	private WebElement continuebutton;
	
	@FindBy(xpath="//button[@class='btn btn_secondary back btn_medium cart_cancel_link' and @id='cancel']")
	private WebElement cancel;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitbutton;
	
	@FindBy(xpath="//input[@class='input_error form_input' and @id='first-name']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@class='input_error form_input' and @id='last-name']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@class='input_error form_input' and @id='postal-code']")
	private WebElement zipcode;
	
	@FindBy(xpath="//button[@class='btn btn_action btn_medium cart_button' and @name='finish']")
	private WebElement finishbutton;
	
	@FindBy(xpath="//h2[@class='complete-header' and contains(text(),'Thank you for your order!')]")
	private WebElement thankyouorder;
	
	@FindBy(xpath="//button[@class='btn btn_primary btn_small']")
	private WebElement gobacktohomepage;
	
	public Checkoutpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void imfcheckoutpage(String FName,String LName,String Pcode)
	{
		act.type(firstName, FName);
		act.type(lastName, LName);
		act.type(zipcode, Pcode);
	}
	
	public void checkout()
	{
		submitbutton.click();
	}
	
	public void finish()
	{
		finishbutton.click();
	}
    public void verifytext()
    {
    	String expected=thankyouorder.getText();
    	String actual="Thank you for your order!";
    	Assert.assertEquals(actual, expected);
    }
    public void backtohomepage()
    {
    	gobacktohomepage.click();
    }
    

}
