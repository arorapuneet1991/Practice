package interview.testng;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MySampleListener implements ITestListener {
    public void onTestSuccess(ITestResult result) {
        System.out.println("PASSED");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("FAILED");
    }

}
