package com.oneAble.TestCase;

import org.testng.annotations.Test;

import com.oneAble.PageObjects.LoginPage;
import com.oneAble.PageObjects.MachineListPage;

public class MachineList_002 extends MachineAllocate_2 {

	@Test(priority=4)
	public void machinelist() throws Exception  {
		MachineListPage mlg = new MachineListPage(driver);
		
		mlg.machineList1();
		
		mlg.clickOnSearch("Dell");
		mlg.activeDeActive();
		//lg.info("Click on search box");
		
	}

}