package com.Vytrack.pages;

import com.Vytrack.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class downloadPage {

    public downloadPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "a[href='download/textfile.txt']")
    public WebElement downloadTextFile;
}
