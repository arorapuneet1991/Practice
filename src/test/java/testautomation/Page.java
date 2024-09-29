package testautomation;

import org.openqa.selenium.By;

public class Page extends BaseTest {

    enum LOCATORS {

        LOGO("//a[@title='Live Cricket Score']");;


        private String locator;


        LOCATORS(String locator) {
            this.locator = locator;
        }
    }

    public String getTextFrom() {
        return driver.findElement(By.xpath(LOCATORS.LOGO.locator)).getText();
    }
}
