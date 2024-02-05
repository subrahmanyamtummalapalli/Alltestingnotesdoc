package grouplavelpacage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v103.network.model.ReportId;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert1 {
	
	public static WebDriver driver;
	@Test
	public void testCaseVerifyHomePage() {
		
		driver= new ChromeDriver();
		driver.get("http://google.com");
//		String exp="Google";
//		String act=driver.getTitle();
		Assert.assertNotEquals("Google",driver.getTitle());
		Assert.assertTrue(true);
		
		Reporter.log("success",true);
	
	}
	

}
