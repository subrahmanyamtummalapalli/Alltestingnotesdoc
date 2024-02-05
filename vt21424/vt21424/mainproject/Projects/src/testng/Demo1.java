package testng;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo1 {
@Test
	public void methodes() 
	{
		System.out.println("Before Class");
	}
@Test 
public void BS()
{
	System.out.println("BEforeSuite");
	}
@BeforeSuite
public void BC()
{
System.out.println("fdenfgjk");	
}

}
