package DDTframwork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExLSheet {
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File src=new File("C:\\Users\\vt21424\\Desktop\\Book 7 (1).xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rc=sheet.getLastRowNum();
		System.out.println(rc);
		for(int i=0;i<=rc;i++)
		{
			String un=sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(un);
			String pwd=sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(pwd);
			System.setProperty("Webdriver.chrome.driver", "C:\\Users\\vt21424\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://ojasit-my.sharepoint.com/personal/veerasubrahmanyam_tummalapalli_ojas-it_com/_layouts/15/onedrive.aspx?listurl=%2Fpersonal%2Fkalyan%5Fnathari%5Fojas%2Dit%5Fcom%2FDocuments&login_hint=veerasubrahmanyam%2Etummalapalli%40ojas%2Dit%2Ecom&id=%2Fpersonal%2Fkalyan%5Fnathari%5Fojas%2Dit%5Fcom%2FDocuments%2FOILC%2FOILC%5FRESOURECE%5FINFO%2FOILC%20%2D%20503%2FPPT%27s%20shared%2FTRAINING%20SESSION%20PPT%2FTestNG%203%281%2D3%2D2022%29%2Epdf&parent=%2Fpersonal%2Fkalyan%5Fnathari%5Fojas%2Dit%5Fcom%2FDocuments%2FOILC%2FOILC%5FRESOURECE%5FINFO%2FOILC%20%2D%20503%2FPPT%27s%20shared%2FTRAINING%20SESSION%20PPT");
			
			
		}
		
	}

}
