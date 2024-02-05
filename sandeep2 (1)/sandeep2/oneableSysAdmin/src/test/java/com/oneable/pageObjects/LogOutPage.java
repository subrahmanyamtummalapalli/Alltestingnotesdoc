package com.oneable.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	WebDriver driver;
	public LogOutPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//span[text()='Logout']")
	WebElement Logout;
	
	@FindBy(xpath="//button[@name=\"logout-modalGarage\"]")
	WebElement yesBtn;
	
	public void LogoutLink()
	{
		Logout.click();
	}
	public void clickyes()
	{
		yesBtn.click();
	}
	

}
