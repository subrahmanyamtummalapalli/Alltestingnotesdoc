package project5;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PassTest extends DDTPASS{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DDTPASS dp=new DDTPASS();
		dp.launchapp();
		int rowcount1 = dp.rowcount1("C:\\Users\\vt21424\\Desktop\\XLDDT.xlsx", 1);
		for (int i = 0; i <=rowcount1; i++) {
			String username = dp.getdata(i, 0);
			String password = dp.getdata(i, 1);
			dp.login(username, password);
			dp.searchhotel();
			WebElement element = driver.findElement(By.id("hotels"));
			XSSFCell cell = sheet.getRow(i).createCell(2);
			if(element.isDisplayed())
			{
				cell.setCellValue("pass");
			}
			else
			{
				cell.setCellValue("fail");
			}
			FileOutputStream fos =new FileOutputStream(src);
			wb.write(fos);
			dp.logout();
		}
	}

}
