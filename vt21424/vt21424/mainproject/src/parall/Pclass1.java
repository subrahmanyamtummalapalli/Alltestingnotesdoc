package parall;

import org.testng.annotations.Test;

public class Pclass1 {
	@Test(dependsOnMethods= {"test4"})
	public void test3()
	{
		System.out.println("testtree");
	}
	@Test
	public void test4()
	{
		System.out.println("testfourt");
	}
	

}
