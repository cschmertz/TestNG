package com.Vytrack.testscripts;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.base.Environment;
import com.Vytrack.base.TestBase;
import com.Vytrack.pages.javaScriptAlertsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class javaScriptAlerts extends TestBase {

    javaScriptAlertsPage js = new javaScriptAlertsPage();

    @Test
    @Environment(url = "url_12")
    public void testJavaScriptAlerts(){

        js.jsAlert1.click();

        driver.switchTo().alert().dismiss();

        String actual = js.result.getText();
        String expected = "You successfuly clicked an alert";
        System.out.println("Actual result "+actual);
        System.out.println("Expected result "+expected);

        System.out.println(actual.equals(expected));
        Assert.assertEquals(actual,expected);
        BrowserUtils.waitFor(2);
        js.jsAlert2.click();

        driver.switchTo().alert().accept();

        String actual2 = js.result.getText();
        String expected2 = "You clicked: Ok";
        System.out.println("Actual result "+actual2);
        System.out.println("Expected result "+expected2);

        System.out.println(actual2.equals(expected2));
        Assert.assertEquals(actual2,expected2);
        BrowserUtils.waitFor(2);
        js.jsAlert3.click();

        driver.switchTo().alert().sendKeys("Test Passed");
        driver.switchTo().alert().accept();
        String actual3 = js.result.getText();
        String expected3 = "You entered: Test Passed";
        System.out.println("Actual result "+actual3);
        System.out.println("Expected result "+expected3);

        System.out.println(actual3.equals(expected3));
        Assert.assertEquals(actual3,expected3);

        BrowserUtils.waitFor(2);
    }
}
