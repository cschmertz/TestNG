package com.Vytrack.pages;

import com.Vytrack.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dynamicContentPage {

    public dynamicContentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "div[class='large-2 columns']")
    public WebElement imgOne;

    @FindBy(css = "img[src='/img/avatars/Original-Facebook-Geek-Profile-Avatar-1.jpg']")
    //@FindBy(xpath = "/html/body/div/div[2]/div/div/div/div/div[2]/div[1]/img[src='/img/avatars/Original-Facebook-Geek-Profile-Avatar-1.jpg']")
    public WebElement bigBaby;

    @FindBy(css = "img[src='/img/avatars/Original-Facebook-Geek-Profile-Avatar-2.jpg']")
    public WebElement mando;

    @FindBy(css = "img[src='/img/avatars/Original-Facebook-Geek-Profile-Avatar-3.jpg']")
    public WebElement punisher;

    @FindBy(css = "img[src='/img/avatars/Original-Facebook-Geek-Profile-Avatar-5.jpg']")
    public WebElement spaceGhost;

    @FindBy(css = "img[src='/img/avatars/Original-Facebook-Geek-Profile-Avatar-6.jpg']")
    public WebElement stormTrooper;

    @FindBy(xpath = "//*[@id='content']/div[1]/div[1]")
    public WebElement elementOne;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]")
    public WebElement elementTwo;

    @FindBy(xpath = "//*[@id='content']/div[3]/div[1]")
    public WebElement elementThree;
}

