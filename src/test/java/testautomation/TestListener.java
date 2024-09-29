package testautomation;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener extends BaseTest implements ITestListener {

    public void onTestSuccess(ITestResult result) {
        take();
    }
}