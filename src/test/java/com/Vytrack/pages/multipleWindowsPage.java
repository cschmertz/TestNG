package com.Vytrack.pages;

import com.Vytrack.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class multipleWindowsPage {

    public multipleWindowsPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "a[href='/windows/new']")
    public WebElement link;

    @FindBy(xpath = "/html/body/div/h3")
    public WebElement newWindow;

    @FindBy(xpath = "//*[@id=\"content\"]/div/h3")
    public WebElement HomePage;
}
