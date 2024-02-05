package com.oneable.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneable.testcases.ReusableMethods;

public class MachineRequestsModule6 {
	WebDriver driver;
	ReusableMethods rm= new ReusableMethods();
	public MachineRequestsModule6(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[normalize-space()='Machine Requests']")
	WebElement MachineRequestsPage;
	
	@FindBy(name="machineNameSearch")
	WebElement MachineRequestSearchBox;
	
	public void MachineRequests() throws Throwable
	{
		Thread.sleep(3000);
		rm.click(MachineRequestsPage);
		//MachineRequestsPage.click();
	}
	public void MachineRequestSearch()
	{
		rm.type(MachineRequestSearchBox,"Hp" );
		//MachineRequestSearchBox.sendKeys("Hp");
	}

}
