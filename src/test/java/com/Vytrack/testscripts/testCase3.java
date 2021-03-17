package com.Vytrack.testscripts;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.Utilities.ConfigurationReader;
import com.Vytrack.base.TestBase;
import com.Vytrack.pages.fleetPage;
import com.Vytrack.pages.loginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase3 extends TestBase {

    loginPage login = new loginPage();
    fleetPage fp = new fleetPage();

    @Test
    public void testGridReset() {

        String username = ConfigurationReader.getProperty("username1");
        String password = ConfigurationReader.getProperty("password");
        login.login(username,password);

        actions.moveToElement(fp.fleetTab).perform();
        BrowserUtils.waitForVisibility(fp.vehicleBtn,10);
        actions.moveToElement(fp.vehicleBtn).click().perform();

        BrowserUtils.waitForVisibility(fp.gridButton,10);
        actions.moveToElement(fp.gridButton).click().perform();

        BrowserUtils.waitForClickablility(fp.idButton,10);
        actions.moveToElement(fp.idButton).click().perform();

        Assert.assertTrue(fp.idCheckBox.isSelected(),"ID is selected");

        BrowserUtils.waitForClickablility(fp.closeButton,10);
        actions.moveToElement(fp.closeButton).click().perform();

        BrowserUtils.waitForClickablility(fp.resetButton,10);
        actions.moveToElement(fp.resetButton).click().perform();

        BrowserUtils.waitForClickablility(fp.gridButton,10);
        actions.moveToElement(fp.gridButton).click().perform();

        Assert.assertFalse(fp.idCheckBox.isSelected(),"ID is deselected");

    }

}
