package com.Vytrack.testscripts;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.Utilities.ConfigurationReader;
import com.Vytrack.base.Environment;
import com.Vytrack.base.TestBase;
import com.Vytrack.pages.dynamicallyLoadedPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dynamicallyLoaded extends TestBase {

    dynamicallyLoadedPage dl = new dynamicallyLoadedPage();

    @Test
    @Environment(url ="url_1")
    public void testDynamicLoadingOne(){

        BrowserUtils.waitForClickablility(dl.startButton,10);
        actions.moveToElement(dl.startButton).click().perform();

        String username = ConfigurationReader.getProperty("username_Dynamic");
        String password = ConfigurationReader.getProperty("password_Dynamic");

        dl.loginDynamic(username,password);

        BrowserUtils.waitForVisibility(dl.successMessage,10);
        Assert.assertTrue(dl.successMessage.isDisplayed());
        System.out.println(dl.successMessage.getText());

        BrowserUtils.waitForClickablility(dl.logoutButton,10);
        actions.moveToElement(dl.logoutButton).click().perform();

        BrowserUtils.waitForVisibility(dl.logoutSuccessMessage,10);
        Assert.assertTrue(dl.logoutSuccessMessage.isDisplayed());
        System.out.println(dl.logoutSuccessMessage.getText());
    }

    @Test
    @Environment(url = "url_1")
    public void testNegativeLogin(){

        BrowserUtils.waitForClickablility(dl.startButton,10);
        actions.moveToElement(dl.startButton).click().perform();

        String username = "Whitey";
        String password = "MeatAndPotatoes";

        dl.loginDynamic(username,password);

        BrowserUtils.waitForVisibility(dl.loginFailedMessage,10);
        Assert.assertTrue(dl.loginFailedMessage.isDisplayed());
        System.out.println(dl.loginFailedMessage.getText());

    }

    @Test
    @Environment(url = "url_2")
    public void helloWorldTest(){

        BrowserUtils.waitForClickablility(dl.startButton,10);
        actions.moveToElement(dl.startButton).click().perform();

        BrowserUtils.waitForVisibility(dl.HelloWorld,10);
        Assert.assertTrue(dl.HelloWorld.isDisplayed());
        System.out.println(dl.HelloWorld.getText());
    }

    @Test
    @Environment(url = "url_3")
    public void testHelloWorldLogin(){


        String username = ConfigurationReader.getProperty("username_Dynamic");
        String password = ConfigurationReader.getProperty("password_Dynamic");

        dl.loginDynamic(username,password);

        BrowserUtils.waitForVisibility(dl.successMessage,10);
        Assert.assertTrue(dl.successMessage.isDisplayed());
        System.out.println(dl.successMessage.getText());

        BrowserUtils.waitForClickablility(dl.logoutButton,10);
        actions.moveToElement(dl.logoutButton).click().perform();

        BrowserUtils.waitForVisibility(dl.logoutSuccessMessage,10);
        Assert.assertTrue(dl.logoutSuccessMessage.isDisplayed());
        System.out.println(dl.logoutSuccessMessage.getText());
    }




}
