package newproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Propertiesfile {

	public static void main(String[] args) throws IOException {
		//WebDriver driver;
		Properties por=new Properties();
		FileInputStream fis=new FileInputStream("D:\\Users\\vt21424\\mainproject\\configure.properties");
		por.load(fis);
		String browser1=por.getProperty("browser");
		System.out.println(browser1);
		WebDriver driver=new ChromeDriver();
		driver.get(por.getProperty("URL"));
		driver.findElement(By.name(por.getProperty("name"))).sendKeys(por.getProperty("username"));
		driver.findElement(By.name(por.getProperty("pws"))).sendKeys(por.getProperty("password"));
		driver.findElement(By.name(por.getProperty("login"))).click();

	}
}
