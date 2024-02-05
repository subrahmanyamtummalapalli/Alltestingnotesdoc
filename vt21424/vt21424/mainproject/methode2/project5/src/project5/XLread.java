package project5;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLread {


	public static void main(String[] args) throws Exception {
		File src= new File("C:\\Users\\vt21424\\Desktop\\Xl.xlsx"); 
		FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheetAt(0);
		for(int i=0;i<3;i++) {
		String un=sheet.getRow(i).getCell(0).getStringCellValue();
		String pws=sheet.getRow(i).getCell(1).getStringCellValue();
		System.out.println(un+"  "+pws);
		
		
	}
	}
}
