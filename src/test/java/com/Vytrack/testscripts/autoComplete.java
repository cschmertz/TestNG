package com.Vytrack.testscripts;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.Utilities.ConfigurationReader;
import com.Vytrack.Utilities.Driver;
import com.Vytrack.base.TestBase;
import com.Vytrack.pages.autoCompletePage;
import com.sun.corba.se.pept.transport.ByteBufferPool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class autoComplete extends TestBase {

    autoCompletePage acp = new autoCompletePage();


    @Test
    public void testAutoComplete(){

        driver.get(ConfigurationReader.getProperty("url2"));


        BrowserUtils.waitFor(3);

        acp.countryField.sendKeys("U");

        BrowserUtils.waitFor(3);

        WebElement drpDwn = driver.findElement(By.cssSelector("div[id='myCountryautocomplete-list']"));

        List<WebElement> cty = drpDwn.findElements(By.tagName("div"));

        for (WebElement each:cty) {
            System.out.println(each.getText());
            if(each.getText().contains("U")){
                System.out.println("Autocomplete is turned On");
            }
            Assert.assertTrue(each.getText().contains("U"),"Autocomplete is turned Off");

        }



















    }
}
