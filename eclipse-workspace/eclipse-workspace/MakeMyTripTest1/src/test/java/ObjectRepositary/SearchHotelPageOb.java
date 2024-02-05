package ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchHotelPageOb {
	
private WebDriver driver;

    @FindBy(xpath="(//span[@class='chNavText darkGreyText'])[2]")
    private WebElement hotel;
	
	@FindBy(xpath="//input[@placeholder='From']")
	private WebElement FromDropdown;
	
	@FindBy(id="toCity")
	private WebElement ToDropdown;
	
      public SearchHotelPageOb(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void hotelsClick()
	{
		hotel.click();
	}
	
	
	public void fromSelect()
	{
		Select fromLoc = new Select(FromDropdown);
		fromLoc.selectByIndex(0);
	}


}
