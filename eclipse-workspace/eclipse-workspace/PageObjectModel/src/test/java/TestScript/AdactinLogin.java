package TestScript;
import ReusableMethods.LoginPageMethods;
import ObjectRepository.LoginElements;

public class AdactinLogin extends LoginPageMethods {

	public static void main(String[] args) throws Throwable {
		
		LoginElements le = new LoginElements();
		loginPage();
		sc("Login");
        driver.findElement(le.UserName).sendKeys("vinaychennuri1");
        driver.findElement(le.PassWord).sendKeys("8187826150");
        driver.findElement(le.Login).click();
        sc("Search Hotel");
        driver.close();
        
	}

}
