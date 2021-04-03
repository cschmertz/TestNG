package com.Vytrack.pages;

import com.Vytrack.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class disappearingElementsPage {

    public disappearingElementsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"content\"]/div/ul")
    public WebElement Elements;

    @FindBy(xpath = "//*[@id=\"content\"]/div/ul/li[5]/a")
    public WebElement dissElem;


}
