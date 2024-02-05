package dataprovader;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Totalnolinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ChromeOptions option=new ChromeOptions();
		option.addArguments("__disadle notifications");
		driver.get("https://www.google.com/search?q=google&rlz=1C1GCEU_enIN1014IN1014&oq=google&aqs=chrome..69i57.10326517j0j7&sourceid=chrome&ie=UTF-8");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int totallinks=links.size();
		System.out.println(totallinks);
		for(WebElement i:links)
		{
			System.out.println(i.getText());
		}
	
	}

}
