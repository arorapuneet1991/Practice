package testautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

public class BaseTest {
    static public WebDriver driver = null;
    static public JavascriptExecutor javascriptExecutor;

    @BeforeTest
    public static void getWebDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(opt);
    }

    public static JavascriptExecutor javaScriptDriver() {
        return (JavascriptExecutor) driver;
    }

    public void take() {
        TakesScreenshot takesScreenshot = ((TakesScreenshot) driver);
        File file = takesScreenshot.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "/report/a.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @AfterTest
    public static void tearDown() {
        driver.quit();
    }
}