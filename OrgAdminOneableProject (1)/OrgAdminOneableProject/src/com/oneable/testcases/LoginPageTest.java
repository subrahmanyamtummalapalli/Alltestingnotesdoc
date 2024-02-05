package com.oneable.testcases;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.oneable.base.BaseClass;
import com.oneable.helpers.Action;
import com.oneable.pageobjects.ApplicationSummaryInDashboardPage;
import com.oneable.pageobjects.EmpDetailsInDashboard;
import com.oneable.pageobjects.EmpProductivityInDashboardPage;
import com.oneable.pageobjects.LoginPages;
import com.oneable.pageobjects.NoOfEmpMachineToolsInDashboard;
import com.oneable.utility.Log;

public class LoginPageTest extends BaseClass {
	Action act= new Action();
	
	@Test(enabled=true)
	public void loignTc01() throws InterruptedException {
		Log.startTestCase("loginTc01");
		LoginPages ln= new LoginPages();
		Log.info("enter email and password");
		ln.login(prop.getProperty("email"), prop.getProperty("password"));
		String ActualTital = act.getTitle(getDriver());
		String ExpectedTitle="Oneable Workforce Planner";
		Assert.assertEquals(ActualTital, ExpectedTitle);
		boolean validation = ln.validation();
		Assert.assertTrue(validation, "Login Successfull");
		//act.display(getDriver(), DashBoardText);
		//System.out.println(ActualTital);
		Log.info("login successfull");
		Log.endTestCase("loginTc01");
	}
	@Test(enabled=true)
	public void backTc02() throws InterruptedException {
		Log.startTestCase("backTc02");
		LoginPages ln= new LoginPages();
        ln.backToEmailPage(prop.getProperty("email"));
        String currentUrl = getDriver().getCurrentUrl();
        String expectedUrl = "https://ojas.oneable.ai/email";
        Assert.assertEquals(currentUrl, expectedUrl);
        Log.info("Successfully navigated back to email page");
		Log.endTestCase("backTc02");
	}
	
	@Test(enabled=true)
	public void DomainVerification() throws InterruptedException {
		Log.startTestCase("DomainVerification");
		LoginPages ln= new LoginPages();
		ln.inValidemailWithValidDomain(prop.getProperty("email2"));
       // ln.backToEmailPage(prop.getProperty("email1"));
        String currentUrl = getDriver().getCurrentUrl();
        String expectedUrl = "https://ojas.oneable.ai/login";
        Assert.assertEquals(currentUrl, expectedUrl);
	}
	@Test()
	public void ChangeLanguge() throws InterruptedException {
		Log.startTestCase("ChangeLanguge");
		LoginPages ln= new LoginPages();
		ln.text();
		WebElement findElement = getDriver().findElement(By.xpath("//*[text()='ようこそ ワンエイブル']"));
		boolean display = act.display(getDriver(), findElement);
		Assert.assertTrue(display);
		
	}
	
    @Test(enabled=true)
    public void empProductivityTc03() throws InterruptedException {
    	Log.startTestCase("empProductivityTc03");
		LoginPages ln= new LoginPages();
		Log.info("enter email and password");
		ln.login(prop.getProperty("email"), prop.getProperty("password"));
		Log.info("login successfull");
		EmpProductivityInDashboardPage ep=new EmpProductivityInDashboardPage();
		ep.fetchData();
		Log.endTestCase("empProductivityTc03");
    }
    @Test(enabled=true)
    public void Tc04() throws InterruptedException {
    	Log.startTestCase("loginTc01");
		LoginPages ln= new LoginPages();
		Log.info("enter email and password");
		ln.login(prop.getProperty("email"), prop.getProperty("password"));
		Log.info("login successfull");
		NoOfEmpMachineToolsInDashboard tc= new NoOfEmpMachineToolsInDashboard();
		tc.details();
		String expectedEmpNo= "41";
		//Assert.assertEquals(expectedEmpNo, );
    	
    }
    @Test(enabled=true)
    public void Tc05() throws InterruptedException {
    	Log.startTestCase("loginTc01");
		LoginPages ln= new LoginPages();
		Log.info("enter email and password");
		ln.login(prop.getProperty("email"), prop.getProperty("password"));
		Log.info("login successfull");
		EmpProductivityInDashboardPage ep=new EmpProductivityInDashboardPage();
		Thread.sleep(3000);
		ep.teamproductivity();
//		Date date = new Date();
//		System.out.println(date);
    }
    @Test(enabled=true)
    public void Tc06() throws InterruptedException {
    	Log.startTestCase("loginTc01");
		LoginPages ln= new LoginPages();
		Log.info("enter email and password");
		ln.login(prop.getProperty("email"), prop.getProperty("password"));
		Log.info("login successfull");
		ApplicationSummaryInDashboardPage ap= new ApplicationSummaryInDashboardPage();
		ap.applicationSummary();
    	
    }
    @Test(enabled=true)
    public void Tc07() throws InterruptedException {
    	Log.startTestCase("loginTc01");
		LoginPages ln= new LoginPages();
		Log.info("enter email and password");
		ln.login(prop.getProperty("email"), prop.getProperty("password"));
		Log.info("login successfull");
		EmpDetailsInDashboard em=new EmpDetailsInDashboard();
		Thread.sleep(2000);
		em.EmpDetails();
    }
    
}
