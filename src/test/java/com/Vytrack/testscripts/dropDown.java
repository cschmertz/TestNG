package com.Vytrack.testscripts;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.Utilities.Driver;
import com.Vytrack.base.Environment;
import com.Vytrack.base.TestBase;
import com.Vytrack.pages.dropDownPage;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class dropDown extends TestBase{
    dropDownPage dD = new dropDownPage();
    @Test
    @Environment(url = "url9")
    public void testDropDown(){
        BrowserUtils.waitFor(2);
        Select select = new Select(dD.dropDownMenu);

        select.selectByVisibleText("Option 1");

        String actualOpt = dD.optionOne.getText();
        String expectedOpt = "Option 1";
        System.out.println("actual Option = "+ actualOpt);
        System.out.println("expected Option = "+ expectedOpt);

        Assert.assertEquals(actualOpt,expectedOpt);
        System.out.println("------------------------");
        BrowserUtils.waitFor(2);
        Select dateYear = new Select(dD.yearDropDown);

        dateYear.selectByVisibleText("1980");

        String actualYear = dD.yearOption.getText();
        String expectedYear = "1980";
        System.out.println("actual Year = "+ actualYear);
        System.out.println("expected Year = "+ expectedYear);

        Assert.assertEquals(actualYear,expectedYear);
        System.out.println("------------------------");
        Select dateMonth = new Select(dD.monthDropDown);

        dateMonth.selectByVisibleText("October");

        String actualMonth = dD.monthOption.getText();
        String expectedMonth  = "October";
        System.out.println("actual Month = "+ actualMonth);
        System.out.println("expected Month = "+ expectedMonth);

        Assert.assertEquals(actualMonth,expectedMonth);
        System.out.println("------------------------");
        Select selectDay = new Select(dD.dayDropDown);

        selectDay.selectByVisibleText("17");

        String actualDay = dD.dayOption.getText();
        String expectedDay = "17";
        System.out.println("actual Day = "+ actualDay);
        System.out.println("expected Day = "+ expectedDay);

        Assert.assertEquals(actualDay,expectedDay);
        System.out.println("------------------------");
        Select selectState = new Select(dD.stateDropDown);

        selectState.selectByVisibleText("Virginia");

        String actualState = dD.stateOpt.getText();
        String expectedState = "Virginia";
        System.out.println("actual State = "+ actualState);
        System.out.println("expected State = "+expectedState);

        Assert.assertEquals(actualState,expectedState);
        System.out.println("------------------------");
        BrowserUtils.waitFor(2);
        Select selectLanguage = new Select(dD.LanguageDropDown);

        selectLanguage.selectByVisibleText("Java");

        String actualLanguage = dD.LanguageOpt.getText();
        String expectedLanguage = "Java";
        System.out.println("actual Language = "+ actualLanguage);
        System.out.println("expected Language = "+ expectedLanguage);

        Assert.assertEquals(actualLanguage,expectedLanguage);
        System.out.println("------------------------");
        BrowserUtils.waitFor(2);

        actions.moveToElement(dD.websiteDropDown).click().perform();

        actions.moveToElement(dD.urlOpt).click().perform();

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.google.com/";

        System.out.println("actual Url = "+ actualUrl);
        System.out.println("expected Url = "+ expectedUrl);

        Assert.assertEquals(actualUrl,expectedUrl);

        dD.googleSearch.sendKeys("DROP-DOWN TEST PASSED");

        BrowserUtils.waitFor(2);







    }
}
