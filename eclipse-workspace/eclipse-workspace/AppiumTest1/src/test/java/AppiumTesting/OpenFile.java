package AppiumTesting;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;

public class OpenFile {
	
	@Test
	public void launchBrowser() throws Exception {
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		
		desiredCapabilities.setCapability("platformName", "Android");
		
		desiredCapabilities.setCapability("deviceName", "VinayEmulator");
		
		desiredCapabilities.setCapability("app", "C:\\Users\\vc21352\\eclipse-workspace\\AppiumTest1\\src\\test\\java\\APKFiles\\ApiDemos-debug.apk");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), desiredCapabilities);
		
		driver.quit();


	}

}
