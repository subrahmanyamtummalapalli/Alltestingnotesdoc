package ListenersTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class RunScript extends ReuseableMethods {
	
	public void setUp()
	{
		loginPage();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void sc1()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void sc2()
	{
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void sc3()
	{
		Assert.assertEquals(true, false);
	}

}
