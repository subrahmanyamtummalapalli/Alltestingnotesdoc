package TestNGPractice;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class ParameterTest {	
	 @Parameters("browser")
	  @Test
	  public void testMethod(String browser) {		 
	    System.out.println("Browser: " + browser);
	  }
}
