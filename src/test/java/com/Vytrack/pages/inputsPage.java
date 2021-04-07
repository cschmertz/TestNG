package com.Vytrack.pages;

import com.Vytrack.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class inputsPage {

    public inputsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "input[type='number']")
    public WebElement inputBox;
}
