package com.Vytrack.testscripts;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.Utilities.ConfigurationReader;
import com.Vytrack.base.Environment;
import com.Vytrack.base.TestBase;
import com.Vytrack.pages.disappearingElementsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class disappearingElements extends TestBase {

    disappearingElementsPage de = new disappearingElementsPage();

    @Test
    @Environment(url = "url6")
    public void testDisappearingElements(){

        BrowserUtils.waitForVisibility(de.Elements,10);

        WebElement elems = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul"));
        List<WebElement> elem = elems.findElements(By.tagName("a"));


        for(int i=0;i<=elem.size();i++){

            BrowserUtils.waitFor(1);
           if(driver.findElements(By.xpath("//*[@id=\"content\"]/div/ul/li[5]/a")).isEmpty()){
               driver.navigate().refresh();
           }

        }
        Assert.assertTrue(de.dissElem.isDisplayed());
        System.out.println(de.dissElem.isDisplayed());
        System.out.println("Element is displayed");

        String actual = de.dissElem.getText();
        System.out.println(actual);
        String expected = "Gallery";
        System.out.println(expected);

        Assert.assertEquals(actual,expected);






    }





    @Test
    @Environment(url = "url6")
    public void testGallery(){


        BrowserUtils.waitFor(1);
        do {
            driver.navigate().refresh();
        } while (driver.findElements(By.xpath("//*[@id='content']/div/ul/li[5]/a")).isEmpty());

        Assert.assertTrue(de.dissElem.isDisplayed());

        System.out.println(de.dissElem.isDisplayed());
    }


}
