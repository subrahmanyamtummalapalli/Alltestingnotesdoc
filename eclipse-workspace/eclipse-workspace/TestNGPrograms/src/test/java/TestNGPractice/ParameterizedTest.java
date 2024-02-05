package TestNGPractice;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {
	
	@Test
	@Parameters("browser")
	public void browserTest(String browser)
	{
		if(browser.equals("chrome"))
		{
			System.out.println("Chrome initialized successfully");
		}
		
		else if(browser.equals("edge"))
		{
			System.out.println("edge initialized successfully");
		}
	}

}
