package Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.MalformedURLException;


public class Mobile {

	public static void main(String[] args) throws MalformedURLException{
DesiredCapabilities dc= new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,11);
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"VinayEmulator");
		
		dc.setCapability(MobileCapabilityType.APP,"C:\\Users\\vc21352\\Downloads\\indiamart.apk");
		
		URL url=new URL("http://127.0.0.1:4723");
		 AndroidDriver driver = new AndroidDriver(url,dc);
		
	}

}
