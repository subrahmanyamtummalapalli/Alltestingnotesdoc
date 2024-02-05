package com.oneAble.TestCase;

import org.testng.annotations.Test;

import com.oneAble.PageObjects.MachineRequestPage_1;



public class MachineRequest_1 extends Login_001{
	@Test(priority=2)
	public void machineReq() throws Exception
	{
		Thread.sleep(3000);
		MachineRequestPage_1 mrg=new MachineRequestPage_1(driver);
		mrg.machineRequest();
		Thread.sleep(3000);
		mrg.machineSearch("windows");
//		Thread.sleep(3000);
//		mrg.closeRequest();

    }

}
