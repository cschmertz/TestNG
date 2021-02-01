package com.Vytrack.pages;

import com.Vytrack.Utilities.Driver;
import org.openqa.selenium.By;
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
    public WebElement vehicleCostBtn;

    @FindBy(xpath = "//*[@id=\"grid-custom-entity-grid-2058013302\"]/div[2]/div[2]/div[2]/div/table")
    public WebElement tableVehicleInfo;

    @FindBy(xpath = "//*[@id=\"grid-custom-entity-grid-305451835\"]/div[2]/div[1]/div/div[3]/div[1]/div/a[3]/i")
    public WebElement refreshButton;

    @FindBy(xpath = "//*[@id=\"grid-custom-entity-grid-270689498\"]/div[2]/div[1]/div/div[3]/div[1]/div/div/a")
    public WebElement gridButton;

    @FindBy(xpath = "//*[@id=\"column-c209\"]")
    public WebElement idRadioButton;





}
