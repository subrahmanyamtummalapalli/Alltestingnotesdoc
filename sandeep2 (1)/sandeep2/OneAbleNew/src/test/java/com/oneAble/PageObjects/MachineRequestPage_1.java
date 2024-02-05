package com.oneAble.PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MachineRequestPage_1 {
	static WebDriver driver;
	public MachineRequestPage_1(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/div[1]/div/ul/li[5]/span")
	WebElement machReqBtn;
	
	@FindBy(name="machineNameSearch")
	WebElement MacSerchField;
	
	@FindBy(name="machineCloseRequest")
	WebElement MacActAttribute;
	
	public void machineRequest()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000)); // Maximum wait time of 10 seconds
	    wait.until(ExpectedConditions.elementToBeClickable(machReqBtn));
		machReqBtn.click();
	}
	public void machineSearch(String machineName)
	{
		MacSerchField.sendKeys(machineName);
	}
//	public void closeRequest()
//	{
//		MacActAttribute.click();
//	}

}
