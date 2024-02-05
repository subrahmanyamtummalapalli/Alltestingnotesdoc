package com.oneable.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolDeAllocationModule10 {
	WebDriver driver;
	public ToolDeAllocationModule10(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		}
	@FindBy(xpath="//span[text()=\"Tool De-Allocation\"]")
	WebElement DeAllocationPage;
	
	@FindBy(xpath="//input[@name=\"toolRequestListSearch\"]")
	WebElement DeAllocationSearch;
	
	public void DeAloocationModule()
	{
		DeAllocationPage.click();
	}
	public void DeAllocationSearchBox(String str)
	{
		DeAllocationSearch.sendKeys(str);
	}

}
