package com.Vytrack.testscripts;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.base.Environment;
import com.Vytrack.base.TestBase;
import com.Vytrack.pages.largeAndDeepPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class largeAndDeep extends TestBase {

    largeAndDeepPage lp = new largeAndDeepPage();

    @Test
    @Environment(url = "url_14")
    public void testLargeDeep(){

        WebElement table = driver.findElement(By.id("large-table"));

        List<WebElement> largeTable = table.findElements(By.tagName("tr"));

        for(WebElement row : largeTable){
            List<WebElement> cellData = row.findElements(By.tagName("td"));

            for(WebElement cell : cellData){
                System.out.println(cell.getText());

                String actual = lp.value.getText();
                String expected = "1.1";
                if(lp.value.isDisplayed()){
                    System.out.println("Actual value is "+actual);
                    System.out.println("Expected value is "+expected);
                    Assert.assertTrue(lp.value.isDisplayed());
                    Assert.assertEquals(actual,expected);
                }

            }
        }




    }
}
