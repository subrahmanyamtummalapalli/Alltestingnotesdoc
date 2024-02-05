package com.oneable.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneable.base.BaseClass;
import com.oneable.helpers.Action;

public class EmpProductivityInDashboardPage extends BaseClass {
	
	Action action= new Action();
	@FindBy(xpath="//*[local-name()='svg']"
			+ "//*[name()='g' and@class='apexcharts-bar-series apexcharts-plot-series' ]"
			+ "//*[name()='g' and @seriesName=\"CruiserxHours\" or @seriesName=\"ThinkxHours\"]"
			+ "//*[name()='path']")
	List<WebElement> mousOverOnGraphs;
	
	@FindBy(xpath="/html/body/div/div/div/div[3]/div[2]/div/div/div"
			+ "/div[2]/div[2]/div/div[2]/div[1]/div/div/div/div/div/div/div/div/div/div/div[2]/div")
	WebElement namePath;
	
	@FindBy(xpath="/html/body/div/div/div/div[3]/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div/div/"
			+ "div/div/div/div/div/div/div/div[2]/div[2]/div/div[1]/span[1]")
	WebElement cruserHourName;
	
	@FindBy(xpath="/html/body/div/div/div/div[3]/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div[1]"
			+ "/div/div/div/div/div/div/div/div/div/div/div[2]/div[2]/div/div[1]/span[2]")
	WebElement cruserHourTime;
	
	@FindBy(xpath="(//*[local-name()='svg']//*[local-name()='g']"
			+ "//*[local-name()='text'and @class=\"apexcharts-text apexcharts-pie-label\"])[2]")
	WebElement TeamThinkTime;
	
	@FindBy(xpath="(//*[local-name()='svg']//*[local-name()='g']"
			+ "//*[local-name()='text' and @class=\"apexcharts-text apexcharts-pie-label\"])[1]")
	WebElement TeamCruserHours;
	
	public EmpProductivityInDashboardPage () {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void fetchData() throws InterruptedException {
		int size=mousOverOnGraphs.size();
		Actions act=new Actions(getDriver());
		for(WebElement e:mousOverOnGraphs) {
			act.moveToElement(e).build().perform();
			Thread.sleep(2000);
			String Employeename = namePath.getText();
			String CruserHourText = cruserHourName.getText();
			String CruserTime = cruserHourTime.getText();
			System.out.println(Employeename+" "+CruserHourText+" "+CruserTime);
		}
	
		
	}
	public void teamproductivity(){
		
		String TeamTT = TeamThinkTime.getText();
		String TeamCH = TeamCruserHours.getText();
		System.out.println("My Team Think Time is "+TeamTT+" and "+" Cruser Hours is "+TeamCH+"");
		
		
		
		
		
		
	}
	
	

}
