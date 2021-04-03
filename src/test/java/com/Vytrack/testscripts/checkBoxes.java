package com.Vytrack.testscripts;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.Utilities.ConfigurationReader;
import com.Vytrack.Utilities.Driver;
import com.Vytrack.base.TestBase;
import com.Vytrack.pages.checkBoxesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.lang.annotation.Annotation;
import java.util.List;

public class checkBoxes extends TestBase {

    checkBoxesPage cb = new checkBoxesPage();




    @Test
    public void testCheckBoxes(){

        url=ConfigurationReader.getProperty("url4");

        driver.get(url);

        BrowserUtils.waitForClickablility(cb.checkBox,10);

        WebElement CB = driver.findElement(By.cssSelector("form[id='checkboxes']"));

        List<WebElement> elem = CB.findElements(By.tagName("input"));

        for (WebElement each:elem) {
            if(!each.isSelected()){
                each.click();
                System.out.println("CheckBox 1 has been Selected ");
                Assert.assertTrue(cb.checkBoxOption1.isSelected());
            }else{
                each.click();
                System.out.println("CheckBox 2 has been deSelected");
                Assert.assertTrue(!cb.checkBoxOption2.isSelected());
            }
        }

        BrowserUtils.waitFor(3);
    }

    @Test
    public void testCheckBoxTest2(){

        driver.get(ConfigurationReader.getProperty("url4"));

        BrowserUtils.waitForClickablility(cb.checkBox,10);

        actions.moveToElement(cb.checkBoxOption1).click().perform();
        actions.moveToElement(cb.checkBoxOption2).click().perform();

        Assert.assertTrue(cb.checkBoxOption1.isSelected());
        Assert.assertFalse(cb.checkBoxOption2.isSelected());


    }



}
