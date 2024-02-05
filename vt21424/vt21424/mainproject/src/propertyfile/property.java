package propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class property {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver;
		Properties por=new Properties();
		FileInputStream fis=new FileInputStream("D:\\Users\\vt21424\\mainproject\\configure.properties");
		por.load(fis);
		String browser1=por.getProperty("browser");
		System.out.println(browser1);

	}

}
