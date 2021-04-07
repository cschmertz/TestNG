package com.Vytrack.testscripts;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.base.Environment;
import com.Vytrack.base.TestBase;
import com.Vytrack.pages.keyPressesPage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class keyPresses extends TestBase {

    keyPressesPage kp = new keyPressesPage();

    @Test
    @Environment(url = "url_13")
    public void testKeyPresses(){

        actions.sendKeys(Keys.ENTER).perform();
        BrowserUtils.waitFor(2);
        String actual = kp.result.getText();
        System.out.println("Actual result = "+actual);
        String expected = "You entered: ENTER";
        System.out.println("Expected result = "+expected);
        BrowserUtils.waitFor(2);
        System.out.println(actual.equals(expected));
        Assert.assertEquals(actual,expected);


    }
}
