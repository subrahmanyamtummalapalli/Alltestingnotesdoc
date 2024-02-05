package TestScript;

import ReuasbleMethods.SearchHotelPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ObjectRepositary.SearchHotelPageOb;

public class TestRun extends SearchHotelPage {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		launchSite();
		
		SearchHotelPageOb sh = new SearchHotelPageOb(driver);
		
		

	}

}
