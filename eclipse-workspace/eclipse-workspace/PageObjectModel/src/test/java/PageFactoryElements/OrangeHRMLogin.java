package PageFactoryElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLogin {
	
	private WebDriver driver;

	@FindBy(xpath = "//input[@name='username']")
	private WebElement username;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(xpath = "//*[@type='submit']")
	private WebElement login;
	
	public OrangeHRMLogin(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void loginPage()
	{
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		login.click();
	}
}