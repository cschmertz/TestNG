package com.Vytrack.pages;

import com.Vytrack.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class hoversPage {

    public hoversPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "/html/body/div/div[2]/div/div/div[1]/div/h5")
    public WebElement imgTextOne;

    @FindBy(xpath = "/html/body/div/div[2]/div/div/div[2]/div/h5")
    public WebElement imgTextTwo;

    @FindBy(xpath = "/html/body/div/div[2]/div/div/div[3]/div/h5")
    public WebElement imgTextThree;






}
