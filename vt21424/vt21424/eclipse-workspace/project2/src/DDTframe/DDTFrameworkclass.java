package DDTframe;
import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DDTFrameworkclass {
	
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
			
			
		}
	}
}
