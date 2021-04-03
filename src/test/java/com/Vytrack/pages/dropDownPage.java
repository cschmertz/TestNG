package com.Vytrack.pages;

import com.Vytrack.Utilities.Driver;
import com.Vytrack.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dropDownPage {

    public dropDownPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "select[id='dropdown']")
    public WebElement dropDownMenu;

    @FindBy(css = "option[value='1']")
    public WebElement optionOne;

    @FindBy(css = "option[value='2']")
    public WebElement optionTwo;

    @FindBy(css = "select[id='year']")
    public WebElement yearDropDown;

    @FindBy(css = "option[value='1980']")
    public WebElement yearOption;

    @FindBy(css = "select[id='month']")
    public WebElement monthDropDown;

    @FindBy(css = "option[value='9']")
    public WebElement monthOption;

    @FindBy(css = "select[id='day']")
    public WebElement dayDropDown;

    @FindBy(css = "option[value='17']")
    public WebElement dayOption;

    @FindBy(css = "select[id='state']")
    public WebElement stateDropDown;

    @FindBy(css = "option[value='VA']")
    public WebElement stateOpt;

    @FindBy(css = "select[name='Languages']")
    public WebElement LanguageDropDown;

    @FindBy(css = "option[value='java']")
    public WebElement LanguageOpt;

    @FindBy(xpath = "//*[@id=\"dropdownMenuLink\"]")
    public WebElement websiteDropDown;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/a[1]")
    public WebElement urlOpt;

    @FindBy(css = "input[name='q']")
    public WebElement googleSearch;




}
