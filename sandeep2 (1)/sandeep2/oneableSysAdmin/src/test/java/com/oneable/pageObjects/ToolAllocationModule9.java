package com.oneable.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolAllocationModule9 {
	WebDriver driver;
	public ToolAllocationModule9(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//span[text()='Tool Allocation'])[1]")
	WebElement ToolAllocation;
	
	@FindBy(xpath="//input[@name=\"toolRequestListSearch\"]")
	WebElement ToolAllocationSearch;
	
	public void ToolAllocationPage()
	{
		ToolAllocation.click();
	}
	public void ToolAllocationSearchBox(String str)
	{
		ToolAllocationSearch.sendKeys(str);
	}

}
