package com.mystore.pageobject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mystore.actiondriver.ActionClass;
import com.mystore.base.Baseclass;

public class Loginpage extends Baseclass{
	
	ActionClass act=new ActionClass();
	//WebDriverwait wt=new WebDriverwait()
	
	@FindBy(xpath="//input[@class='input_error form_input' and @id='user-name']")
	public WebElement username;
	
	@FindBy(xpath="//input[@class='input_error form_input' and @id='password']")
	public WebElement password;
	
	@FindBy(xpath="//input[@type='submit' and @id='login-button']")
	public WebElement login;
	
//	@FindBy(xpath="//input[@class='oxd-input oxd-input--active oxd-input--error' and @name='username']")
//	public WebElement username;
//	
//	@FindBy(xpath="//input[@class='oxd-input oxd-input--active' and @name='password']")
//	public WebElement password;
//	
//	@FindBy(xpath="//button[@type='submit' and @class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
//	public WebElement login;
	
	public Loginpage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	public void loginpage1()
	{
//		WebDriverWait wdt=new WebDriverWait(driver,Duration.ofSeconds(10));
//		wdt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='input_error form_input' and @id='user-name']")));
		//wdt.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(username)));
		username.clear();
		username.sendKeys("Admin");
     	password.clear();
		password.sendKeys("admin123");
		login.click();
	}
	
	
	
//	public void loginpage1(String unmae,String passwrd) throws Exception
//	{
//		act.type(username, unmae);
//		Thread.sleep(1000);
//		act.type(password, passwrd);
//		Thread.sleep(1000);
//		act.click(driver, login);   
//		
//	}
}
