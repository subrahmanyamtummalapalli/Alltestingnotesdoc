package FailedSCTest;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners extends ReusableMethods implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println(result.getName());

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName());

	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName());
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(srcfile, new File("./" + "Screenshots/" + "failshot_" + result.getName() + "_" + ".jpg"));
		} catch (IOException e) {
		e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}
	
	

}
