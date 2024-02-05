package com.oneable.pageObjects;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneable.testcases.BaseClass;
import com.oneable.testcases.ReusableMethods;


public class Dashboard extends BaseClass {
	
	//WebDriver driver;
	ReusableMethods rm= new ReusableMethods();
	
	public Dashboard(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//a[@href=\"/dashboard\"])[2]")
	WebElement Dashboard;
	
	
	@FindBy(xpath="/html/body/div/div/div/div[3]/div[2]/div/div/div/div[2]/div[3]/div[1]/div/div/div[2]/div/div/div/svg/g[1]/g[2]/g[2]/path")
	WebElement MachinesGraph;
	
	@FindBy(xpath="(//div[@class=\"apexcharts-menu-icon\"])[1]")
	WebElement MachinesMenu;
	
	@FindBy(xpath="(//div[text()='Download SVG'])[1]")
	WebElement MachinesDownloadSVG;
	
	@FindBy(xpath="(//div[text()='Download PNG'])[1]")
	WebElement MachinesDownloadPNG;
	
	@FindBy(xpath="(//div[text()='Download CSV'])[1]")
	WebElement MachinesDownloadCSV;
	
	
	
	
	
	@FindBy(xpath="//*[local-name()='svg']//*[local-name()='g' and @class=\"apexcharts-series\"]//*[local-name()='path']")
	List <WebElement> MachinesGraphs;
	

	
	
	
	@FindBy(xpath="(//div[@class=\"apexcharts-menu-icon\"])[2]")
	WebElement ToolsMenu;
	
	@FindBy(xpath="(//div[text()='Download SVG'])[2]")
	WebElement ToolsDownloadSVG;
	
	@FindBy(xpath="(//div[text()='Download PNG'])[2]")
	WebElement ToolsDownloadPNG;
	
	@FindBy(xpath="(//div[text()='Download CSV'])[2]")
	WebElement ToolsDownloadCSV;
	
	@FindBy(xpath="/html/body/div/div/div/div[3]/div[2]/div/div/div/div[2]/div[3]/div[2]/div/div/div[2]/div/div/div/svg/g[1]/g[2]/g[1]/path")
	WebElement ToolsGraph;
	
	
	
	
	@FindBy(xpath="//a[@href=\"/Faq\"]")
	WebElement Help;
	
	@FindBy(xpath="(//i[@class=\"fa fa-chevron-down\"])[1]")
	WebElement OneableFAQsBasics;
	
	@FindBy(xpath="(//i[@class=\"fa fa-chevron-down\"])[5]")
	WebElement OneableFAQsLicense;
	
	@FindBy(xpath="(//i[@class=\"fa fa-chevron-down\"])[6]")
	WebElement OneableFAQsPrivacy;
	
	@FindBy(xpath="(//i[@class=\"fa fa-chevron-down\"])[7]")
	WebElement OneableFAQsProductivity;
	
	@FindBy(xpath="(//i[@class=\"fa fa-chevron-down\"])[8]")
	WebElement OneableFAQsTiesheet;
	
	//@FindBy(xpath="(//i[@class=\\\"fa fa-chevron-down\\\"])[9]")
	@FindBy(xpath="/html/body/div/div/div/div[3]/div[2]/div/div/div/div/div/div/div/div[9]/div[1]/h5/button/span/i")
	WebElement OneableFAQsTools;
	
	@FindBy(xpath="(//i[@class=\"fa fa-chevron-down\"])[11]")
	WebElement OneableFAQsSupport;
	
	
	@FindBy(xpath="(//button[@id=\"dropdown-basic\" or @class=\"user-name left_dropdown_btn mt-1  dropdown-toggle btn btn-success\"])[2]")
	WebElement Profile;
	
	@FindBy(xpath="(//a[@class=\"dropdown-item\"])[1]")
	WebElement MyProfile;
	
	@FindBy(xpath="//label[@class=\"image-upload camera_Icon\"]")
	WebElement ProfileDp;
	
	@FindBy(xpath="//input[@name=\"Profile Skills\"]")
	WebElement Skill;
	
	@FindBy(xpath="//input[@name=\"Profile ChangeLanguage\"]")
	WebElement Language;
	
	@FindBy(xpath="//input[@name=\"Profile Phone\"]")
	WebElement Phone;
	
	@FindBy(xpath="//input[@name=\"Profile Location\"]")
	WebElement Location;
	
	@FindBy(xpath="//input[@name=\"Profile ZipCode\"]")
	WebElement Zip;
	
	@FindBy(xpath="//textarea[@name=\"content\"]")
	WebElement Biagraphy;
	
	@FindBy(xpath="//button[@name=\"Profile Update\"]")
	WebElement Button;
	
	
	@FindBy(xpath="//a[@href=\"/settings\"]")
	WebElement DashboardSettingsFunctionality;
	
	@FindBy(xpath="//a[text()='Change Password']")
	WebElement ChangePassword;
	
	@FindBy(xpath="//input[@id=\"oldPassword\"]")
	WebElement OldPassword;
	
	@FindBy(xpath="//input[@id=\"newPassword\"]")
	WebElement NewPassword;
	
	@FindBy(xpath="//input[@id=\"confirmPassword\"]")
	WebElement ConfirmPassword;
	
	@FindBy(xpath="//button[@name=\"save-password\"]")
	WebElement SavePassword;
	
	
	@FindBy(xpath="//a[text()='Requests']")
	WebElement RequestsFunctionality;
	
	@FindBy(xpath="//select[@name=\"statusWiseFilter\"]")
	WebElement SearchBox;
	
	@FindBy(xpath="//img[@src=\"../../assets/images/pomodoro/plus_pomodoro.svg\"]")
	WebElement CursorPointer;
	
	@FindBy(xpath="//select[@name=\"selected request projects\"]")
	WebElement Projects;
	
	@FindBy(xpath="//select[@name=\"Request Departments\"]")
	WebElement Department;
	
	@FindBy(xpath="//select[@name=\"Type Request\"]")
	WebElement Requests;
	
	@FindBy(xpath="//select[@name=\"AllocateorDeallocte Request\"]")
	WebElement Allocate;
	
	@FindBy(xpath="//input[@name=\"search_name_input\"]")
	WebElement Tool;
	
	@FindBy(xpath="//select[@name=\"Request Priority\"]")
	WebElement Priority;
	
	@FindBy(xpath="//textarea[@name=\"Req Description\"]")
	WebElement Description;
	
	@FindBy(xpath="//button[@name=\"Request Cancel\" or @class=\"btn bg_darkgray mx-2\"]")
	WebElement Cancel;
	
	@FindBy(xpath="//button[@name=\"Request Cancel\"]")
	WebElement Submit;
	
	
	public void HelpLink()
	{
		rm.click(Help);
	}
	public void OneableFAQsBasicsfeature()
	{
		rm.click(OneableFAQsBasics);
	}
	public void OneableFAQsLicenseFeature()
	{
		rm.click(OneableFAQsLicense);
	}
	public void OneableFAQsPrivacyFeature()
	{
		rm.click(OneableFAQsPrivacy);
	}
	public void OneableFAQsProductivityFeature()
	{
		rm.click(OneableFAQsProductivity);
	}
	public void OneableFAQsTimesheetTeature()
	{
		rm.click(OneableFAQsTiesheet);
	}
	public void OneableFAQsToolsFeature()
	{
		rm.click(OneableFAQsTools);
	}
	public void OneableFAQsSupportFeature()
	{
		rm.click(OneableFAQsSupport);
	}
	
	
	
	public void DashboardModule()
	{
		rm.click(Dashboard);
	}
	public void MainProfile()
	{
		rm.click(Profile);
	}
	public void MyProfileOption()
	{
		rm.click(MyProfile);
	}
	public void ProfileDisplayPicture() throws Exception 
	{
		//Upload a file using Robot class
		        ProfileDp.click();
				Robot rb=new Robot();
				rb.delay(2000);
				//put path to file in a clipboard
				StringSelection ss=new StringSelection("C:\\Users\\$F22000-TRLCUVSH6UFG\\Downloads\\machinestatusperyear.png");
				
				//StringSelection ss=new StringSelection("C:\\Users\\$F22000-TRLCUVSH6UFG\\Downloads\\opera.png");
				//StringSelection ss=new StringSelection("C:\\Users\\$F22000-TRLCUVSH6UFG\\Downloads\\notepad image.png");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
				//CTRL+V
				rb.keyPress(KeyEvent.VK_CONTROL);  //press on CTRL key
				rb.keyPress(KeyEvent.VK_V);      //press on CTRL key
				rb.delay(2000);	
				 
			    //rb.keyRelease(KeyEvent.VK_CONTROL);
				//rb.keyRelease(KeyEvent.VK_V);

				//Enter
				rb.keyPress(KeyEvent.VK_ENTER);
				rb.keyRelease(KeyEvent.VK_ENTER);
	}
	public void SkillSet()
	{
		rm.type(Skill, "Testing");
	}
	public void LanguageOption()
	{
		rm.type(Language, "Java");
	}
	public void PhoneNumber()
	{
		rm.type(Phone, "6875498655");
	}
	public void LocationOption()
	{
		rm.type(Location, "Hyderabad");
	}
	public void ZipCode()
	{
		rm.type(Zip, "500505");
	}
	public void BiographyText()
	{
		rm.type(Biagraphy, "Ojas innovative technologies oneable platform");
	}
	public void UpdateButton()
	{
		rm.click(Button);
	}
	
	
	public void DashboardSettingFeature()
	{
		rm.click(DashboardSettingsFunctionality);
	}
	public void ChangePasswordFeature()
	{
		rm.click(ChangePassword);
	}
	public void OldPasswordTextBox()
	{
		rm.type(OldPassword, "Pravi@123#");
	}
	public void NewPasswordTextBox()
	{
		rm.type(NewPassword, "Pravi@135#");
	}
	public void ConfirmPasswordTextBox()
	{
		rm.type(ConfirmPassword, "Pravi@135#");
	}
	public void SavePasswordButton()
	{
		rm.click(SavePassword);
	}
	
	
	public void RequestFeature()
	{
		rm.click(RequestsFunctionality);
	}
	
	
	public void SearchBoxDropdown()
	{
		rm.selectByVisibleText(SearchBox, "Rejected");
	}
	
	
	public void CursorPointerOption()
	{
		rm.click(CursorPointer);
	}
	public void ProjectsDropdown()
	{
		rm.selectByVisibleText(Projects, "Oneable Automation");
	}
	public void DepartmentDropdown()
	{
		rm.selectByVisibleText(Department, "Testing");
	}
	public void RequestsDropdown()
	{
		rm.selectByVisibleText(Requests, "Tool");
	}
	public void AllocateDropdown()
	{
		rm.selectByVisibleText(Allocate, "Allocate");
	}
	public void ToolDropdown() 
	{
		rm.type(Tool, "RDP");	
	}
	public void PriorityDropdown()
	{
		rm.selectByVisibleText(Priority, "High");
	}
	public void DescriptionTextBox()
	{
		rm.type(Description, "Ojas Oneable Platform");
	}
	public void ClickCancelButton()
	{
		rm.click(Cancel);
	}
//	public void SubmitButton()
//	{
//		rm.click(Submit);
//	}

	
	public void GraphsOfMachines() throws Exception
	{
		rm.click(MachinesMenu);
		//lg.info("Clicked on machines menu");
		Thread.sleep(3000);
		rm.click(MachinesDownloadSVG);
		//lg.info("Clicked on machines downloadSVG");
		Thread.sleep(4000);
		rm.click(MachinesMenu);
		//lg.info("Clicked on machines menu");
		Thread.sleep(3000);
		rm.click(MachinesDownloadPNG);
		//lg.info("Clicked on machines downloadPNG");
		Thread.sleep(4000);
		rm.click(MachinesMenu);
		//lg.info("Clicked on machines menu");
		Thread.sleep(3000);
		rm.click(MachinesDownloadCSV);
		//lg.info("Clicked on machines downloadCSV");
		//Thread.sleep(4000);
		//rm.mouseOver(driver, MachinesGraph);
		//MachinesGraph.click();
	}
	
	public void GraphsOfTools() throws Exception
	{
		rm.click(ToolsMenu);
		//lg.info("Clicked on tools menu");
		Thread.sleep(3000);
		rm.click(ToolsDownloadSVG);
		//lg.info("Clicked on tools downloadSVG");
		Thread.sleep(4000);
		rm.click(ToolsMenu);
		//lg.info("Clicked on tools menu");
		Thread.sleep(3000);
		rm.click(ToolsDownloadPNG);
		//lg.info("Clicked on tools downloadPNG");
		Thread.sleep(4000);
		rm.click(ToolsMenu);
		//lg.info("Clicked on tools menu");
		Thread.sleep(3000);
		rm.click(ToolsDownloadCSV);
		//lg.info("Clicked on tools downloadCSV");
		Thread.sleep(3000);
		//rm.click(ToolsGraph);
	}
	//Actions a= new Actions(driver);
	public void GraphsMachinesHandle() throws Exception
	{
		MachinesGraphs.size();
		for(WebElement e:MachinesGraphs)
		{
			rm.mouseOver(driver, e);
			//a.moveToElement(e).build().perform();
			Thread.sleep(2000);
		}
	}
	
	
	

}
