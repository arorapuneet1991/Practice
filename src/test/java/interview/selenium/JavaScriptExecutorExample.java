package interview.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import testautomation.BaseTest;

public class JavaScriptExecutorExample extends BaseTest {
    public void method() {
        JavascriptExecutor jsdriver = javaScriptDriver();

        jsdriver.executeScript("alert('This is my alert'')");

        jsdriver.executeScript("window.scrollBy(0,500)");

        WebElement button = driver.findElement(By.xpath(""));
        jsdriver.executeScript("argument[0].click()", button);
    }

}
