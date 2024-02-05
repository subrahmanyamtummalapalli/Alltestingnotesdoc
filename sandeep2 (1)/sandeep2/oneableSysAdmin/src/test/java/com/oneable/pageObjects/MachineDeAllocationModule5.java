package com.oneable.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneable.testcases.ReusableMethods;

public class MachineDeAllocationModule5 {
	WebDriver driver;
	ReusableMethods rm= new ReusableMethods();
	public MachineDeAllocationModule5(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[contains(text(),'De-Allocation')]")
	WebElement MachineDeAllocation;
	
	@FindBy(xpath="//input[contains(@name,'machineNameSearch')]")
	WebElement SearchBox;
	
	public void MachineDeAllocationPage()
	{
		rm.click(MachineDeAllocation);
		//MachineDeAllocation.click();
	}
	public void MachineSearch()
	{
		rm.type(SearchBox,"Dell" );
		//SearchBox.sendKeys("Dell");
	}

}
