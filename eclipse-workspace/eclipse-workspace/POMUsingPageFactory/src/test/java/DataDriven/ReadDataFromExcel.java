package DataDriven;
import java.io.File;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromExcel {
	
	
	@DataProvider(name = "loginData")
	public void cred() throws IOException
	{
		File ab = new File("C:\\Users\\vc21352\\Desktop\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(ab);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		String username = sh.getRow(0).getCell(1).getStringCellValue();
		String password = sh.getRow(0).getCell(2).getStringCellValue();
		wb.close();
		//return new Object[][] {{username,password}};
		
	}
	
	@Test(dataProvider = "loginData")
	public void runTest(String username, String password)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login")).click();

	}

}
