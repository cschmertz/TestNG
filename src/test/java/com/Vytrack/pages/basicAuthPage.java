package com.Vytrack.pages;

import com.Vytrack.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class basicAuthPage {

    public basicAuthPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "div[id='content']")
    public WebElement Validation;
}
