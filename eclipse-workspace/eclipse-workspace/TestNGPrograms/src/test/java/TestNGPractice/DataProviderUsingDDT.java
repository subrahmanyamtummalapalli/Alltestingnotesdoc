package TestNGPractice;
import java.io.File;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class DataProviderUsingDDT {
	
	public static WebDriver driver;
	
        @DataProvider(name = "cred")
        public Object[][] userData() throws Throwable
        {
        	File f = new File("C:\\Users\\vc21352\\Downloads\\Adactin.xlsx");		
    		FileInputStream fis = new FileInputStream(f);	
    		XSSFWorkbook wb = new XSSFWorkbook(fis);	
    		XSSFSheet sheet = wb.getSheetAt(0);
    		int rc = sheet.getLastRowNum();		
    		String username = sheet.getRow(2).getCell(0).getStringCellValue();	
    		String password = sheet.getRow(2).getCell(1).getStringCellValue();	
    		Object[][] data = null;
    		data[2][0] = username;
    		data[2][1] = password;
    		System.out.println(username);	
    		System.out.println(password);
    		wb.close();
    		return data;
        }
        @Test(dataProvider = "cred")
        public void launchData(String Username, String Password) {
        	
        	WebDriverManager.chromedriver().setup();
    	    driver = new ChromeDriver();
    	    driver.manage().window().maximize();
    	    driver.get("https://adactinhotelapp.com/");
    		driver.findElement(By.name("username")).sendKeys(Username);
    		driver.findElement(By.name("password")).sendKeys(Password);
    		driver.findElement(By.name("login")).click();
    		driver.close();
        	
        }
        
}


