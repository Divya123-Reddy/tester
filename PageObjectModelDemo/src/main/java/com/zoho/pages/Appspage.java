package com.zoho.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Appspage {
	public WebDriver driver;
	
	public  Appspage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[@class='_logo-crm _logo-x96 zod-app-logo']")
	WebElement clickCRM;
	
	
	public void gotoclickCRM()
	{
		clickCRM.click();
		
	}
}
