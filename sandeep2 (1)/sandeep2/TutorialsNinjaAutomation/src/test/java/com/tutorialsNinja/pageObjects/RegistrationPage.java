package com.tutorialsNinja.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsNinja.implementation.BaseClass;

public class RegistrationPage extends BaseClass{
	
	WebDriver driver;
	public RegistrationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(xpath = "//span[text()='My Account']")
	    WebElement MyAccountBtn;
	 
	 @FindBy(xpath="(//a[text()='Register'])[1]")
	     WebElement RegisterBtn;
	 
	 @FindBy(name="firstname")
     WebElement firstNameField;
	 
	 @FindBy(name="lastname")
     WebElement lastNameField;
	 
	 
	 @FindBy(name="email")
     WebElement emailField;
	 
	 @FindBy(name="telephone")
     WebElement telephoneField;
	 
	 @FindBy(name="password")
     WebElement pwdField;
	 
	 @FindBy(name="confirm")
     WebElement cnfPwdField;
	 
	 @FindBy(name="agree")
     WebElement privacyCheckBox;
	 
	 @FindBy(xpath="//input[@value='Continue']")
     WebElement submitBtn;
	 
	 public void getMyAccount()
	 {
		 MyAccountBtn.click();
	 }
	 
	 public void getRegisterDetails()
	 {
		 RegisterBtn.click();
	 }
	 
	 public void getFirstName(String fname)
	 {
		 firstNameField.sendKeys(fname);
	 }
	 
	 public void getLastName(String lname)
	 {
		 lastNameField.sendKeys(lname);
	 }
	 
	 public void getEmail(String email)
	 {
		 emailField.sendKeys(email);
	 }
	 
	 public void getTelephoneNum(String tNumber)
	 {
		 telephoneField.sendKeys(tNumber);
	 }
	 
	 public void getPwd(String pwd)
	 {
		 pwdField.sendKeys(pwd);
	 }
	 
	 public void getCnfPwd(String cnpwd)
	 {
		 cnfPwdField.sendKeys(cnpwd);
	 }
	 
	 public void getCheckBox()
	 {
		 privacyCheckBox.click();
	 }
	 
	 public void clickSubmit()
	 {
		 submitBtn.click();
	 }


}
