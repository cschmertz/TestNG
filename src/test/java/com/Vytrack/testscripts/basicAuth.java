package com.Vytrack.testscripts;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.Utilities.ConfigurationReader;
import com.Vytrack.base.TestBase;
import com.Vytrack.pages.basicAuthPage;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class basicAuth extends TestBase {

    basicAuthPage ba = new basicAuthPage();

    @Test
    public void testBasicAuth(){

        driver.get(ConfigurationReader.getProperty("url3"));

        BrowserUtils.waitFor(3);

        Assert.assertTrue(ba.Validation.isDisplayed());



    }


}
