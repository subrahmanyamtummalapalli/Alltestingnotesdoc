package com.oneable.testcases;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.oneable.pageObjects.LoginPage1;
import com.oneable.pageObjects.MachineDeAllocationModule5;
//import com.oneable.utility.Log4j;

public class TC_MachineDeAllocation_005 extends TC_MachineAllocationModule_004
{
	@Test(priority=5)
	public void DeAllocation() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Log4j lg=new Log4j();
//		LoginPage1 lp=new LoginPage1(driver);
//		lp.LoginWithValidData(username, password);
		//lg.info("Login with valid credentials");
		
		Thread.sleep(2000);
		MachineDeAllocationModule5 mdm=new MachineDeAllocationModule5(driver);
		mdm.MachineDeAllocationPage();
		//lg.info("Clicked on machine de-allocation module");
		Thread.sleep(2000);
		mdm.MachineSearch();
		//lg.info("Clicked on search box");
		System.out.println("machine deallocated successfully");
	}

}
