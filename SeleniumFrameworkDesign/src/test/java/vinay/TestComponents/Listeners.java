package vinay.TestComponents;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import vinay.Resources.ExtentReporterNG;

public class Listeners extends Basetest implements ITestListener {
	ExtentTest test;
	ExtentReports extent=ExtentReporterNG.getReportObject();
	ThreadLocal<ExtentTest> extentTest=new ThreadLocal<ExtentTest>();
    @Override
    public void onTestStart(ITestResult result) {
        // Called when a test method starts
    	test=extent.createTest(result.getMethod().getMethodName());
    	extentTest.set(test); //unique thread id(ErrorValidationTest)->test
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // Called when a test method passes
    	test.log(Status.PASS, "Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // Called when a test method fails
    	extentTest.get().fail(result.getThrowable());
    	
    	try {
			driver=(WebDriver)result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    	String filePath = null;
		try {
			filePath = getScreenshot(result.getMethod().getMethodName(),driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	extentTest.get().addScreenCaptureFromPath(filePath, result.getMethod().getMethodName());
    	//screen shot,attach to report
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // Called when a test method is skipped
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // Called when a test fails but is within success percentage
    }

    @Override
    public void onStart(ITestContext context) {
        // Called before any test method in the current class is invoked
    }

    @Override
    public void onFinish(ITestContext context) {
        // Called after all test methods in the current class have run
    	extent.flush();
    }
}

