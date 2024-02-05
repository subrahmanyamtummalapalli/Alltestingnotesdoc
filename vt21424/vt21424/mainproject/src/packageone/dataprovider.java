package packageone;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class dataprovider {
	public static WebDriver driver;
	static XSSFSheet sh;
	static XSSFWorkbook wb;
	static XSSFRow row;
	
	@Test(dataProvider="login")
	public void login(String un,String pwd) 
	{
		driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("login_button")).click();
		Reporter.log("Login is sucessful",true);driver.close();
	}
	@DataProvider(name="login")
	public Object[][] login()
	{
		
		Object data[][]= {{"saikiran147","Ojas123!"},{"Thippesh","Thippesh"},{"tulasidevi","tulasidevi"}};
		return data;
		}
	  public String[][] getExcelData(String fileName ) throws IOException{           
          String[][] data = null;       
          try
          {
           FileInputStream fis = new FileInputStream("C:\\Users\\sp21440\\Desktop\\DataproviderSheet.xlsx");
            wb = new XSSFWorkbook(fis);
            sh = wb.getSheetAt(0);
            row = sh.getRow(0);
           int noOfRows = sh.getPhysicalNumberOfRows();
           int noOfCols = row.getLastCellNum();
           System.out.println("noOfRows:"+noOfRows);
           System.out.println("noOfCols"+noOfCols);
           XSSFCell cell;
           data = new String[noOfRows-1][noOfCols];
           for(int i =1; i<noOfRows;i++){
             for(int j=0;j<noOfCols;j++){
                   row = sh.getRow(i);
                   cell= row.getCell(j);
                   data[i-1][j] = cell.getStringCellValue();
                   }
           }
          }
          catch (Exception e) {
                System.out.println("The exception is: " +e.getMessage());
                            }
          return data;
    }

}
