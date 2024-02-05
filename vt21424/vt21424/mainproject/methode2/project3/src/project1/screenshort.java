package project1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshort {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/deals?ref_=nav_cs_gb");
		TakesScreenshot ts=(TakesScreenshot)d;
		File Login=ts.getScreenshotAs(OutputType.FILE);
		//Files.copy(Login, new File("D:\\screenshort.png"));
		
		Files.copy(Login, new File("./screenshort/Login.png"));
		
		

	}

}
