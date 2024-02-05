package project5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtablesssown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.get("https://wet-boew.github.io/v4.0-ci/demos/tables/tables-en.html#wb-auto-2");
		WebElement table1=driver.findElement(By.xpath("/html/body/main/section/div[1]/table/tbody"));
		List<WebElement> rows= table1.findElements(By.tagName("tr"));
		int rc= rows.size();
		System.out.println(rc);
		//int cc= driver.findElements(By.xpath("/html/body/main/section/div[1]/table/tbody/tr[1]/td")).size(); 
		//System.out.println(cc);
		int cc = driver.findElements(By.xpath("/html/body/main/section/div[1]/table/tbody/tr[1]/td")).size();
		System.out.println(cc);
		for(int i=1;i<=rc;i++)
		{
			String text = driver.findElement(By.xpath("/html/body/main/section/div[1]/table/tbody/tr["+i+"]/td[3]")).getText();
		System.out.println(text);
			//System.out.println();
//			for(int j=1;j<cc;j++)
//			{
//				String text = driver.findElement(By.xpath("/html/body/main/section/div[1]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
//				System.out.print(text+"    ");
//			}
//			
		}
		
		
	
	}

}
