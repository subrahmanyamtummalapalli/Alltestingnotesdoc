package com.oneable.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestToolModule11 
{
	WebDriver driver;
	public RequestToolModule11(WebDriver driver)
	{
		PageFactory.initElements(driver,this);	
	}
	
	@FindBy(xpath="//span[text()='Request Tools']")
	WebElement RequestToolPage;
	
	@FindBy(xpath="//input[@name=\"toolRequestListSearch\"]")
	WebElement RequestToolSearch;
	
	//For Logout
	
//	@FindBy(xpath="//span[text()='Logout']")
//	WebElement Logout;
	
	public void RequestToolModulePage()
	{
		RequestToolPage.click();
	}
	public void RequestToolSearchBox(String str)
	{
		RequestToolSearch.sendKeys(str);
	}
//	public void LogoutLink()
//	{
//		Logout.click();
//	}
	

}
