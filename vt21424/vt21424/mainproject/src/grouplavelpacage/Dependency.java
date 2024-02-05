package grouplavelpacage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependency {
	@Test(dependsOnMethods= {"two","three"})
	public void one()
	{
		System.out.println("methode one");
		
	}
	@Test(invocationCount=4)
	public void two()
	{
		System.out.println("methode two");
	}
	@Test(priority=1)
	public void three()
	{
		System.out.println("threee");
		Reporter.log("successfull");
		Reporter.log("successfull",true);
	}
}
