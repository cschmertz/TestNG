package com.Vytrack.testscripts;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.base.Environment;
import com.Vytrack.base.TestBase;
import com.Vytrack.pages.inputsPage;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class inputs extends TestBase {

    inputsPage in =new inputsPage();

    @Test
    @Environment(url = "url_10")
    public void testInputs()throws Exception{
        BrowserUtils.waitFor(2);
        in.inputBox.sendKeys(Keys.UP);
        BrowserUtils.getScreenshot("testInputs");
        BrowserUtils.waitFor(2);
        in.inputBox.sendKeys(Keys.DOWN);
        BrowserUtils.getScreenshot("testInputs");
        BrowserUtils.waitFor(2);
    }
}
