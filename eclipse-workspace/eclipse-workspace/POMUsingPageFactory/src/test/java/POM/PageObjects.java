package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
	
	private WebDriver driver;
	
	@FindBy(name="username")
	private WebElement usernameInput;
	
	@FindBy(name="password")
	private WebElement passwordInput;
	
	@FindBy(id="login")
	private WebElement loginButton;
	
	public PageObjects(WebDriver driver) {
	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void crediantials(String username, String password)
	{
		usernameInput.sendKeys(username);
		passwordInput.sendKeys(password);
	}

	public void loginData()
	{
		loginButton.click();
	}

}
