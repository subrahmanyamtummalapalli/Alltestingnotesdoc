package com.oneable.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.oneable.testcases.ReusableMethods;

public class MachineListGaragePage2 
{
	WebDriver driver;
	ReusableMethods rm= new ReusableMethods();
	public MachineListGaragePage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath="//span[text()=\"Machine List\"]")
//	WebElement machineListClick;
//	
//	@FindBy(xpath="//p[text()=\"13\"]")
//	WebElement CountOfMachine;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/label[1]/span[1]")
	WebElement roundBar;
	
	@FindBy(name="machineActDeactSubmit")
	WebElement deActivateButton;
	
	@FindBy(xpath = "(//span[text()='Machine List'])[1]")
	WebElement machineList;
	
	@FindBy(xpath = "//input[@placeholder=\"Search\"]")
	WebElement MachineGarageSearch;
	
	public void clickMachineListButton() throws InterruptedException
	{
		machineList.click();
		Thread.sleep(2000);
	}
//
//	public boolean countmachine()
//	{
//		boolean display = rm.display(driver, CountOfMachine);
//		System.out.println("displayed");
//		return display;
//	}
	public void clickSearch() throws InterruptedException
	{
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000)); // Maximum wait time of 10 seconds
//	    wait.until(ExpectedConditions.elementToBeClickable(MachineListGarageSearch));
//		rm.type(MachineListGarageSearch,"dell");
		//MachineListGarageSearch.sendKeys("dell");
		MachineGarageSearch.click();
		MachineGarageSearch.sendKeys("dell");
		Thread.sleep(2000);
	}
	public void clickRoundBar()
	{
		roundBar.click();
	}
	public void clickDeactive()
	{
		deActivateButton.click();
	}

}
