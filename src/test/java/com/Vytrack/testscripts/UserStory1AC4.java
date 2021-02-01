package com.Vytrack.testscripts;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.Utilities.ConfigurationReader;
import com.Vytrack.base.TestBase;
import com.Vytrack.pages.fleetPage;
import com.Vytrack.pages.loginPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UserStory1AC4 extends TestBase {

    loginPage login = new loginPage();
    fleetPage fp = new fleetPage();

    @Test
    public void testGridReset() throws InterruptedException {

        String username = ConfigurationReader.getProperty("driver_username");
        String password = ConfigurationReader.getProperty("driver_password");
        login.login(username,password);

        BrowserUtils.waitFor(3);
        actions.moveToElement(fp.fleetTab).pause(2).moveToElement(fp.vehicleBtn).click().perform();
        BrowserUtils.waitFor(5);

        actions.moveToElement(fp.gridButton).click().perform();
        Thread.sleep(2000);



    }

}
