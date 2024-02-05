package AndroidTest;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumRun {
	public static UiAutomator2Options op;
	public static AndroidDriver driver;
	
	@Test
	public void mobileRun() throws MalformedURLException
	{
		op = new UiAutomator2Options();
		op.setDeviceName("vinay");
		op.setApp("C://Users//vc21352//eclipse-workspace//AppiumTest//src//test//java//Resources//ApiDemos-debug.apk");
	    driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), op);
		driver.quit();
	}

}
