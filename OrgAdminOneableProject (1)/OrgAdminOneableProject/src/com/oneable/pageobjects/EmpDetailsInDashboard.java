package com.oneable.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneable.base.BaseClass;

public class EmpDetailsInDashboard extends BaseClass {
	@FindBy(xpath="/html/body/div/div/div/div[3]/div[2]/div/div/div/div[2]/div[2]/div/div[4]/div/div/div/div/table/thead/tr")
	List<WebElement> tableHead;
	
	
	@FindBy(xpath="/html/body/div/div/div/div[3]/div[2]"
			+ "/div/div/div/div[2]/div[2]/div/div[4]/div/div/div/div/table/tbody")
	List<WebElement> tableBody;
	
	public EmpDetailsInDashboard() {
		PageFactory.initElements(getDriver(), this);
	}
	public void EmpDetails() {
		
		for(WebElement e:tableHead) {
			String text1 = e.getText();
			System.out.println(text1);
		}
		for(WebElement e1:tableBody) {
			String text = e1.getText();
			System.out.println(text);
		}
	}

}
