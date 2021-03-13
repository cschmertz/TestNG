package com.Vytrack.pages;

import com.Vytrack.Utilities.ConfigurationReader;
import com.Vytrack.Utilities.Driver;
import com.Vytrack.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class fleetPage {





    public fleetPage(){PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(xpath = "//span[@class='title title-level-1']")
    public WebElement fleetTab;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[3]/a/span")
    public WebElement vehicleBtn;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[5]/a/span")
    //@FindBy(css="span[class='title title-level-2']")
    public WebElement vehicleCostBtn;

    @FindBy(xpath = "//*[@id=\"grid-custom-entity-grid-2058013302\"]/div[2]/div[2]/div[2]/div/table")
    public WebElement tableVehicleInfo;

    @FindBy(css="a[title='Reset']")
    public WebElement resetButton;

    @FindBy(css="i[class='fa-cog hide-text']")
    public WebElement gridButton;

    @FindBy(xpath = "//*[@id=\"column-c209\"]")
    public WebElement idRadioButton;

    @FindBy(xpath = "//*[@id=\"grid-custom-entity-grid-1647653884\"]/div[2]/div[2]/div[2]/div/table/tbody/tr[1]")
    public WebElement cellData;

    @FindBy(css = "label[for='column-c111']")
    public WebElement idButton;

    @FindBy(css="span[class='close']")
    public WebElement closeButton;

    @FindBy(css="input[id='column-c111']")
    public WebElement idCheckBox;





}
