package com.Vytrack.testscripts;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.base.Environment;
import com.Vytrack.base.TestBase;
import com.Vytrack.pages.hoversPage;
import org.apache.poi.hssf.usermodel.HSSFPolygon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class hovers extends TestBase {
hoversPage hp = new hoversPage();


    @Test
    @Environment(url = "url_8")
    public void testHover(){



        List<WebElement> images = driver.findElements(By.tagName("img"));


        for (WebElement each:images) {

            BrowserUtils.waitFor(2);
            actions.moveToElement(each).perform();
            BrowserUtils.waitFor(2);

            String actualOne = hp.imgTextOne.getText();
            String expectedOne = "name: user1";

            if(hp.imgTextOne.isDisplayed()){
                System.out.println(actualOne);
                System.out.println(expectedOne);
                System.out.println(actualOne.equals(expectedOne));
                Assert.assertEquals(actualOne,expectedOne);
            }

            String actualTwo = hp.imgTextTwo.getText();
            String expectedTwo = "name: user2";

            if(hp.imgTextTwo.isDisplayed()){
                System.out.println(actualTwo);
                System.out.println(expectedTwo);
                System.out.println(actualTwo.equals(expectedTwo));
                Assert.assertEquals(actualTwo,expectedTwo);
            }

            String actualThree = hp.imgTextThree.getText();
            String expectedThree = "name: user3";

            if(hp.imgTextThree.isDisplayed()){
                System.out.println(actualThree);
                System.out.println(expectedThree);
                System.out.println(actualThree.equals(expectedThree));
                Assert.assertEquals(actualThree,expectedThree);
            }




        }












    }



}
