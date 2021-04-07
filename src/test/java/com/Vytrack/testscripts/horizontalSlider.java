package com.Vytrack.testscripts;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.base.Environment;
import com.Vytrack.base.TestBase;
import com.Vytrack.pages.horizontalSliderPage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class horizontalSlider extends TestBase {

    horizontalSliderPage hz = new horizontalSliderPage();

    @Test
    @Environment(url = "url_7")
    public void testHorizontalSlider(){
        //Slider is expected to move in 0.5 increments Up or Down
        BrowserUtils.waitFor(2);
        hz.slider.sendKeys(Keys.ARROW_RIGHT);
        BrowserUtils.waitFor(2);

        String actualVal = "0.5";
        String expectedVal = hz.range.getText();
        Assert.assertEquals(expectedVal,actualVal);
        System.out.println(actualVal.equals(expectedVal));
        System.out.println("Actual Value up is "+actualVal);
        System.out.println("Expected Value up is "+expectedVal);

        BrowserUtils.waitFor(2);
        hz.slider.sendKeys(Keys.ARROW_LEFT);
        BrowserUtils.waitFor(2);

        String actualValFinal = "0";
        String expectedValFinal = hz.range.getText();

        Assert.assertEquals(actualValFinal,expectedValFinal);
        System.out.println(actualValFinal.equals(expectedValFinal));
        System.out.println("Actual range down is "+actualValFinal);
        System.out.println("Expected range down is "+expectedValFinal);


    }


}
