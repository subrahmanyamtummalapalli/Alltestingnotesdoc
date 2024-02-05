package project5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class KDT {
	public static WebDriver driver;
	public static XSSFSheet sheet;
	public static XSSFWorkbook wb;
	public static FileInputStream fis;

	public void Lanchapp(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	public void login(String un, String pwd) {
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("login_button")).click();
	}

	public void searchhotel() {
		Select loclistbox = new Select(driver.findElement(By.name("location")));
		loclistbox.selectByVisibleText("London");
		new Select(driver.findElement(By.name("room_nos"))).selectByIndex(2);
		WebElement checkIndate = driver.findElement(By.name("datepick_in"));
		checkIndate.clear();
		checkIndate.sendKeys("23/02/2022");
		WebElement checkoutdate = driver.findElement(By.name("datepick_out"));
		checkoutdate.clear();
		checkoutdate.sendKeys("25/02/2022");
		Select AdultperRoom = new Select(driver.findElement(By.name("adult_room")));
		AdultperRoom.selectByValue("2");
		WebElement searchbutton = driver.findElement(By.name("Submit"));
		searchbutton.click();
	}

	public void logout() {
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}

	public void close() {
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

	public String getdata(int rowindex, int colindex) {
		String data = sheet.getRow(rowindex).getCell(colindex).getStringCellValue();
		return data;
	}

	public static void main(String[] args) throws Exception {
		KDT obj = new KDT();
		int rc = obj.getrowcount("C:\\Users\\vt21424\\Desktop\\XLDDT.xlsx", 0);
		//for (int j = 1; j < 8; j++) {
		for (int i = 0; i <= rc; i++) {
		String kw = obj.getdata(i, 0);
		System.out.println(kw);
		if (kw.equalsIgnoreCase("la")) {
		obj. Lanchapp("https://adactinhotelapp.com/");
		} else if (kw.equalsIgnoreCase("Ln")) {
			int r = obj.getrowcount("C:\\Users\\vt21424\\Desktop\\XLDDT.xlsx", 1);
			for(int m=0;m<=r;m++) {
				String username=obj.getdata(m, 0);
				String password=obj.getdata(m, 1);
				
				obj.login(username, password);
		//obj.login(username,password);
		obj.searchhotel();
		obj.logout();
		//obj.close();
		obj.Lanchapp("https://adactinhotelapp.com/");
//		} else if (kw.equalsIgnoreCase("Sh")) {
//		obj.searchhotel();
//		} else if (kw.equalsIgnoreCase("Lg")) {
//		obj.logout();
//		} else if (kw.equalsIgnoreCase("Cl")) {
//		obj.close();
		}
		}
		}

	}
	}

