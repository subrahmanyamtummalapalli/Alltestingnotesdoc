package com.oneable.pageObjects;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneable.testcases.ReusableMethods;
//import com.oneable.utility.Log4j;

public class MachineAllocationModule4
{
	WebDriver driver;
	ReusableMethods rm= new ReusableMethods();
	//Log4j lg=new Log4j();
	public MachineAllocationModule4(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[contains(text(),'Machine Allocation')]")
	WebElement MachineAllocation;
	
	@FindBy(xpath="//input[contains(@class,'custom-form-control input-focus-active')]")
	WebElement SearchButton;
	
	public void ClickOnMachineAllocation() throws Exception
	{
		rm.click(MachineAllocation);
		//MachineAllocation.click();
		//lg.info("Clicked on machine allocation module");
		Thread.sleep(2000);
		rm.type(SearchButton,"Dell" );
		//SearchButton.sendKeys("Dell");
		//lg.info("Clicked on search box ");
	}
}
