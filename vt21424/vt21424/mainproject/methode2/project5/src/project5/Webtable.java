package project5;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) throws Exception {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		d.get("https://wet-boew.github.io/v4.0-ci/demos/tables/tables-en.html#wb-auto-2");
		WebElement table1=d.findElement(By.xpath("/html/body/main/section/div[1]/table/tbody"));
		
		java.util.List<WebElement> row= table1.findElements(By.tagName("tr"));
		int rc= row.size(); 
		System.out.println(rc);
		  int cc= d.findElements(By.xpath("/html/body/main/section/div[1]/table/tbody/tr[1]/td")).size();
		System.out.println(cc);
		WebElement table2=d.findElement(By.xpath("/html/body/main/section/div[3]/table/tbody"));
		java.util.List<WebElement> row1= table2.findElements(By.tagName("tr"));
		int rc1=row1.size();
		System.out.println(rc1);
		String a=d.findElement(By.xpath("/html/body/main/section/div[1]/table/tbody/tr[6]/td[3]")).getText();
		System.out.println(a);
		String b=d.findElement(By.xpath("/html/body/main/section/div[1]/table/tbody/tr[2]/td[5]")).getText();
		System.out.println(b);
		
		for(int k=1;k<=rc1;k++);
		{
		
		for(int i= 1; i<= rc; i++) 
		{
			for(int j= 1; j<= cc; j++)
			{
//				String x= "/html/body/main/section/div[1]/table/tbody/tr[";
//				String y= "]/td[";
//				String z= "]";
				String X= d.findElement(By.xpath("/html/body/main/section/div[1]/table/tbody/tr["+ i+ "]/td["+ j+ "]")).getText();
				System.out.print(X+ " ");
			}
			System.out.println();
			}
		Thread.sleep(5000);
		
		
		
		}
	}

}
