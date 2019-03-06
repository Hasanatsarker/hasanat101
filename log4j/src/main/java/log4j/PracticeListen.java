package log4j;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class PracticeListen implements ITestListener {

	public void onTestStart(ITestResult result) {
	
		System.out.println("my test start for chrome");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("my test success facebook page");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("my test Failed for facebook");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("my test Skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("my test SuccessPercentage");
		
	}

	public void onStart(ITestContext context) {
		System.out.println("my test onStart");
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("my test onFinish");
	}

}
