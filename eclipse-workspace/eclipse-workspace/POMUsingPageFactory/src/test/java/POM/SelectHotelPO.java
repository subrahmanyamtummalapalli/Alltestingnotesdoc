package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPO {
	
	private WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(css = "#continue")
	private WebElement continueButton;
	
	@FindBy(linkText = "Logout")
	private WebElement Logout;
	
	@FindBy(linkText = "Click here to login again")
	private WebElement loginAgain;
	
	public SelectHotelPO(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, SelectHotelPO.class);
	}
	
	public void selectHotel()
	{
		radiobutton.click();
		continueButton.click();	
	}
	
	public void logoutPage()
	{
		Logout.click();
		loginAgain.click();
	}

}
