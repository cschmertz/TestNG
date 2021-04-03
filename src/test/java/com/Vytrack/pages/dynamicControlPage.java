package com.Vytrack.pages;

import com.Vytrack.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dynamicControlPage {
    public dynamicControlPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "input[type='checkbox']")
    public WebElement checkBoxA;

    @FindBy(css = "button[type='button']")
    public WebElement removeButton;

    @FindBy(css = "p[id='message']")
    public WebElement itsGone;

    @FindBy(css = "p[id='message']")
    public WebElement itsEnabled;

    @FindBy(xpath = "//*[@id='input-example']/button")
    public WebElement enableButton;

    @FindBy(css = "input[type='text']")
    public WebElement textField;


}
