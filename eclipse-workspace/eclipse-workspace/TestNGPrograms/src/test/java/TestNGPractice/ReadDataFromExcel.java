package TestNGPractice;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Throwable {
		
		File f = new File("C:\\Users\\vc21352\\Downloads\\Adactin.xlsx");		
		FileInputStream fis = new FileInputStream(f);	
		XSSFWorkbook wb = new XSSFWorkbook(fis);	
		XSSFSheet sheet = wb.getSheetAt(0);
		int rn = sheet.getLastRowNum();		
		String entry1 = sheet.getRow(1).getCell(0).getStringCellValue();	
		System.out.println(entry1);	
		//System.out.println(rn);		
		for(int i=0;i<=rn;i++)
		{		
			String entry2 = sheet.getRow(i).getCell(0).getStringCellValue();
		//	System.out.println(entry2);	
		}	
		wb.close();

	}

}
