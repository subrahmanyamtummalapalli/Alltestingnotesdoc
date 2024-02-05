package com.oneable.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.oneable.pageObjects.LoginPage1;
import com.oneable.pageObjects.ProvisioningOfToolModule8;
//import com.oneable.utility.Log4j;

public class TC_ProvisioningOfTool_008 extends TC_ToolDeAllocation_010
{
	//Log4j lg=new Log4j();
	@Test(priority=11)
	public void ProvisioninOfTool() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		LoginPage1 lp=new LoginPage1(driver);
//		lp.LoginWithValidData(username, password);
		//lg.info("Login with valide credentials");
		
		Thread.sleep(2000);
		ProvisioningOfToolModule8 ptm=new ProvisioningOfToolModule8(driver);
		ptm.ProvisioningOfToolPage();
		//lg.info("Clicked on provisioning of tool module");
		Thread.sleep(3000);
		ptm.ToolNameDropdown();
		//lg.info("Select the respective tool");
		Thread.sleep(5000);
		ptm.SoketHostTextBox("10.10.28.10");
		//lg.info("Entered soket host");
		Thread.sleep(2000);
		ptm.SoketPortTeBox("4822");
		//lg.info("Entered soket port");
		Thread.sleep(2000);
		ptm.ProtocalDropDown("rdp");
		//lg.info("Selected rdp");
		Thread.sleep(2000);
		ptm.PortTextBox("3899");
		//lg.info("Entered port number");
		Thread.sleep(2000);
		ptm.SecurityDropDown("nla");
		//lg.info("Selected nla");
		Thread.sleep(2000);
		ptm.DomainTextBox("1able.ai");
		//lg.info("Entered domain");
		Thread.sleep(2000);
		ptm.HostNameText("10.10.28.11");
		//lg.info("Entered host name");
		Thread.sleep(2000);
		ptm.NextButton();
		//lg.info("Clicked on next button");
		Thread.sleep(2000);
		ptm.PublishToolSearchBox("sandeep velpula");
		//lg.info("Entered name in search box");
		Thread.sleep(2000);
		ptm.PublishToolCheckBox();
		//lg.info("Clicked on check box");
		Thread.sleep(2000);
		ptm.PublishToolSubmitButton();
		//lg.info("Clicked on submit button");
		
	}

}