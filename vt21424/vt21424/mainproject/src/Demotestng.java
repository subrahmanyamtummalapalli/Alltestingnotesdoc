import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demotestng {
	@BeforeSuite()
	public void BS()
	{
		System.out.println("bs");
	}
	@AfterSuite
	public void AS()
	{
		System.out.println("AS");
	}
	
	@BeforeMethod
	public void BM()
	{
		System.out.println("BM");
	}
	@Test(priority=-1)
	public void test()
	{
		System.out.println("TEST");
	}
	@AfterMethod
	public void AM()
	{
		System.out.println("AM");
	}
	@AfterClass
	public void AC()
	{
		System.out.println("AC");
	}
	@BeforeClass()
	public void BC()
	{
		System.out.println("BC");
	}
	

}
