package project5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Headingwebtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		d.get("https://wet-boew.github.io/v4.0-ci/demos/tables/tables-en.html#wb-auto-2");
		WebElement table1=d.findElement(By.xpath("/html/body/main/section/div[1]/table/tbody"));
		List<WebElement> row=table1.findElements(By.tagName("tr"));
		int rowcount=row.size();
		System.out.println(rowcount);
		WebElement table2=d.findElement(By.xpath("/html/body/main/section/div[1]/table/tbody/tr[1]"));
		List<WebElement> colum=table2.findElements(By.tagName("td"));
		int cc=colum.size();
		System.out.println(cc);
		for(int m=1;m<=cc;m++) 
		{
			String y=d.findElement(By.xpath("/html/body/main/section/div[3]/table/thead/tr/th["+m+"]")).getText();
			System.out.println(y+" ");
		}
		for (int i = 1; i <=rowcount; i++) {
			for (int j = 1; j <=cc; j++) {
				
				
//			WebElement data=d.findElement(By.xpath("/html/body/main/section/div[1]/table/tbody/tr["+i+"]/td["+j+"]"));
//			data.getText();
//			System.out.println(data+" ");
//			System.out.println();
				String X= d.findElement(By.xpath("/html/body/main/section/div[1]/table/tbody/tr["+ i+ "]/td["+ j+ "]")).getText();
				System.out.print(X+ " ");
				
			}
			System.out.println(" ");
		}
		
		
	

	}

}
