package project5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtableprogram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		d.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		WebElement table1=d.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div[2]/table/tr[1]"));
		List<WebElement> row= table1.findElements(By.tagName("tr"));
		int rc= row.size(); 
		System.out.println(rc);
//		 int cc= d.findElements(By.xpath("/html/body/main/section/div[1]/table/tbody/tr[1]/td")).size();
//			System.out.println(cc);
//			WebElement table2=d.findElement(By.xpath("/html/body/main/section/div[3]/table/tbody"));
//			java.util.List<WebElement> row1= table2.findElements(By.tagName("tr"));
//			int rc1=row1.size();
//			System.out.println(rc1);

	}

}
