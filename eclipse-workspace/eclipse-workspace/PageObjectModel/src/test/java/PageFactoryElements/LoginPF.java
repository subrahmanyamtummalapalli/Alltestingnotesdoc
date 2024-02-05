package PageFactoryElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPF {
	
	WebDriver driver;
	
	public void loginPageNew(WebDriver driver1)
	{
		this.driver = driver1;
	}
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login")
	WebElement login;
	
	public void loginPage()
	{
		username.sendKeys("vinaychennuri1");
		password.sendKeys("8187826150");
		login.click();;
	}

}
