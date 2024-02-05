package api.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name="data")
	public String[][] getAllData() throws Exception
	{
		String path="C:\\Users\\$P42000-5CVKF7CNLE6V\\sandeep\\SdetRestAssured\\excelData\\testData.xlsx";
		XlUtilities xl=new XlUtilities(path);
		
		int rows = xl.getRowCount("Sheet1");
		int cols = xl.getCellCount("Sheet1", 1);
		
		String data[][]=new String[rows][cols];
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				data[i-1][j]=xl.getCellData("Sheet1", i, j);
			}
		}
		return data;
	}
	
	
	
	
	@DataProvider(name="username")
	public String[] getUserName() throws Exception
	{
		String path="C:\\Users\\$P42000-5CVKF7CNLE6V\\sandeep\\SdetRestAssured\\excelData\\testData.xlsx";
		
		XlUtilities xl=new XlUtilities(path);
		int row = xl.getRowCount("Sheet1");
		
		String data[]=new String[row];
		for(int i=1;i<=row;i++)
		{
			data[i-1]=xl.getCellData("Sheet1", i, 1);
		}
		return data;
	}

}
