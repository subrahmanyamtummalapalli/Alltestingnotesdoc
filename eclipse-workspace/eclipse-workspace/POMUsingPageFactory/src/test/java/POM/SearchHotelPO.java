package POM;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SearchHotelPO {
	
	private WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(name = "hotels")
	private WebElement hotels;
	
	@FindBy(id = "room_type")
	private WebElement room_type;
	
	@FindBy(id = "room_nos")
	private WebElement room_nos;
	
	@FindBy(id = "datepick_in")
	private WebElement datepick_in;
	
	@FindBy(id = "datepick_out")
	private WebElement datepick_out;
	
	@FindBy(id = "adult_room")
	private WebElement adult_room;
	
	@FindBy(id = "child_room")
	private WebElement child_room;
	
	public SearchHotelPO(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loc(String value)
	{
		Select lctn = new Select(location);
		lctn.selectByVisibleText(value);
	}
	
	public void hotel(int v2)
	{
		Select hot = new Select(hotels);
		hot.selectByIndex(v2);
	}
	
	public void RoomT(String value)
	{
		Select RoomTy = new Select(room_type);
		RoomTy.selectByValue(value);
	}
	
	public void RoomNu(String value)
	{
		Select RoomTN = new Select(room_nos);
		RoomTN.selectByValue(value);
	}
	
	public void CID(String value)
	{
		datepick_in.clear();
		datepick_in.sendKeys(value);
	}
	
	public void COD(String value)
	{
		datepick_out.clear();
		datepick_out.sendKeys(value);
	}
	
	public void APR(int v)
	{
		Select APR = new Select(adult_room);
		APR.selectByIndex(v);
	}
	
	public void CPR()
	{
		Select CPR = new Select(child_room);
		CPR.selectByVisibleText("2 - Two");
	}
	
	public void screenShot(WebDriver driver, String scName) 
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File ob = ts.getScreenshotAs(OutputType.FILE);
        try {
			Files.copy(ob , new File("C:\\Users\\vc21352\\eclipse-workspace\\POMUsingPageFactory\\ScreenshotsTest\\" +scName+ ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		}

}
