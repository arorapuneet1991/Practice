package interview.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import testautomation.BaseTest;

import java.time.Duration;

public class FluentWaitExample extends BaseTest {
    public void method() {
        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(5000))
                .pollingEvery(Duration.ofSeconds(400))
                .ignoring(StaleElementReferenceException.class);

        WebElement element = fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
    }
}
