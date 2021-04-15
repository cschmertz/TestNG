package com.Vytrack.testscripts;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.base.Environment;
import com.Vytrack.base.TestBase;
import com.Vytrack.pages.ebayPage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ebay extends TestBase {

    ebayPage eb = new ebayPage();

    @Test
    @Environment(url = "url_17")
    public void testEbaySearch(){
        String actualPageTitle = driver.getTitle();
        System.out.println(actualPageTitle);
        String expectedPageTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
        System.out.println(expectedPageTitle);

        System.out.println(actualPageTitle.equals(expectedPageTitle));
        Assert.assertEquals(actualPageTitle,expectedPageTitle);

        eb.searchBox.click();
        BrowserUtils.waitFor(3);
        eb.searchBox.sendKeys("richard rogers", Keys.ENTER);
        BrowserUtils.waitFor(3);

        String actual = "Richard Rogers Slim";
        String expected = eb.OEMSlim.getText();
        System.out.println("Actual = "+actual);
        System.out.println("Expected = "+expected);
        System.out.println(actual.equals(expected));
        Assert.assertEquals(actual,expected);
        Assert.assertTrue(eb.OEMSlim.isDisplayed());

    }
}
