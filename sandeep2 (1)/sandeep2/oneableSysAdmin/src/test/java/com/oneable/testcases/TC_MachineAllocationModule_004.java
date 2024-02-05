package com.oneable.testcases;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.oneable.pageObjects.LoginPage1;
import com.oneable.pageObjects.MachineAllocationModule4;
//import com.oneable.utility.Log4j;

public class TC_MachineAllocationModule_004 extends TC_MachineRequest_006
{
	@Test(priority=4)
	public void MachineAllocate() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Log4j lg=new Log4j();
//		LoginPage1 lp=new LoginPage1(driver);
//		lp.LoginWithValidData(username, password);
		//lg.info("Login with valid credentials");
		Thread.sleep(2000);
		
		MachineAllocationModule4 ma=new MachineAllocationModule4(driver);
		ma.ClickOnMachineAllocation();
		System.out.println("machine allocated successfully");
	}
}
