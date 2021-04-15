package com.Vytrack.testscripts;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.base.Environment;
import com.Vytrack.base.TestBase;
import com.Vytrack.pages.multipleWindowsPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class multipleWindows extends TestBase {

    multipleWindowsPage mw = new multipleWindowsPage();

    @Test
    @Environment(url = "url_15")
    public void testWindows(){
        String currentWindow = driver.getWindowHandle();

        mw.link.click();

        BrowserUtils.waitFor(2);
        Set<String> windowHandle = driver.getWindowHandles();

        for (String each:windowHandle) {

            driver.switchTo().window(each);

        }


        String actual = mw.newWindow.getText();
        String expected = "New Window";
        System.out.println("Actual : "+actual);
        System.out.println("Expected : "+expected);
        Assert.assertEquals(actual,expected);
        Assert.assertTrue(mw.newWindow.isDisplayed());
        BrowserUtils.waitFor(2);
        for (String each:windowHandle) {

            driver.switchTo().window(currentWindow);

        }


        String actualHome = mw.HomePage.getText();
        String expectedHome = "Opening a new window";
        System.out.println("Actual Home Page: "+actualHome);
        System.out.println("Expected Home Page: "+expectedHome);
        Assert.assertEquals(actualHome,expectedHome);
        Assert.assertTrue(mw.HomePage.isDisplayed());


    }
}
