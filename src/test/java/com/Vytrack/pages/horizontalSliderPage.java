package com.Vytrack.pages;

import com.Vytrack.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class horizontalSliderPage {
    public horizontalSliderPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "input[type='range']")
    public WebElement slider;

    @FindBy(css = "span[id='range']")
    public WebElement range;
}
