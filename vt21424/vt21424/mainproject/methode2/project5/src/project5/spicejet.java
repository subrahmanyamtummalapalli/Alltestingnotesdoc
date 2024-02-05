package project5;

import java.awt.Desktop.Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

@Test(invocationCount = 3)
public class spicejet {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//WebDriver d=new ChromeDriver();
		
		
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--disable-notifications");
		WebDriver d=new ChromeDriver(options);
		d.manage().window().maximize();
		d.get("https://www.spicejet.com/");
		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[1]/div[2]/input")).click();
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]")).click();
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div/div[2]/input")).click();
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[10]/div[1]/div[1]/div")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div[3]/div[3]/div[6]")).click();
	
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div")).click();
		for(int i=0;i<=5;i++)
		{
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();	
		}
		
		d.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[2]/div")).click();	
//		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[2]/div/div[2]")).click();
//		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[2]/div[2]/div[2]/div/div[3]/div")).click();
//		
		Thread.sleep(3000);
		d.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[6]/div/div[2]/div[2]/div/div[1]/div/div")).click();
		
		
		d.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[7]/div[2]/div")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@class='css-1dbjc4n r-1tf5bf9 r-1777fci r-1ww30s9']")).click();
		d.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
		d.navigate().back();
		//d.findElement(By.xpath("//*[text()='Govt. Employee']")).click();
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div/div[2]")).click();//pass
		for(int j=0;j<=2;j++)
		{
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[3]")).click();//++
		}
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[2]/div")).click();//done
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[2]/div/div[2]")).click();
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[2]/div[2]/div[2]/div/div[3]/div")).click();
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[2]/div")).click();
		d.findElement(By.xpath("//*[text()='Students']")).click();//student
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[7]/div[2]/div")).click();//searchbutton
		d.findElement(By.xpath("//*[@class='css-1dbjc4n r-1tf5bf9 r-1777fci r-1ww30s9']")).click();//checkbox
		d.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();//continue
		d.navigate().back();
		
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[1]")).click();//
		for(int k=0;k<3;k++)
		{
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[1]")).click();
		}
		for(int l=0;l<1;l++)
		{
			d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[1]")).click();
		}
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[2]/div")).click();
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[2]/div/div[2]")).click();
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[2]/div[2]/div[2]/div/div[3]/div")).click();
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[2]/div")).click();//done

		d.findElement(By.xpath("//*[text()='Senior Citizen']")).click();
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[7]/div[2]/div")).click();//searchbutton
		d.findElement(By.xpath("//*[@class='css-1dbjc4n r-1tf5bf9 r-1777fci r-1ww30s9']")).click();//checkbox
		d.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();//continue
		d.navigate().back();
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[1]")).click();//
		for(int m=0;m<3;m++)
		{
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[3]")).click();
		}
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[2]/div")).click();
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[2]/div/div[2]")).click();
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[2]/div[2]/div[2]/div/div[3]/div")).click();
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[2]/div")).click();//dones
		d.findElement(By.xpath("//*[text()='Armed Forces']")).click();
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[7]/div[2]/div")).click();//searchbutton
		d.findElement(By.xpath("//*[@class='css-1dbjc4n r-1tf5bf9 r-1777fci r-1ww30s9']")).click();//checkbox
		d.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
		d.navigate().back();
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[1]")).click();//
		for(int m=0;m<3;m++)
		{
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[3]")).click();
		}
		d.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[2]/div")).click();//dones



		
		//d.quit();
		System.out.println("successfully booked");

	}

}
