package com.Vytrack.pages;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.Utilities.Driver;
import com.Vytrack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class framesPage {

    public framesPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "frame[name='frame-left']")
    public WebElement leftFrame;

    @FindBy(css = "frame[name='frame-middle']")
    public WebElement middleFrame;

    @FindBy(css = "frame[name='frame-right']")
    public WebElement rightFrame;

    @FindBy(css = "frame[name='frame-bottom']")
    public WebElement bottomFrame;

    @FindBy(xpath = "/html/frameset/frame[1]")
    public WebElement frameTop;

    @FindBy(css = "iframe[id='mce_0_ifr']")
    public WebElement iframe;

    @FindBy(css = "body[id='tinymce']")
    public WebElement inputText;





}
