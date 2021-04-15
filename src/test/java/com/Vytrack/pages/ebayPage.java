package com.Vytrack.pages;

import com.Vytrack.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.jvm.hotspot.debugger.Page;

public class ebayPage {

    public ebayPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "input[type='text']")
    public WebElement searchBox;

    @FindBy(css = "h3[class='s-item__title']")
    public WebElement OEMSlim;
}
