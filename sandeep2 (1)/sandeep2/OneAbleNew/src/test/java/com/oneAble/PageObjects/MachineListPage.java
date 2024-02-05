package com.oneAble.PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MachineListPage {
	WebDriver driver;
	ReUsableMethods rm= new ReUsableMethods();
	public MachineListPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//span[normalize-space()='Machine List']")
	WebElement machineListBtn;
	
	@FindBy(xpath="//input[@class=\"custom-form-control input-focus-active\"]")
	WebElement MachineListGarageSearch;
	
	@FindBy(xpath="//span[@class=\"slider round\"]")
	WebElement deActivateRound;
	
	@FindBy(name="machineActDeactSubmit")
	WebElement deActiveBtn;
	
	@FindBy(xpath="//img[@class=\"w30 mx-1 cursor-pointer\"]")
	WebElement viewBtn;
//	
//	@FindBy(xpath="//p[text()=\"13\"]")
//	WebElement CountOfMachine;

	
	public void machineList1()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000)); // Maximum wait time of 10 seconds
	    wait.until(ExpectedConditions.elementToBeClickable(machineListBtn));
	    machineListBtn.click();
	}
	public void clickOnSearch(String name)
	{
		//rm.type(MachineListGarageSearch,"dell");
		MachineListGarageSearch.sendKeys(name);
	}
	public void activeDeActive()
	{
		deActivateRound.click();
		deActiveBtn.click();
		//viewBtn.click();
	}

}
