package TestnGTopics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	
	@DataProvider(name="a1")
	public Object[][] sandeep()
	{
		return new Object[][]
				{
			      {"sandeepvelpula@gmail.com","sandeep"},
			      {"sandeep@gmail.com","sandeep"}
				};
	}
	@Test(dataProvider="a1")
	public void login(String un, String pwd)
	{
		System.out.println(un);
		System.out.println(pwd);
	}

}	
