package AppiumTesting;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumInitialize {
	
	@Test
	public void test1() throws Exception
	{
		UiAutomator2Options options = new UiAutomator2Options();
		
		options.setDeviceName("VinayEmulator");
		
		options.setApp("C:\\Users\\vc21352\\eclipse-workspace\\AppiumTest1\\src\\test\\java\\APKFiles");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		
		driver.quit();

}
}