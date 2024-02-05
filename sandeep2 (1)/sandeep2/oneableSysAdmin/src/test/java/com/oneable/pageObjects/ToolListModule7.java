package com.oneable.pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneable.testcases.ReusableMethods;

public class ToolListModule7 
{
	WebDriver driver;
	ReusableMethods rm= new ReusableMethods();
	
	public ToolListModule7(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[contains(text(),'Tool List')]")
	WebElement ToolListPage;
	
	@FindBy(xpath="//input[contains(@name,\"toolNameSearch\")]")
	WebElement ToolSearch;
	
	@FindBy(xpath="//div[contains(@class,\"media mb-0 d-flex align-items-center\")]")
	WebElement FirefoxApplication;
	
	@FindBy(xpath="//i[contains(@class,\"fa fa-arrow-left font-size-16 mr-2 \")]")
	WebElement NavigateToback;
	
	@FindBy(xpath="//input[@type=\"checkbox\"]//following::span[@class=\"slider round\"]")
	WebElement ToggleButton; 
	
	@FindBy(xpath="//img[@class=\"mx-2 w30 cursor-pointer\" or @id=\"createToolHandler\"]")
	WebElement EditOption;
	
	@FindBy(xpath="//input[@name=\"toolListRemoteApp\"]")
	WebElement RemoteAppField;
	
	@FindBy(xpath="//button[@name=\"toolCreateSubmit\"]")
	WebElement SubmitButton;
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]//following::span[@class='slider round']")
	WebElement Toggle;
	
	//Create tool
	@FindBy(id="toolCreatebtn")
	WebElement CreateTools;
	
	@FindBy(xpath="//input[@name=\"ToolListNamecreate\"]")
	WebElement ToolName;
	
	@FindBy(xpath="//input[@name=\"toolListRemoteApp\"]")
	WebElement RemoteApp;
	
	@FindBy(xpath="//textarea[@name=\"toolListDescription\"]")
	WebElement Description;
	
	@FindBy(xpath="//img[@class=\"upload_drive_img\" or id=\"img\"]")
	WebElement Upload;
	
	@FindBy(xpath="//button[@name=\"toolCreateSubmit\"]")
	WebElement Submit;
	
	@FindBy(xpath="//*[@id=\"toolCreateCloserModal\"]/i")
	WebElement Cancel;
	
	
	
	public void ToolList()
	{
		rm.click(ToolListPage);
	}
	public void ToolSearchBox(String str)
	{
		rm.type(ToolSearch, str);
	}
	public void FirefoxApp()
	{
		FirefoxApplication.click();
	}
//	public void NavigateBackToPreviousPage()
//	{
//		NavigateToback.click();
//	}
//	public void ClickToggleButton()
//	{
//		ToggleButton.click();
//	}
//	public void Edit()
//	{
//		EditOption.click();
//	}
//	public void RemoteappEditing(String str)
//	{
//		RemoteAppField.clear();
//		RemoteAppField.sendKeys(str);
//	}
//	public void Submit()
//	{
//		SubmitButton.click();
//	}
//	public void ClickToggle()
//	{
//		Toggle.click();
//	}
	
	
	
	public void CreateTool()
	{
		CreateTools.click();
	}
	public void EnterToolName(String str)
	{
		ToolName.sendKeys(str);
	}
	public void EnterRemoteApp(String str)
	{
		RemoteApp.sendKeys(str);
	}
	public void CreateToolDescription(String str)
	{
		Description.sendKeys(str);
	}	
	public void file() throws AWTException
	{	
		
		//Upload a file using Robot class
		Upload.click();
		Robot rb=new Robot();
		rb.delay(2000);
		//put path to file in a clipboard
		StringSelection ss=new StringSelection("C:\\Users\\$P42000-5CVKF7CNLE6V\\Downloads\\Requirement CheckList.xlsx");
		//StringSelection ss=new StringSelection("C:\\Users\\$F22000-TRLCUVSH6UFG\\Downloads\\notepad image.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		//CTRL+V
		rb.keyPress(KeyEvent.VK_CONTROL);  //press on CTRL key
		rb.keyPress(KeyEvent.VK_V);      //press on CTRL key
		rb.delay(2000);
		
//		rb.keyRelease(KeyEvent.VK_CONTROL);
//		rb.keyRelease(KeyEvent.VK_V);
		
		//Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		//upload a file using sendkeys methods/command
		//Upload.sendKeys("C:\\Users\\$F22000-TRLCUVSH6UFG\\Downloads\\notepad image.png");
		
		//Upload file through through project file
		//String projectPath=System.getProperty("user.dir");
				//String stringpath = System.getProperty("user,dir");
				//Upload.sendKeys(stringpath+"\\Files\\opera.png");
	}
	public void SubmitButton()
	{
		Submit.click();
	}
	public void CancelButton()
	{
		Cancel.click();
	}

}
