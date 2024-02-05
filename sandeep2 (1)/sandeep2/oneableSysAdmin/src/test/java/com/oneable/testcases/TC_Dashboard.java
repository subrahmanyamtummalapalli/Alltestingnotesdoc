package com.oneable.testcases;



import org.testng.annotations.Test;

import com.oneable.pageObjects.Dashboard;
import com.oneable.pageObjects.LoginPage1;



public class TC_Dashboard extends BaseClass{
	
	
	@Test(priority=1)
	public void HelpFunctionality() throws Exception
	{
		ReusableMethods rm= new ReusableMethods();
		rm.implicityWait(driver, 10);
		LoginPage1 lp = new LoginPage1(driver);
		lp.LoginWithValidData(username, password);
		
		
		Dashboard d=new Dashboard(driver);
		d.DashboardModule();
		
		Thread.sleep(2000);
		d.HelpLink();
		
		Thread.sleep(2000);
		d.OneableFAQsBasicsfeature();
		
		Thread.sleep(3000);
		d.OneableFAQsLicenseFeature();
		
		Thread.sleep(3000);
		d.OneableFAQsPrivacyFeature();
		
		Thread.sleep(3000);
		d.OneableFAQsProductivityFeature();
		
		Thread.sleep(3000);
		d.OneableFAQsTimesheetTeature();
		
		Thread.sleep(5000);
		d.OneableFAQsToolsFeature();
		
		Thread.sleep(5000);
		d.OneableFAQsSupportFeature();
		
	}
	
	@Test(priority=2)
	public void DashboarProfiledTest() throws Exception 
	{
		ReusableMethods rm= new ReusableMethods();
		rm.implicityWait(driver, 10);
		LoginPage1 lp = new LoginPage1(driver);
		lp.LoginWithValidData(username, password);
		
		
		Dashboard d=new Dashboard(driver);
		d.DashboardModule();
		
		Thread.sleep(2000);
		d.MainProfile();
		
		Thread.sleep(2000);
		d.MyProfileOption();
		
		Thread.sleep(2000);
		d.ProfileDisplayPicture();
		
		Thread.sleep(2000);
		d.SkillSet();
		
		Thread.sleep(2000);
		d.LanguageOption();
		
		Thread.sleep(2000);
		d.PhoneNumber();
		
		Thread.sleep(2000);
		d.LocationOption();
		
		Thread.sleep(2000);
		d.ZipCode();
		
		Thread.sleep(2000);
		d.BiographyText();
		
		Thread.sleep(2000);
		//d.UpdateButton();
		
	}
		
		@Test(priority=3)
		public void DashboardChangePasswordSetting() throws Exception
		{
			LoginPage1 lp = new LoginPage1(driver);
			ReusableMethods rm = new ReusableMethods();
			Dashboard d=new Dashboard(driver);

			rm.implicityWait(driver, 10);
			lp.LoginWithValidData(username, password);
			
			
			Thread.sleep(2000);
			d.DashboardModule();
			
			Thread.sleep(2000);
			d.MainProfile();
			
			Thread.sleep(2000);
			d.DashboardSettingFeature();
			
			Thread.sleep(2000);
			d.ChangePasswordFeature();
			
			Thread.sleep(2000);
			d.OldPasswordTextBox();
			
			Thread.sleep(2000);
			d.NewPasswordTextBox();
			
			Thread.sleep(2000);
			d.ConfirmPasswordTextBox();
			
			Thread.sleep(2000);
			// ds.SavePasswordButton();
			
		}

		@Test(priority=4)
		public void RequestFunctionality() throws Exception {
			LoginPage1 lp = new LoginPage1(driver);
			ReusableMethods rm = new ReusableMethods();
			Dashboard d=new Dashboard(driver);

			rm.implicityWait(driver, 10);
			lp.LoginWithValidData(username, password);
			
			
			Thread.sleep(2000);
			d.DashboardModule();
			
			Thread.sleep(2000);
			d.MainProfile();
			
			Thread.sleep(2000);
			d.DashboardSettingFeature();
			
			Thread.sleep(2000);
			d.RequestFeature();
			
			Thread.sleep(2000);
			d.SearchBoxDropdown();
			
			Thread.sleep(2000);
			d.CursorPointerOption();
			
			Thread.sleep(2000);
			d.ProjectsDropdown();
			
			Thread.sleep(2000);
			d.DepartmentDropdown();
			
			Thread.sleep(2000);
			d.RequestsDropdown();
			
			Thread.sleep(3000);
			d.AllocateDropdown();
			
			Thread.sleep(3000);
			d.ToolDropdown();
			
			Thread.sleep(4000);
			d.PriorityDropdown();
			
			Thread.sleep(3000);
			d.DescriptionTextBox();
			
			Thread.sleep(2000);
			d.ClickCancelButton();
			
			// ds.SubmitButton();
			
			}
		
		@Test(priority=5)
		public void VerifyTheMachinesGraphs() throws Exception
		{
			ReusableMethods rm= new ReusableMethods();
			rm.implicityWait(driver, 10);
			
			LoginPage1 lp = new LoginPage1(driver);
			lp.LoginWithValidData(username, password);
			
			
			Dashboard d=new Dashboard(driver);
			Thread.sleep(3000);
			d.GraphsOfMachines();
		}
		
		@Test(priority=6)
		public void VerifyTheToolsGraphs() throws Exception 
		{
			ReusableMethods rm= new ReusableMethods();
			rm.implicityWait(driver, 10);
			
			LoginPage1 lp = new LoginPage1(driver);
			lp.LoginWithValidData(username, password);
			
			
			Dashboard d=new Dashboard(driver);
			Thread.sleep(3000);
			d.GraphsOfTools();
		}
		@Test
		public void HandleMachinesGraphs() throws Exception
		{
			ReusableMethods rm= new ReusableMethods();
			rm.implicityWait(driver, 10);
			
			LoginPage1 lp = new LoginPage1(driver);
			lp.LoginWithValidData(username, password);
			
			Dashboard d=new Dashboard(driver);
			Thread.sleep(3000);
			d.GraphsMachinesHandle();
		}
		
}


