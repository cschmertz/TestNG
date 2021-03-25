package com.Vytrack.pages;

import com.Vytrack.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class autoCompletePage {

    public autoCompletePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "input[id='myCountry']")
    public WebElement countryField;

    @FindBy(css = "div[id='myCountryautocomplete-list']")
    public WebElement countryDropDown;

    @FindBy(xpath = "//*[@id=\"myCountryautocomplete-list\"]/div[1]")
    public WebElement Ugandabtn;

    @FindBy(css = "input[class='btn btn-primary']")
    public WebElement submitBtn;
}
