package com.oneable.pageObjects;

import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.oneable.testcases.ReusableMethods;

public class ProvisioningOfMachinesPage3 {
	WebDriver driver;
	ReusableMethods rm= new ReusableMethods();

	public ProvisioningOfMachinesPage3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//span[text()='Provisioning Of Machines'])[1]")
	WebElement ProvisioningOfMachines;
	
	@FindBy(xpath="//input[contains(@class,'form-control')]")
	WebElement MachineName; 
	
	@FindBy(xpath="(//input[@class=\"form-control\"])[2]")
	WebElement PublicIpAddress;
	
	@FindBy(xpath="(//input[@class=\"form-control\"])[3]")
	WebElement PrivateIpAddress;
	
	@FindBy(xpath="//button[@class=\"btn bg_indgo createmachine-custom-button\"]")
	WebElement SelectProcessor;
	
	@FindBy(xpath="(//input[@class=\"form-control\"])[4]")
	WebElement HardDisk;
	
	@FindBy(xpath="//select[@name=\"machineHandleRam\"]")
	WebElement RamDropdown;
	
	@FindBy(xpath="(//select[contains(@class,'select-box')])[2]")
	WebElement ProcessorDropdown;
	
	@FindBy(xpath="(//select[@class=\"select-box\"])[3]")
	WebElement OperatingSystem;
	 
	@FindBy(xpath="(//select[@class=\"select-box\"])[4]")
	WebElement Location;
	
	@FindBy(xpath="(//input[@class=\"form-control\"])[5]")
	WebElement Plan;
	
	@FindBy(xpath="//textarea[@class=\"form-control\"]")
	WebElement Description;
	
	@FindBy(xpath="//button[text()='Next']")
	WebElement ClickNext;
	
	@FindBy(xpath="//input[@class=\"mr-2\"]")
	WebElement DomainExist;
	
	@FindBy(xpath="(//input[@class=\"form-control\"])[3]")
	WebElement DomainName;
	
	@FindBy(xpath="//button[text()=\"Next\"]")
	WebElement AddMachineToDomainNextButton;
	
	@FindBy(xpath="(//input[@name=\"machineProcureToolAddOrRemove\"])[6]")
	WebElement ProcureTool;
	
	@FindBy(xpath="//button[text()=\"Next\"]")
	WebElement ProcureToolNextButton;
	
	@FindBy(xpath="//input[@class=\"mr-2\"]")
	WebElement PublishRemoteApp;
	
	@FindBy(xpath="//button[text()=\"Submit\"]")
	WebElement ProvisioningTool;


    public void ClickProvisioningOfMachines() throws Exception
  {
    	if(ProvisioningOfMachines.isDisplayed())
    	{
    		System.out.println("pass");
    	}
    	else
    	{
    		System.out.println("fail");
    	}
    	Thread.sleep(3000);
    	 
//    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000)); // Maximum wait time of 10 seconds
//	    wait.until(ExpectedConditions.elementToBeClickable(ProvisioningOfMachinesModule));
	    ProvisioningOfMachines.click();

  }
    public void SetMachineName()
  {
    rm.type(MachineName,"dell");
	//MachineName.sendKeys("dell");
  }
    public void EnterPublicIpAddress() 
    {
    	rm.type(PublicIpAddress,"192.168.1.236" );
    	//PublicIpAddress.sendKeys("192.168.1.236");
    }
    public void EnterPrivateAddress()
    {
    	rm.type(PrivateIpAddress, "192.168.1.125");
    	//PrivateIpAddress.sendKeys("192.168.1.125");
    }
    public void ClickSelectProcessor()
    {
    	rm.click(SelectProcessor);
    	//SelectProcessor.click();
    }
    public void EnterHardDisk()
    {
    	rm.type(HardDisk, "500gb");
    	//HardDisk.sendKeys("500gb");
    }
    
    public void SelectRamDropdown()
    {
    	rm.selectByVisibleText(RamDropdown, "8GB");
    	//RamDropdown.sendKeys("8GB");
    }
    public void SelectProcessorDropdown()
    {
    	rm.selectByVisibleText(ProcessorDropdown, "I6 Dual Core");
    	//ProcessorDropdown.sendKeys("I6 Dual Core",Keys.ENTER);
    }
    public void SelectOperatingSystem()
    {
    	rm.selectByVisibleText(OperatingSystem,"Windows10");
    	//OperatingSystem.sendKeys("Windows10");
    }
    public void SelectLocation()
    {
    	rm.selectByVisibleText(Location,"America/Chicago" );
    	//Location.sendKeys("America/Chicago");
    }
    public void Setplan()
    {
    	rm.type(Plan, "3");
    	//Plan.sendKeys("3");
    }
    public void WriteDescription()
    {
    	rm.type(Description, "xyz" );
    	//Description.sendKeys("xyz");
    }
    public void ClickNextButton()
    {
    	rm.click(ClickNext);
    	//ClickNext.click();
    }
    public void DomainCheckButton()
    {
    	rm.click(DomainExist);
    	//DomainExist.click();
    }
    public void DomainNameText()
    {
    	rm.type(DomainName,"OjasOneableTesting");
    	//DomainName.sendKeys("OjasOneableTesting");
    }
    public void AddMachineDomainNext()
    {
    	rm.click(AddMachineToDomainNextButton);
    	//AddMachineToDomainNextButton.click();
    }
    public void SelectProcureTool()
    {
    	rm.click(ProcureTool);
    	//ProcureTool.click();
    }
    public void ProcureToolNext()
    {
    	rm.click(ProcureToolNextButton);
    	//ProcureToolNextButton.click();
    }
    public void ProvisioningPublishTool()
    {
    	rm.click(PublishRemoteApp);
    	//PublishRemoteApp.click();
    }
    public void ProvisionTool()
    {
    	rm.click(ProvisioningTool);
    	//ProvisioningTool.click();
    	
    }
    
  }
