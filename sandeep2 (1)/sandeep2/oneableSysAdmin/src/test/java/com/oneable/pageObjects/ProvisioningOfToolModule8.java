package com.oneable.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProvisioningOfToolModule8 
{
	WebDriver driver;
	public ProvisioningOfToolModule8(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[contains(text(),'Provisioning Of Tool')]")
	WebElement ProvisioningOfToolModule;
	
	@FindBy(xpath="//input[@name=\"search_name_input\" or @id=\"multiselectToolList_input\"]")
	WebElement ToolName;
	
	@FindBy(xpath="//input[@name=\"toolSockethost\"]")
	WebElement SoketHost;
	
	@FindBy(xpath="//input[@name=\"procuretoolSocketPort\"]")
	WebElement SoketPort;
	
	@FindBy(xpath="//select[@name=\"toolProtocol\"]")
	WebElement Protocol;
	
	@FindBy(xpath="//input[@name=\"procureToolPort\"]")
	WebElement Port;
	
	@FindBy(xpath="//select[@name=\"security\"]")
	WebElement Security;
	
	@FindBy(xpath="//input[@name=\"procureToolDomain\"]")
	WebElement Domain;
	
	@FindBy(xpath="//input[@name=\"toolHostname\"]")
	WebElement HostName;
	
	@FindBy(xpath="//button[@name=\"toolDetailsNext\"]")
	WebElement Next;
	
	@FindBy(xpath="//input[@name=\"EmployeeListSearch\"]")
	WebElement PublishToolSearch;
	
	@FindBy(xpath="//input[@name=\"addUserOrRemoveUserCheck\"]")
	WebElement PublishToolCheck;
	
	@FindBy(xpath="//button[@name=\"toolSubmit\"]")
	WebElement PublishToolSubmit;
	

	public void ProvisioningOfToolPage()
	{
		ProvisioningOfToolModule.click();
	}
	public void ToolNameDropdown() {
		ToolName.sendKeys("Chrome",Keys.ENTER);
	}
	public void SoketHostTextBox(String str)
	{
		SoketHost.sendKeys(str);
	}
	public void SoketPortTeBox(String str)
	{
		SoketPort.sendKeys(str);
	}
	public void ProtocalDropDown(String str)
	{
		Protocol.sendKeys(str);
	}
	public void PortTextBox(String str)
	{
		Port.sendKeys(str);
	}
	public void SecurityDropDown(String str)
	{
		Security.sendKeys(str);
	}
	public void DomainTextBox(String str)
	{
		Domain.sendKeys(str);
	}
	public void HostNameText(String str)
	{
		HostName.sendKeys(str);
	}
	public void NextButton()
	{
		Next.click();
	}
	public void PublishToolSearchBox(String str)
	{
		PublishToolSearch.sendKeys(str);
	}
	public void PublishToolCheckBox()
	{
		PublishToolCheck.click();
	}
	public void PublishToolSubmitButton()
	{
		PublishToolSubmit.click();
	}

}
