package com.Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage {
public WebDriver driver;
	
	public Checkoutpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	
	}
	@FindBy(xpath="//button[@name='checkout']")
	WebElement clickcheckout;

	public Productspage gotoclickcheckout()
{
		clickcheckout.click();
		return new Productspage(driver);
		}
}
