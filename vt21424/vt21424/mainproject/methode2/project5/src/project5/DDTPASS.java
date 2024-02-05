package project5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class DDTPASS {
		public static WebDriver driver;
		public static FileInputStream fis;
		public static XSSFWorkbook wb;
		public static XSSFSheet sheet;
		static File src;
		public void launchapp() throws Exception
		{
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
			//Screen shot purpose
			TakesScreenshot ts=(TakesScreenshot) driver;
			File Login=ts.getScreenshotAs(OutputType.FILE);
			Files.copy(Login, new File("D:\\screenshort.png"));
		}
		public void login(String username,String password) 
		{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.className("login_button")).click();
		}
		public void searchhotel() 
		{
			Select loclistbox=new Select(driver.findElement(By.name("location")));
			loclistbox.selectByVisibleText("London");
			new Select(driver.findElement(By.name("room_nos"))).selectByIndex(2);
			WebElement checkindata=driver.findElement(By.name("datepick_in"));
			WebElement checkoutdata=driver.findElement(By.name("datepick_out"));
			checkindata.clear();
			checkindata.sendKeys("17/2/2020");
			checkoutdata.clear();
			checkoutdata.sendKeys("19/02/2022");
			Select adult=new Select(driver.findElement(By.name("adult_room")));
			driver.findElement(By.name("adult_room")).click();
		}
		public void logout() 
		{
			driver.findElement(By.linkText("Logout")).click();
			driver.close();
		}
		public int rowcount1(String Xlpath,int sheetid) throws IOException
		{
			src=new File(Xlpath);
			fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			 sheet=wb.getSheetAt(sheetid);
			int rc=sheet.getLastRowNum();
			return rc;
		}
		public String getdata(int rowindex, int colindex)
		{
			String data=sheet.getRow(rowindex).getCell(colindex).getStringCellValue();
			return data;
		}	


	}
