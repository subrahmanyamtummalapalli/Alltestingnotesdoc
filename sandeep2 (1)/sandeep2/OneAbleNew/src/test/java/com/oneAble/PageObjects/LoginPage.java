package com.oneAble.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
    public LoginPage(WebDriver rdriver)
    {
        driver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(name="userEmail")
    WebElement txtUserField;
    @FindBy(name="emailSubmite")
    WebElement nextBtn;
    @FindBy(name="userPassword")
    WebElement txtPwdField;
    @FindBy(name="submituserlogin")
    WebElement LoginBtn;

    public void setUn(String un)
    {
        txtUserField.sendKeys(un);
    }
    public void next()
    {
    	nextBtn.click();
    }
    public void setPwd(String pwd)
    {
        txtPwdField.sendKeys(pwd);
    }
    public void clickSubmit()
    {
        LoginBtn.click();

    }
}
