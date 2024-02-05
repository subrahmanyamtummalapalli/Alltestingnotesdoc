import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://wet-boew.github.io/v4.0-ci/demos/tables/tables-en.html#wb-auto-2");
		WebElement table1=driver.findElement(By.xpath("/html/body/main/section/div[3]/table/tbody"));
		List<WebElement>row=table1.findElements(By.tagName("tr"));
		int rows=row.size();
		System.out.println(rows);
		List<WebElement> colom=table1.findElements(By.xpath("td"));
		

	}

}
