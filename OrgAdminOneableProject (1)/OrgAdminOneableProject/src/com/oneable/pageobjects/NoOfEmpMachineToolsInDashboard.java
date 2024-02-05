package com.oneable.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneable.base.BaseClass;

public class NoOfEmpMachineToolsInDashboard extends BaseClass {
	@FindBy(xpath="(//b)[1]")
	WebElement Emptext;
	@FindBy(xpath="(//p)[1]")
	WebElement Empno;
	@FindBy(xpath="(//b)[2]")
	WebElement Machinetext;
	@FindBy(xpath="(//p)[2]")
	WebElement Machineno;
	@FindBy(xpath="(//b)[3]")
	WebElement Tooltext;
	@FindBy(xpath="(//p)[3]")
	WebElement Toolno;
	
	public NoOfEmpMachineToolsInDashboard(){
		PageFactory.initElements(getDriver(),this);
	}
	
	public String details() {
		String emp = Emptext.getText();
		String empno = Empno.getText();
		String machines = Machinetext.getText();
		String machineNo = Machineno.getText();
		String tool = Tooltext.getText();
		String toolNo = Tooltext.getText();
		System.out.println("Total "+emp+" "+" are "+empno+"");
		System.out.println("Total "+machines+" "+"are "+machineNo+"");
		System.out.println("Total "+tool+" "+"are "+toolNo+"");
		
		return empno;
	}
	

}
