package com.Vytrack.testscripts;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.base.Environment;
import com.Vytrack.base.TestBase;
import com.Vytrack.pages.dynamicControlPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dynamicControl extends TestBase {

        dynamicControlPage dcp = new dynamicControlPage();


   @Test
   @Environment(url = "url11")
   public void testDynamicControl(){
       BrowserUtils.waitForClickablility(dcp.checkBoxA,10);
       actions.moveToElement(dcp.checkBoxA).click().perform();
       BrowserUtils.waitForClickablility(dcp.removeButton,10);
       actions.moveToElement(dcp.removeButton).click().perform();
       BrowserUtils.waitForVisibility(dcp.itsGone,10);
       Assert.assertTrue(dcp.itsGone.isDisplayed());
       System.out.println("It's Gone Baby");


   }

   @Test
    @Environment(url = "url11")
    public void testDynamicButtons(){

       BrowserUtils.waitForClickablility(dcp.enableButton,10);
       actions.moveToElement(dcp.enableButton).click().perform();
       BrowserUtils.waitForVisibility(dcp.itsEnabled,10);
       String text = dcp.itsEnabled.getText();
       Assert.assertEquals(dcp.itsEnabled.getText(),text);
       System.out.println(dcp.itsEnabled.equals(text));

       BrowserUtils.waitFor(2);
       actions.moveToElement(dcp.textField).click().perform();
       actions.moveToElement(dcp.textField).sendKeys("Test Passed").perform();
       BrowserUtils.waitFor(2);
   }


}
