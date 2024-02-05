package com.oneAble.PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MachineAllocatePage_2 {
	WebDriver driver;
	public MachineAllocatePage_2(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Machine Allocation')]")
	//span[normalize-space()='Machine Allocation']
	//xpath="//span[contains(text(),'Machine Allocation')]"
	WebElement MachineAlloBtn;
	
	@FindBy(name="machineNameSearch")
	WebElement MachineSearchBox;
	
	public void machineAllow() throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000)); // Maximum wait time of 10 seconds
	    wait.until(ExpectedConditions.elementToBeClickable(MachineAlloBtn));
		MachineAlloBtn.click();
	}
	public void searchField(String name)
	{
		MachineSearchBox.sendKeys(name);
	}

}
