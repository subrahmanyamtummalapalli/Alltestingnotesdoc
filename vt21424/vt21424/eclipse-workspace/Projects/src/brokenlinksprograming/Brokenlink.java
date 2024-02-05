package brokenlinksprograming;



import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlink {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 	WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    driver.get("https://www.naukri.com/");
		    Thread.sleep(5000);
		    List<WebElement> links = driver.findElements(By.tagName("a"));
		    System.out.println("Total links are "+links.size());
		    for(int i=0; i<links.size(); i++) {
		    WebElement element = links.get(i);
		    String url=element.getAttribute("href");
		    verifyLink(url);
		    }
		    }
		    public static void verifyLink(String urlLink) {
		            try {
		    URL link = new URL(urlLink);
		    HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
		    httpConn.setRequestMethod("HEAD");
		    httpConn.connect();
		    int respCode =200;
		    respCode =httpConn.getResponseCode();
		    if(respCode >= 400){
		        System.out.println(link+" is a broken link");
		        System.out.println();
		        }
		        else{
		        System.out.println(link+" is a valid link");
		        }

		    }
		    catch (Exception e) {
		    }
		        }
		}

	


