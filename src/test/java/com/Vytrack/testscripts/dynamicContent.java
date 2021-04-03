package com.Vytrack.testscripts;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.base.Environment;
import com.Vytrack.base.TestBase;
import com.Vytrack.pages.dynamicContentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class dynamicContent extends TestBase {

   dynamicContentPage dc = new dynamicContentPage();

    @Test
    @Environment(url = "url10")
    public void testDynamicMario(){

        do {
            try{
                Assert.assertTrue(dc.bigBaby.isDisplayed());
            }catch (Exception e){

            }
            driver.navigate().refresh();
        }while(driver.findElements(By.cssSelector("img[src='/img/avatars/Original-Facebook-Geek-Profile-Avatar-1.jpg']")).isEmpty());

        BrowserUtils.waitFor(3);
        Assert.assertTrue(dc.bigBaby.isDisplayed());
        System.out.println("Element is displayed");
    }



}
