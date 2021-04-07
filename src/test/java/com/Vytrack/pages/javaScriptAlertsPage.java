package com.Vytrack.pages;

import com.Vytrack.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class javaScriptAlertsPage {

    public javaScriptAlertsPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='content']/div/button[1]")
    public WebElement jsAlert1;

    @FindBy(xpath = "//*[@id='content']/div/button[2]")
    public WebElement jsAlert2;

    @FindBy(xpath = "//*[@id='content']/div/button[3]")
    public WebElement jsAlert3;

    @FindBy(id = "result")
    public WebElement result;


}
