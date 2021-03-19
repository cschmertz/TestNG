package com.Vytrack.testscripts;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.Utilities.ConfigurationReader;
import com.Vytrack.Utilities.Driver;
import com.Vytrack.base.TestBase;
import com.Vytrack.pages.fleetPage;
import com.Vytrack.pages.loginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class testCase4 extends TestBase {


    loginPage login = new loginPage();
    fleetPage fp = new fleetPage();

    @Test
    public void accessVehicleOdometerPage(){
        String username = ConfigurationReader.getProperty("username1");
        String password = ConfigurationReader.getProperty("password");
        BrowserUtils.waitForClickablility(login.LoginButton,10);
        login.login(username,password);


        BrowserUtils.waitForVisibility(fp.fleetTab,10);
        actions.moveToElement(fp.fleetTab).pause(2).moveToElement(fp.vehicleOdometer).click().perform();

        WebElement vehicleOdometerTable = Driver.getDriver().findElement(By.xpath("//table"));

        List<WebElement> rowData = vehicleOdometerTable.findElements(By.tagName("tr"));

        for(WebElement row : rowData){
            List<WebElement> cellData = row.findElements(By.tagName("td"));

            for(WebElement cell : cellData){
                System.out.println(cell.getText());
            }
        }

        Assert.assertFalse(rowData.isEmpty(),"List is empty");


    }
}
