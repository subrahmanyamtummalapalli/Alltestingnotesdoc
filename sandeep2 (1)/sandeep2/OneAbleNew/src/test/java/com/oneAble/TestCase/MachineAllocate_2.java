package com.oneAble.TestCase;


import org.testng.annotations.Test;

import com.oneAble.PageObjects.MachineAllocatePage_2;


public class MachineAllocate_2 extends MachineRequest_1 {
	@Test(priority=3)
	public void machineAllocation() throws Exception
	{
		Thread.sleep(10000);
		
		MachineAllocatePage_2 mrp2=new MachineAllocatePage_2(driver);
		
		mrp2.machineAllow();
		Thread.sleep(3000);
		mrp2.searchField("Windows");
//		Thread.sleep(3000);
//		WebElement name=driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[4]/div/div/table/thead/tr/th[1]"));
//		String name1="Windows";
//		if(name.equals(name1))
//		{
//			System.out.println("success");
//		}
//		else
//		{
//			System.out.println("failure");
//		}
	}
	

}
