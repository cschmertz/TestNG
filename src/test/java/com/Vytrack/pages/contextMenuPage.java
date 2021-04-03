package com.Vytrack.pages;

import com.Vytrack.Utilities.Driver;
import com.Vytrack.testscripts.contextMenu;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contextMenuPage {


    public contextMenuPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "div[id='hot-spot']")
    public WebElement hotSpot;
}
