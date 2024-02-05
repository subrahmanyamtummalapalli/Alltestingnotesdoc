package com.oneable.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

//import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.oneable.pageObjects.LoginPage1;
import com.oneable.pageObjects.ProvisioningOfMachinesPage3;
//import com.oneable.utility.Log4j;

public class TC_ProvisioningOfMachinesPage_003 extends TC_MachineDeAllocation_005 {
	@Test(priority=6)
	public void provisioningOfMachines() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Log4j lg = new Log4j();
//		LoginPage1 lp = new LoginPage1(driver);
//		lp.LoginWithValidData(username, password);
		ProvisioningOfMachinesPage3 pm = new ProvisioningOfMachinesPage3(driver);

		//lp.LoginWithValidData(username, password);
		//lg.info("Login with valid credentials");
		//Thread.sleep(2000);
        //driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/h6/b")).click();
		
		//driver.manage().window().maximize();
		Thread.sleep(5000);
        pm.ClickProvisioningOfMachines();
		//lg.info("Clicked on provisioning of machines");
		Thread.sleep(2000);
		pm.SetMachineName();
		//lg.info("Set machine name");
		Thread.sleep(2000);
		pm.EnterPublicIpAddress();
		//lg.info("Public ip address entered");
		Thread.sleep(3000);
		pm.EnterPrivateAddress();
		//lg.info("Entered private address");
		pm.ClickSelectProcessor();
		//lg.info("Select processor is selected");
		Thread.sleep(2000);
		pm.EnterHardDisk();
		//lg.info("Hard disk is entered");
		Thread.sleep(3000);
		pm.SelectRamDropdown();
		//lg.info("Ram is selected");
		Thread.sleep(3000);
		pm.SelectProcessorDropdown();
		//lg.info("Processor is selected");
		Thread.sleep(3000);
		pm.SelectOperatingSystem();
		//lg.info("Selected operating system");
		Thread.sleep(2000);
		pm.SelectLocation();
		//lg.info("Selected location");
		Thread.sleep(2000);
		pm.Setplan();
		//lg.info("set plan");
		Thread.sleep(2000);
		pm.WriteDescription();
		//lg.info("Writen discription");
		Thread.sleep(2000);
		pm.ClickNextButton();
		//lg.info("Clicked on next button");
		Thread.sleep(2000);
		pm.DomainCheckButton();
		//lg.info("Click the domain check box ");
		Thread.sleep(2000);
		pm.DomainNameText();
		//lg.info("Domain name is entered");
		Thread.sleep(2000);
		pm.AddMachineDomainNext();
		//lg.info("Clicked next button in add machine domain");
		Thread.sleep(2000);
		pm.SelectProcureTool();
		//lg.info("Selected procure tool");
		Thread.sleep(2000);
		pm.ProcureToolNext();
		//lg.info("Clicked procure tool next button");
		Thread.sleep(2000);
		pm.ProvisioningPublishTool();
		//lg.info("Clicked on published remote app");
		Thread.sleep(2000);
		pm.ProvisionTool();
		//lg.info("Clicked on button");
		System.out.println("provisioning of machines");
	}
}
