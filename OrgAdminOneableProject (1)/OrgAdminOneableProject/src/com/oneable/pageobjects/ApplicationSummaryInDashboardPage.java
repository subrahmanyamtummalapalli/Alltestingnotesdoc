package com.oneable.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.oneable.base.BaseClass;

public class ApplicationSummaryInDashboardPage extends BaseClass{
	@FindBy(xpath="//*[local-name()='svg']"
			+ "//*[local-name()='g' and @class=\"apexcharts-inner apexcharts-graphical\" and @transform=\"translate(57, 30)\"]"
			+ "//*[local-name()='g' and @seriesName=\"Hours\" ]//*")
	List<WebElement> spike;
	
	@FindBy(xpath="/html/body/div/div/div/div[3]/div[2]/div/div/div/div[2]"
			+ "/div[2]/div/div[3]/div/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div[1]")
	WebElement toolName;
	
	@FindBy(xpath="/html/body/div/div/div/div[3]/div[2]/div/div/div/div[2]/div[2]/div/"
			+ "div[3]/div/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div[2]/div/div[1]/span[1]")
	WebElement hoursText;
	
	@FindBy(xpath="/html/body/div/div/div/div[3]/div[2]/div/div/div/div[2]/div[2]/div/div[3]/div/div/div/"
			+ "div[2]/div/div/div/div/div/div/div/div[2]/div[2]/div/div[1]/span[2]")
	WebElement hourstime;
	
	public ApplicationSummaryInDashboardPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	public void applicationSummary() throws InterruptedException {
		Actions act= new Actions(getDriver());
		for(WebElement e:spike) {
			act.moveToElement(e).build().perform();
			Thread.sleep(2000);
			String ToolName = toolName.getText();
			String Hours = hoursText.getText();
			String time = hourstime.getText();
			System.out.println("My Team works on "+ToolName+" is "+Hours+" "+time);
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
