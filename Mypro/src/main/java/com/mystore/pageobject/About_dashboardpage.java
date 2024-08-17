package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.mystore.base.Baseclass;

public class About_dashboardpage extends Baseclass {
	
	@FindBy(id="react-burger-menu-btn")
	private WebElement menubutton;
	
	@FindBy(xpath="//a[@id='about_sidebar_link']")
	private WebElement about;
	
	@FindBy(xpath="//div[@class='MuiBox-root css-d0uhtl']/parent::div//span[contains(text(),'Products')]")
	private WebElement product;
	
	@FindBy(xpath="//div[@class='MuiBox-root css-d0uhtl']/parent::div//span[contains(text(),'Solutions')]")
	private WebElement solutions;
	
	@FindBy(xpath="//a//span[contains(text(),'Pricing')]")
	private WebElement pricing;
	
	@FindBy(xpath="//div[@class='MuiBox-root css-d0uhtl']/parent::div//span[contains(text(),'Developers')]")
	private WebElement developers;
	
	@FindBy(xpath="//div[@class='MuiBox-root css-d0uhtl']/parent::div//span[contains(text(),'Resources')]")
	private WebElement Resources;
	
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textDark MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-text MuiButton-textDark MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-disableElevation css-zaj0tr']")
	private WebElement signin;
	
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedDark MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-outlined MuiButton-outlinedDark MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-disableElevation css-1r365wf']")
	private WebElement webdemo;
	
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedAccentGreen MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedAccentGreen MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation css-1fbtofq']")
    private WebElement tryitfree;
	
	
	
	
	
	
	

}
