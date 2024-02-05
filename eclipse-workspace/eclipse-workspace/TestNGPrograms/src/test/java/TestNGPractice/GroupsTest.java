package TestNGPractice;

import org.testng.annotations.Test;

public class GroupsTest {
	
	@Test (groups = {"Smoke Test", "Sanity Test"})
	public void test1()
	{
		System.out.println("Test1 Passed");
	}

	@Test(groups = {"Sanity Test"})
	public void test2()
	{
		System.out.println("Test2 passed");
	}
}
