package ListenersPractise;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class TestRun {
	
	@Test
	public void test1()
	{
		System.out.println("Test 1 Executed");
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void test3()
	{
		System.out.println("Test 3 Executed");
	}

}
