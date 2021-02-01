package com.Vytrack.testscripts;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.Utilities.ConfigurationReader;
import com.Vytrack.Utilities.Driver;
import com.Vytrack.base.TestBase;
import com.Vytrack.pages.fleetPage;
import com.Vytrack.pages.loginPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UserStory1AC4 extends TestBase {

    loginPage login = new loginPage();
    fleetPage fp = new fleetPage();

    @Test
    public void testGridReset() {

        String username = ConfigurationReader.getProperty("username1");
        String password = ConfigurationReader.getProperty("password");
        login.login(username,password);

        BrowserUtils.waitFor(3);
        actions.moveToElement(fp.fleetTab).pause(2).moveToElement(fp.vehicleBtn).click().perform();
        BrowserUtils.waitFor(3);

        Driver.getDriver().findElement(By.xpath("//*[@id=\"grid-custom-entity-grid-270689498\"]/div[2]/div[1]/div/div[3]/div[1]/div/div/a")).click();
       // actions.moveToElement(fp.refreshButton).click().perform();
        BrowserUtils.waitFor(3);



    }

}
