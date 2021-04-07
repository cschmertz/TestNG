package com.Vytrack.testscripts;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.base.Environment;
import com.Vytrack.base.TestBase;
import com.Vytrack.pages.framesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class frames extends TestBase {

    framesPage fp = new framesPage();

    @Test
    @Environment(url = "url_5")
    public void testingFrames(){

        BrowserUtils.waitFor(2);

        List<WebElement> frames = driver.findElements(By.tagName("frame"));

        for (WebElement each:frames) {

            Assert.assertTrue(fp.frameTop.isDisplayed());
            Assert.assertTrue(fp.bottomFrame.isDisplayed());

            System.out.println("Attribute name of each frame is "+each.getAttribute("name"));

        }
        System.out.println("Attribute name of Top frame is ");
        System.out.println(fp.frameTop.getAttribute("name"));
        System.out.println("Attribute name of Top frame is ");
        System.out.println(fp.bottomFrame.getAttribute("name"));

        System.out.println("Number of frames on the page that are visible "+frames.size());

        BrowserUtils.waitFor(2);

        List<WebElement> nestedFrames = driver.switchTo().frame(fp.frameTop).findElements(By.tagName("frame"));

        for (WebElement each:nestedFrames) {

            Assert.assertTrue(fp.leftFrame.isDisplayed());
            Assert.assertTrue(fp.middleFrame.isDisplayed());
            Assert.assertTrue(fp.rightFrame.isDisplayed());

            System.out.println("Attribute name of each frame is "+each.getAttribute("name"));


        }
        System.out.println("Attribute name of left frame is ");
        System.out.println(fp.leftFrame.getAttribute("name"));
        System.out.println("Attribute name of middle frame is ");
        System.out.println(fp.middleFrame.getAttribute("name"));
        System.out.println("Attribute name of right frame is ");
        System.out.println(fp.rightFrame.getAttribute("name"));

        System.out.println("Number of frames on the page that are nested "+nestedFrames.size());


    }

    @Test
    @Environment(url = "url_6")
    public void testingIframes(){

        String expected = "Test Passed";

        BrowserUtils.waitFor(4);
        driver.switchTo().frame(fp.iframe).findElement(By.id("tinymce")).clear();
        BrowserUtils.waitFor(4);
        driver.findElement(By.id("tinymce")).sendKeys(expected);
        BrowserUtils.waitFor(4);

        String actual = fp.inputText.getText();
        System.out.println("Actual "+actual);
        System.out.println("Expected "+expected);

        Assert.assertEquals(actual,expected);
        System.out.println(actual.equals(expected));






    }
}
