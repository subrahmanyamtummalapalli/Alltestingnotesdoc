package TestNGPractice;

import org.testng.annotations.Test;

public class IgnoreTest {
	
	@Test
	public void test1()
	{
		System.out.println("Test1 pass");
	}
	
	@Test(enabled = false)
	public void test2()
	{
		System.out.println("Test2 pass");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Test3 pass");
	}

}
