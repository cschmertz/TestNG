package com.Vytrack.pages;

import com.Vytrack.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JQueryUIPage {

    public JQueryUIPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "ui-id-3")
    public WebElement enabled;

    @FindBy(id = "ui-id-4")
    public WebElement downloads;

    @FindBy(xpath = "//*[@id='ui-id-5']")
    public WebElement pdf;
}
