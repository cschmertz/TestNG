package com.Vytrack.pages;

import com.Vytrack.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dragAndDropPage {

    public dragAndDropPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "div[id='column-a']")
    public WebElement boxA;

    @FindBy(css = "div[id='column-b']")
    public WebElement boxB;

    @FindBy(xpath = "//*[@id=\"draggable\"]")
    public WebElement draggable;

    @FindBy(xpath = "//*[@id=\"droppable\"]")
    public WebElement droppable;
}
