package com.Vytrack.testscripts;

import com.Vytrack.base.Environment;
import com.Vytrack.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class largeAndDeep extends TestBase {

    @Test
    @Environment(url = "url_14")
    public void testLargeDeep(){

        WebElement table = driver.findElement(By.id("large-table"));

        List<WebElement> largeTable = driver.findElements(By.tagName("tr"));

        for(WebElement row : largeTable){
            List<WebElement> cellData = row.findElements(By.tagName("td"));

            for(WebElement cell : cellData){
                System.out.println(cell.getText());
            }
        }
    }
}
