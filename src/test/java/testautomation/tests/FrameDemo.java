package testautomation.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testautomation.BaseTest;
import testautomation.DataReader;
import testautomation.Page;

import java.io.IOException;
import java.util.Set;


public class FrameDemo extends BaseTest {
    Page page1 = new Page();
    DataReader dataReader = new DataReader();

    @Test
    public void main() throws IOException, InterruptedException {
        dataReader.data("Sheet1");
        driver.get("https://demo.automationtesting.in/Frames.html");


        driver.switchTo().frame("singleframe");

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("HI");

        driver.switchTo().defaultContent();

        System.out.println(driver.getTitle());
    }
}

