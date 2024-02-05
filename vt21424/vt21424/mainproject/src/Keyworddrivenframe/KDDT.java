package Keyworddrivenframe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class KDDT {
	public static WebDriver driver;
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public void launchapp(String url)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
		
	}
	public void login(String un,String pwd)
	{
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("login_button")).click();
	}
	public void searchhotel()
	{
		Select loclistbox= new Select(driver.findElement(By.name("location")));
		loclistbox.selectByVisibleText("London");
		new Select(driver.findElement(By.name("room_nos"))).selectByIndex(2);
		WebElement checkIndate= driver.findElement(By.name("datepick_in"));
		checkIndate.clear();
		checkIndate.sendKeys("24/02/2022");
		WebElement checkoutdate= driver.findElement(By.name("datepick_out"));
		checkoutdate.clear();checkoutdate.sendKeys("25/02/2022");
		Select AdultperRoom= new Select(driver.findElement(By.name("adult_room")));
		AdultperRoom.selectByValue("2");
		WebElement searchbutton= driver.findElement(By.name("Submit"));searchbutton.click();
	}
	public void logout()
	{
		driver.findElement(By.linkText("Logout")).click();
	}
	public void close()
	{
		driver.close();
	}
	public int getrowcount(String xlpath, int sheetid) throws IOException {
		File src = new File(xlpath);
		fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(sheetid);
		int rc = sheet.getLastRowNum();
		return rc;
	}
	public  String getdata(int rowindex ,int colindex)
	{
		String data=sheet.getRow(rowindex).getCell(colindex).getStringCellValue();
		return data;
	}
		public static void main(String[] args) throws IOException {
			
		
		KDDT obj=new KDDT();
		int rc=obj.getrowcount("C:\\Users\\vt21424\\Desktop\\KDDTXL.xlsx", 0);
		for(int j=0;j<rc;j++)
		{
			for(int i=0;i<rc;i++)
			{
				String kw= obj.getdata(i, 0);
				if(kw.equalsIgnoreCase("la"))
				{
					obj.launchapp("https://adactinhotelapp.com/");
				}
				else if(kw.equalsIgnoreCase("ln"))
				{
					obj.login("Thippesh","Thippesh");
				}
				else if(kw.equalsIgnoreCase("sh"))
				{
					obj.searchhotel();
				}
				else if(kw.equalsIgnoreCase("lt"))
				{
					obj.close();
				}
				else if(kw.equalsIgnoreCase("ce"))
				{
					obj.close();
				}
			}
			}
		}
		

		}


