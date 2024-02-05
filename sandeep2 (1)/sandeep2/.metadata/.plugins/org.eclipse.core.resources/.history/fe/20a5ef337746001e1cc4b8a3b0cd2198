package AllTopics;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
  public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
//		Dimension d=new Dimension(200,600);
//		driver.manage().window().setSize(d);
//		Point p=new Point(100,600);
//		driver.manage().window().setPosition(p);
		driver.findElement(By.name("email")).sendKeys("sandy1519467852@gmail.com");
		driver.findElement(By.name("password")).sendKeys("sandeep");
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();


		// Finding all the available links on webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));


		// Iterating each link and checking the response status
		for(int i=0;i<links.size();i++)
	      {
	    	 WebElement ele=links.get(i);
	    	 String url=ele.getAttribute("href");
	    	 verifyLink(url);
	      }


		driver.quit();
		}


		public static void verifyLink(String url) {
		try {
		URL link = new URL(url);
		HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
		httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
		httpURLConnection.connect();


		if (httpURLConnection.getResponseCode() == 200) {
		System.out.println(url + " - " + httpURLConnection.getResponseMessage());
		} else {
		System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
		}
		} catch (Exception e) {
		System.out.println(url + " - " + "is a broken link");
		}

}}
