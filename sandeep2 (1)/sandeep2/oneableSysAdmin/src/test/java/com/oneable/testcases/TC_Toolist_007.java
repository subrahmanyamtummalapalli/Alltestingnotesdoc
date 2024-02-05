package com.oneable.testcases;

import org.testng.annotations.Test;

import com.oneable.pageObjects.LoginPage1;
import com.oneable.pageObjects.ToolListModule7;
//import com.oneable.utility.Log4j;

public class TC_Toolist_007 extends TC_ProvisioningOfTool_008
{
	//Log4j lg=new Log4j();
	//@Test(priority=12)
	public void TooListModulePage() throws Exception
	{
		ReusableMethods rm = new ReusableMethods();
		rm.implicityWait(driver, 2000);
//		LoginPage1 lp=new LoginPage1(driver);
//		lp.LoginWithValidData(username, password);
		//lg.info("Login with valid credentials");
		
		Thread.sleep(3000);
		ToolListModule7 tl= new ToolListModule7(driver);
		tl.ToolList();
		//lg.info("Clicked on tool list module");
		Thread.sleep(2000);
		tl.ToolSearchBox("Firefox");
		//lg.info("Entered firefox in search box");
		Thread.sleep(4000);
		tl.FirefoxApp();
		//lg.info("Clicked on firefox");
		Thread.sleep(4000);
		tl.CreateTool();
		//lg.info("Clicked on create tool functionality");
		Thread.sleep(2000);
		tl.EnterToolName("Notepad");
		//lg.info("Entered notepad in tool name text box");
		Thread.sleep(3000);
		tl.EnterRemoteApp("NotepadApp");
		//lg.info("Entered notepad app in remote app text box");
		Thread.sleep(2000);
		tl.CreateToolDescription("Oneable Plateform");
		//lg.info("Entered tool description");
		Thread.sleep(3000);
		tl.file();
		//lg.info("Successfully uploaded file");
		Thread.sleep(3000);
		//tl.SubmitButton();
		//lg.info("Clicked toggle button on firefox ");
	}
	
	
		@Test(priority=12)
		public void CreateTool() throws Exception
		{
		ReusableMethods rm = new ReusableMethods();
		
		rm.implicityWait(driver, 2000);
//		LoginPage1 lp=new LoginPage1(driver);
//		lp.LoginWithValidData(username, password);
		//lg.info("Login with valid credentials");
		
		Thread.sleep(2000);
		ToolListModule7 tl= new ToolListModule7(driver);
		tl.ToolList();
		//lg.info("Clicked on tool list module");
		Thread.sleep(2000);	
		tl.ToolSearchBox("Firefox");
		//lg.info("Entered firefox in search box");
		Thread.sleep(4000);
		tl.CreateTool();
		//lg.info("Clicked on create tool functionality");
		Thread.sleep(2000);
		tl.EnterToolName("Notepad");
		//lg.info("Entered notepad in tool name text box");
		Thread.sleep(3000);
		tl.EnterRemoteApp("NotepadApp");
		//lg.info("Entered notepad app in remote app text box");
		Thread.sleep(2000);
		tl.CreateToolDescription("Oneable Plateform");
		//lg.info("Entered tool description");
		Thread.sleep(3000);
		tl.file();
		//lg.info("Successfully uploaded file");
		Thread.sleep(3000);
		//tl.SubmitButton();
		//lg.info("Clicked on submit button");
		tl.CancelButton();
		//lg.info("Clicked on cancel button");
		}
		
	}


