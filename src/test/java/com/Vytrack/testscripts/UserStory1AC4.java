package com.Vytrack.testscripts;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.Utilities.ConfigurationReader;
import com.Vytrack.Utilities.Driver;
import com.Vytrack.base.TestBase;
import com.Vytrack.pages.fleetPage;
import com.Vytrack.pages.loginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserStory1AC4 extends TestBase {

    loginPage login = new loginPage();
    fleetPage fp = new fleetPage();




    @Test
    public void testGridReset() {

        String username = ConfigurationReader.getProperty("username1");
        String password = ConfigurationReader.getProperty("password");
        login.login(username,password);

        BrowserUtils.waitFor(2);
        actions.moveToElement(fp.fleetTab).pause(2).moveToElement(fp.vehicleBtn).click().perform();
        BrowserUtils.waitFor(2);


        actions.moveToElement(fp.gridButton).click().perform();

        BrowserUtils.waitFor(2);

        actions.moveToElement(fp.idButton).click().perform();

        BrowserUtils.waitFor(2);

        Assert.assertTrue(fp.idCheckBox.isSelected(),"Id is selected");

        BrowserUtils.waitFor(2);

        actions.moveToElement(fp.closeButton).click().perform();

        BrowserUtils.waitFor(2);

        actions.moveToElement(fp.resetButton).click().perform();

        BrowserUtils.waitFor(2);

        actions.moveToElement(fp.gridButton).click().perform();

        BrowserUtils.waitFor(2);

        Assert.assertFalse(fp.idCheckBox.isSelected(),"Id is deselected");

        BrowserUtils.waitFor(2);







    }

}
