package AppiumTesting;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class LaunchAppium 

{
    
public static AndroidDriver driver;
	
	public static void main(String[] args) throws MalformedURLException {	
		
		UiAutomator2Options options =new UiAutomator2Options();
	
        options.setDeviceName("VinayEmulator");

        options.setApp("C:\\Users\\vc21352\\eclipse-workspace\\AppiumAutomation\\src\\test\\java\\resources\\ApiDemos-debug.apk");
   
        driver= new AndroidDriver(new URL("http://127.0.0.1:4723"), options );
        
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();

        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();

        driver.findElement(By.id("android:id/checkbox")).click();

        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
       
        driver.quit();
	
}

}
