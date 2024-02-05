package grouplavelpacage;

import org.testng.annotations.Test;

public class Group {
	@Test(groups= {"sanity"})
	public void onemeth()
	{
		System.out.println("This is sanity group");
	}
	@Test(groups= {"smoke"})
	public void two() 
	{
		System.out.println("this is a smoke group");
	}

}
