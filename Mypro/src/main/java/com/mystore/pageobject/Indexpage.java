package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.ActionClass;
import com.mystore.base.Baseclass;

public class Indexpage extends Baseclass {
	
	ActionClass act=new ActionClass();
	
//	@FindBy(xpath="//input[@class='input_error form_input' and @id='user-name']")
//	private WebElement username;
//	
//	@FindBy(xpath="//input[@class='input_error form_input' and @id='password']")
//	private WebElement password;
//	
	@FindBy(xpath="//input[@type='submit' and @id='login-button']")
	private WebElement login;
	
	@FindBy(xpath="//button[contains(text(), 'Open Menu')]")
	private WebElement menubutton;
	
	@FindBy(xpath="//a[@id='inventory_sidebar_link' and @class='bm-item menu-item']")
	private WebElement about;
	
	@FindBy(xpath="//a[@id='logout_sidebar_link' and @class='bm-item menu-item']")
	private WebElement logout;
	
	@FindBy(xpath="//a[@id='reset_sidebar_link' and @class='bm-item menu-item']")
	private WebElement resetlink;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']/parent::div[@id='shopping_cart_container']")
	private WebElement cart;
	
	@FindBy(xpath="//span[@class='select_container']")
	private WebElement filter;
	
	public Indexpage()
	{
        PageFactory.initElements(driver, this);		
	}
//	public void username(String Username) throws Exception
//	{
//		username.clear();
//		username.sendKeys(Username);;
//		Thread.sleep(3000);
//	}
//	public void password(String Password) throws Exception
//	{
//		password.clear();
//		password.sendKeys(Password);;
//		Thread.sleep(1000);
//	}
	public void login() throws InterruptedException
	{
		login.click();
		Thread.sleep(1000);
	}
	public dashboard clickonMenu() {
		act.click(driver, login);
		return new dashboard();
	}
	
	public void cartbutton()
	{
		cart.click();
	}

}
