package ListenersTest;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners extends ReuseableMethods implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println(result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName());
		failedSc(result.getMethod().getMethodName());
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
