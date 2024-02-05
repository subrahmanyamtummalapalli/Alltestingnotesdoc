package project5;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?gs_ssp=eJzj4tVP1zc0TDY1LTfJMLQwYLRSNagwTkpOsjRMNbFMS7Q0TkoxtjKoSDI2TjU1SzFMNjI3t0hNtvQSKSpTKMkvLSpWSMxLUSgpSixLzSkGAC2yFuQ&q=rv+tours+and+travels&rlz=1C1CHBD_enIN984IN984&oq=rv&aqs=chrome.5.69i57j46i433i512j46i199i433i465i512j0i131i433i512j0i512j46i175i199i512j0i433i512j46i175i199i512j0i131i433i512j0i271.4071j0j7&sourceid=chrome&ie=UTF-8");
		Thread.sleep(5000);
		//List<WebElement>  links=(driver.findElement(By.tagName("a")));
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0; i<links.size(); i++) {
			WebElement element = links.get(i);
			String url=element.getAttribute("href");
			verifyLink(url);
		}
		}
		// The below function verifyLink(String urlLink) verifies any broken links and return the server status.
		public static void verifyLink(String urlLink) {
		        //Sometimes we may face exception "java.net.MalformedURLException". Keep the code in try catch block to continue the broken link analysis
		        try {
		//Use URL Class - Create object of the URL Class and pass the urlLink as parameter
		URL link = new URL(urlLink);
		// Create a connection using URL object (i.e., link)
		HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
		//Set the timeout for 2 seconds
		httpConn.setConnectTimeout(2000);
		//connect using connect method
		httpConn.connect();
		//use getResponseCode() to get the response code.
		if(httpConn.getResponseCode()== 200) {
		System.out.println(urlLink+" - "+httpConn.getResponseMessage());
		}
		if(httpConn.getResponseCode()== 404) {
		System.out.println(urlLink+" - "+httpConn.getResponseMessage());
		}
		}
		//getResponseCode method returns = IOException - if an error occurred connecting to the server.
		catch (Exception e) {
		//e.printStackTrace();
		}
		}
	}

		
		

	


