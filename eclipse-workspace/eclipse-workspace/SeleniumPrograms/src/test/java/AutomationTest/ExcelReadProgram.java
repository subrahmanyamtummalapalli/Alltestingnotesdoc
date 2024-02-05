package AutomationTest;

import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadProgram {
	
	@Test
	public void excelRead() throws Exception
	{
		File fs = new File("C:\\Users\\vc21352\\Desktop\\Book1.xlsx");
		FileInputStream fi = new FileInputStream(fs);
		XSSFWorkbook xw = new XSSFWorkbook(fi);
		XSSFSheet sh= xw.getSheetAt(0);
		String val = sh.getRow(1).getCell(1).getStringCellValue();
		System.out.println(val);
		xw.close();
		
	}

}
