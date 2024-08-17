package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.ActionClass;
import com.mystore.base.Baseclass;

public class Cartpage extends Baseclass{
	
	ActionClass act=new ActionClass();
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']/parent::a[@class='shopping_cart_link']")
	private WebElement cart;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn' and contains(text(),'Open Menu')]")
	private WebElement continuebutton;
	
	@FindBy(xpath="//button[@class='btn btn_action btn_medium checkout_button ' and @name='checkout']")
	private WebElement Checkout;
	
	@FindBy(xpath="//button[@class='btn btn_secondary btn_small cart_button' and @name='remove-sauce-labs-backpack']")
	private WebElement remove;
	
	@FindBy(xpath="//div[@class='inventory_item_name']")
	private WebElement itemsincart;
	
	public Cartpage()
	{
		PageFactory.initElements(driver, this);
	}

	public void  yourcart()
	{
		act.isDisplayed(driver, cart);
		cart.click();
		
	}
	public void conbutton() throws InterruptedException
	{
		act.isDisplayed(driver, continuebutton);
		continuebutton.click();
		Thread.sleep(1000);
		driver.navigate().back();
		
	}
	public void checkout()
	{
		Checkout.click();
	}
	public void itemcart() throws InterruptedException
	{
		itemsincart.click();
		Thread.sleep(1000);
		driver.navigate().back();
	}
	
	
	
}
