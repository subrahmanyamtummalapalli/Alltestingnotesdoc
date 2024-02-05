package com.tutorialsNinja.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {
	
	WebDriver driver;
	public MyAccount(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='My Account']")
    WebElement MyAccountDropmenu;
	
	public void accountDropmenu()
	{
		MyAccountDropmenu.click();
	}
	
	@FindBy(xpath="(//a[text()='My Account'])[1]")
	WebElement MyAccountBtn;
	
	public void accountBtn()
	{
		MyAccountBtn.click();
	}
	
	@FindBy(xpath="//a[text()='Edit your account information']")
	WebElement editAccountLink;
	
	public void editBtn()
	{
		editAccountLink.click();
	}
	
	@FindBy(name="firstname")
	WebElement firstNameField;
	
	public void fname(String name)
	{
		firstNameField.clear();
		firstNameField.sendKeys(name);
	}
	
	@FindBy(name="lastname")
	WebElement lastNameField;
	
	public void lname(String lname)
	{
		lastNameField.clear();
		lastNameField.sendKeys(lname);
	}
	
	@FindBy(name="email")
	WebElement emailField;
	
	public void emailId(String email)
	{
		emailField.clear();
		emailField.sendKeys(email);
	}
	
	@FindBy(name="telephone")
	WebElement telephoneField;
	
	public void phnNum(String phone)
	{
		telephoneField.clear();
		telephoneField.sendKeys(phone);
	}
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement continueBtn;
	
	public void submit1()
	{
		
		continueBtn.click();
	}
	
	@FindBy(xpath="//a[text()='Change your password']")
	WebElement changePwdLink;
	
	public void changePwd()
	{
		changePwdLink.click();
	}
	
	@FindBy(name="password")
	WebElement PwdField;
	
	public void pwd(String pwd1)
	{
		PwdField.clear();
		PwdField.sendKeys(pwd1);
	}
	

	@FindBy(name="confirm")
	WebElement cnfPwdField;
	
	public void cPwd(String pwd2)
	{


		cnfPwdField.clear();
		cnfPwdField.sendKeys(pwd2);
	}
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement continueBtn1;
	
	public void clickContinue()
	{
		continueBtn1.click();
	}
	
	
	@FindBy(xpath="//a[text()='Modify your address book entries']")
	WebElement modifyAddssLink;
	
	public void address()
	{
		modifyAddssLink.click();
	}
	
	@FindBy(xpath="//a[text()='New Address']")
	WebElement newAddssBtn;
	
	public void newaddress()
	{
		newAddssBtn.click();
	}
	
//	@FindBy(name="firstname")
//	WebElement firstNameFieldInAddress;
//	
//	public void fnameAddress(String name)
//	{
//		firstNameFieldInAddress.clear();
//		firstNameFieldInAddress.sendKeys(name);
//	}
//	
//	@FindBy(name="lastname")
//	WebElement lastNameFieldInAddress;
//	
//	public void lnameAddress(String name)
//	{
//		lastNameFieldInAddress.clear();
//		lastNameFieldInAddress.sendKeys(name);
//	}
//	
//	@FindBy(name="company")
//	WebElement companyNameFieldInAddress;
//	
//	public void companyname(String name)
//	{
//		companyNameFieldInAddress.clear();
//		companyNameFieldInAddress.sendKeys(name);
//	}
//	
//	@FindBy(name="address_1")
//	WebElement AddressField;
//	
//	public void addressField1(String name)
//	{
//		AddressField.clear();
//		AddressField.sendKeys(name);
//	}
//	
//	@FindBy(name="firstname")
//	WebElement firstNameField;
//	
//	public void fname(String name)
//	{
//		firstNameField.clear();
//		firstNameField.sendKeys(name);
//	}
//	
//	@FindBy(name="firstname")
//	WebElement firstNameField;
//	
//	public void fname(String name)
//	{
//		firstNameField.clear();
//		firstNameField.sendKeys(name);
//	}
//

	

	

}
