package testautomation.tests;

import org.openqa.selenium.By;
import testautomation.BaseTest;
import testautomation.DataReader;
import org.testng.annotations.Test;
import testautomation.Page;

import java.io.IOException;
import java.util.Set;

public class Script extends BaseTest {
    Page page1 = new Page();
    DataReader dataReader = new DataReader();

    @Test
    public void main() throws IOException, InterruptedException {
        dataReader.data("Sheet1");
        driver.get("https://demo.automationtesting.in/Windows.html");
        //Assert.assertTrue(false, "");
        // page1.getTextFrom();
        String parent = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[contains(.,'Open New Seperate Windows')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-primary' and contains(.,'click')]")).click();

        Thread.sleep(1000);
        System.out.println();

        Set<String> handles = driver.getWindowHandles();

        for (String str : handles) {
            if (!str.equals(parent)) {

                driver.switchTo().window(str);
                System.out.println("title->" + driver.getTitle());
            }
        }
        driver.switchTo().window(parent);
        System.out.println("title->" + driver.getTitle());

    }
}
